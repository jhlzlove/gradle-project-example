package org.example

import org.babyfish.jimmer.client.EnableImplicitApi
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableImplicitApi
class JimmerExampleApplication

fun main(args: Array<String>) {
    runApplication<JimmerExampleApplication>(*args)
    println("http://localhost:7788/openapi.html")
}

