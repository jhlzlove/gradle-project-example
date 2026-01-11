plugins {
    java
    alias(libs.plugins.sb)
    alias(libs.plugins.sbm)
    alias(libs.plugins.ksp)
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.plugin.spring)
}

group = "org.jimmer"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(libs.jimmer.spring.boot)
    ksp(libs.jimmer.ksp)
    runtimeOnly(libs.postgresql)
    implementation(libs.spring.boot.starter.web)
    implementation(libs.spring.boot.starter.data.redis)
    implementation(libs.jimmer.spring.boot)
    implementation(libs.kotlin.reflect)
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
