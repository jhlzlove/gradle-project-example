plugins {
    alias(libs.plugins.ksp)
    alias(libs.plugins.kotlin.jvm)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    ksp(libs.jimmer.ksp)
    implementation(libs.jimmer.sql.kotlin)
    implementation(libs.logback.classic)
    implementation(libs.kotlin.reflect)
    runtimeOnly(libs.postgresql)
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

