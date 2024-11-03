plugins {
    alias(libs.plugins.ksp)
    kotlin("jvm") version libs.versions.kotlinVersion
}

group = "org.jimmer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.logback.classic)
    // ksp
    ksp(libs.jimmer.ksp)
    implementation(libs.jimmer.sql.kotlin)
    // 数据库
    runtimeOnly(libs.postgresql)
    implementation(libs.kotlin.reflect)
    testImplementation(kotlin("test"))
}

// 将生成的代码添加到编译路径中。
// 没有这个配置，gradle命令仍然可以正常执行，
// 但是, Intellij无法找到生成的源码。
kotlin {
    sourceSets.main {
        kotlin.srcDir("build/generated/ksp/main/kotlin")
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}


tasks.test {
    useJUnitPlatform()

}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
    }
}

