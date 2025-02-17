plugins {
    java
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.boot.management)
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
    implementation(libs.jimmer.spring.boot)
    implementation(libs.spring.boot.starter.web)
    compileOnly(libs.lombok)
    runtimeOnly(libs.postgresql)
    testImplementation(libs.spring.boot.starter.test)
}

