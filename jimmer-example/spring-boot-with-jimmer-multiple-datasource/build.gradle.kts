plugins {
    java
    alias(libs.plugins.sb)
    alias(libs.plugins.sbm)
}

group = "org.jimmer"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}
dependencies {
    annotationProcessor(libs.jimmer.apt)
    implementation(libs.bundles.spring.boot)
    implementation(libs.kotlin.stdlib.jdk8)
    compileOnly(libs.lombok)
    runtimeOnly(libs.postgresql)
    testImplementation(libs.spring.boot.starter.test)
}

