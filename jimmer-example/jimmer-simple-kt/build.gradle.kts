plugins {
    alias(libs.plugins.ksp)
    alias(libs.plugins.kotlin.jvm)
}

group = "org.jimmer"
version = "0.1"

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