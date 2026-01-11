package org.jimmer

import org.babyfish.jimmer.client.EnableImplicitApi
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
// 启用 Jimmer 的客户端能力，为客户端生成代码、远程错误等
@EnableImplicitApi
class JimmerExampleApplication

fun main(args: Array<String>) {
    val context = runApplication<JimmerExampleApplication>(*args)
    val env = context.environment
    val port = env.getProperty("server.port")
    println("http://localhost:${port}/openapi.html")
}
