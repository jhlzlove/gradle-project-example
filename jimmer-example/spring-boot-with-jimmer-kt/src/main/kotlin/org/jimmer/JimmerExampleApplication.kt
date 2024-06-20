package org.jimmer

import org.babyfish.jimmer.client.EnableImplicitApi
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
// 启用 Jimmer 的客户端能力，为客户端生成代码、远程错误等
@EnableImplicitApi
class JimmerExampleApplication

fun main(args: Array<String>) {
    runApplication<JimmerExampleApplication>(*args)
    println("http://localhost:7788/openapi.html")
}

