rootProject.name = "gradle-project-example"

include(":spring-boot-with-jimmer-kt")
include(":quarkus-with-jimmer-kt")
include(":spring-boot-with-jimmer-multiple-datasource")
include(":jimmer-simple-kt")
include(":base-code")
include(":micronaut-with-jimmer-kt")

project(":spring-boot-with-jimmer-multiple-datasource").projectDir =
    File("jimmer-example/spring-boot-with-jimmer-multiple-datasource")
project(":jimmer-simple-kt").projectDir = File("jimmer-example/jimmer-simple-kt")
project(":spring-boot-with-jimmer-kt").projectDir = File("jimmer-example/spring-boot-with-jimmer-kt")

project(":quarkus-with-jimmer-kt").projectDir = File("jimmer-example/quarkus-with-jimmer-kt")
project(":micronaut-with-jimmer-kt").projectDir = File("jimmer-example/micronaut-with-jimmer-kt")

pluginManagement {
    val quarkusPluginVersion: String by settings
    val quarkusPluginId: String by settings
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
    plugins {
        id(quarkusPluginId) version quarkusPluginVersion
    }
}
