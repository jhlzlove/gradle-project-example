plugins {
    java
    alias(libs.plugins.sb)
    alias(libs.plugins.sbm)
}

group = "org.jimmer"
version = "1.0-SNAPSHOT"

dependencies {
    annotationProcessor(libs.jimmer.apt)
    annotationProcessor(libs.lombok)
    implementation(libs.lombok)
    implementation(libs.jimmer.spring.boot)
    runtimeOnly(libs.postgresql)
    implementation(libs.spring.boot.starter.web)
    implementation(libs.spring.boot.starter.data.redis)
    testImplementation(libs.spring.boot.starter.test)
}
