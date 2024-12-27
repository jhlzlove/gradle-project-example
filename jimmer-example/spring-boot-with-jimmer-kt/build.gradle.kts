plugins {
    java
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.boot.management)
    alias(libs.plugins.ksp)
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.plugin.spring)
}

group = "org.jimmer"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.jimmer.spring.boot)
    ksp(libs.jimmer.ksp)
    runtimeOnly(libs.postgresql)
    implementation(libs.bundles.spring.boot)
    implementation(libs.kotlin.reflect)
    implementation(libs.kotlin.jackson)
    testImplementation(libs.spring.boot.starter.test)
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.test {
    useJUnitPlatform()
}
