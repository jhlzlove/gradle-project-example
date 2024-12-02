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
