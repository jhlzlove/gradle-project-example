plugins {
    java
    alias(libs.plugins.quarkus)
    alias(libs.plugins.ksp)
    alias(libs.plugins.kotlin.jvm)
}

repositories {
    mavenCentral()
    mavenLocal()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}

dependencies {
    // 应用jimmer的ksp代码生成器
    ksp(libs.jimmer.ksp)
    implementation(libs.jimmer.sql.kotlin)

    implementation(enforcedPlatform(libs.quarkus.platform))
    implementation(libs.bundles.quarkus)
    testImplementation(libs.bundles.quarkus.test)
}

/**
 * jimmer 和 quarkus 使用时会有循环依赖
 * https://github.com/babyfish-ct/jimmer/discussions/353
 */
project.afterEvaluate {
    getTasksByName("quarkusGenerateCode", true).forEach { task ->
        task.setDependsOn(
            task.dependsOn.filterIsInstance<Provider<Task>>().filter { it.get().name != "processResources" })
    }
    getTasksByName("quarkusGenerateCodeDev", true).forEach { task ->
        task.setDependsOn(
            task.dependsOn.filterIsInstance<Provider<Task>>().filter { it.get().name != "processResources" })
    }
}