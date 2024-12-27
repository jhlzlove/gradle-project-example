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
    implementation(libs.logback.classic)
    // ksp
    ksp(libs.jimmer.ksp)
    implementation(libs.jimmer.sql.kotlin)
    // 数据库
    runtimeOnly(libs.postgresql)
    implementation(libs.kotlin.reflect)
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

