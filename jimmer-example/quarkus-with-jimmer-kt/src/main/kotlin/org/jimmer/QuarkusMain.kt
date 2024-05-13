package org.jimmer

import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.annotations.QuarkusMain

/**
 * 自定义主类入口
 */
@QuarkusMain
open class QuarkusMain

fun main(args: Array<String>) {
    println("http://localhost:7789")
    Quarkus.run(*args)
}