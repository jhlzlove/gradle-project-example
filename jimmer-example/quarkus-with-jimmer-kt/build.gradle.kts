plugins {
    java
    id("io.quarkus")
    alias(libs.plugins.ksp)
    kotlin("jvm") version "1.9.22"
}

group = "org.jimmer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project
dependencies {
    // 应用jimmer的ksp代码生成器
    ksp(libs.jimmer.ksp)
    implementation(libs.jimmer.sql.kotlin)

    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-rest")
    implementation("io.quarkus:quarkus-rest-jackson")
    implementation("io.quarkus:quarkus-agroal")
    implementation("io.quarkus:quarkus-narayana-jta:3.9.3")
    implementation("io.quarkus:quarkus-jdbc-postgresql")
    implementation("io.quarkus:quarkus-arc")

    implementation("io.quarkus:quarkus-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.rest-assured:rest-assured")
}

// 将生成的代码添加到编译路径中。
// 没有这个配置，gradle命令仍然可以正常执行，
// 但是, Intellij无法找到生成的源码。
kotlin {
    sourceSets.main {
        kotlin.srcDir("build/generated/ksp/main/kotlin")
    }
}

/**
 * jimmer 和 quarkus 使用时会有循环依赖
 * https://github.com/babyfish-ct/jimmer/discussions/353
 */
project.afterEvaluate {
    getTasksByName("quarkusGenerateCode", true).forEach { task ->
        task.setDependsOn(task.dependsOn.filterIsInstance<Provider<Task>>().filter { it.get().name != "processResources" })
    }
    getTasksByName("quarkusGenerateCodeDev", true).forEach { task ->
        task.setDependsOn(task.dependsOn.filterIsInstance<Provider<Task>>().filter { it.get().name != "processResources" })
    }
}