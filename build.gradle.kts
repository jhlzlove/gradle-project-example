plugins {
    `java-library`
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    pluginManager.apply("java-library")

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(25)
        }
    }
}