rootProject.name = "gradle-project-example"

include(":spring-boot-with-jimmer-kt")
include(":spring-boot-with-jimmer")
include(":jimmer-simple-kt")
include(":base-code")
include(":sb-4")

project(":jimmer-simple-kt").projectDir = File("jimmer-example/jimmer-simple-kt")
project(":spring-boot-with-jimmer-kt").projectDir = File("jimmer-example/spring-boot-with-jimmer-kt")
project(":spring-boot-with-jimmer").projectDir = File("jimmer-example/spring-boot-with-jimmer")
