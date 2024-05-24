import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    java
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.boot.management)
    alias(libs.plugins.ksp)
    kotlin("jvm") version "2.0.0"
    kotlin("plugin.spring") version "2.0.0"
}

group = "org.jimmer"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    // jimmer spring boot starter
    implementation(libs.jimmer.spring.boot)
    // ksp
    ksp(libs.jimmer.ksp)
    // 数据库
    runtimeOnly(libs.postgresql)
    // Spring Boot
    implementation(libs.spring.boot)
    implementation(libs.spring.boot.starter.web)
    implementation(libs.kotlin.reflect)
    implementation(libs.kotlin.jackson)
    testImplementation(libs.spring.boot.starter.test)
}

// 将生成的代码添加到编译路径中。
// 没有这个配置，gradle命令仍然可以正常执行，
// 但是, Intellij无法找到生成的源码。
kotlin {
    sourceSets.main {
        kotlin.srcDir("build/generated/ksp/main/kotlin")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "21"
    }
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

