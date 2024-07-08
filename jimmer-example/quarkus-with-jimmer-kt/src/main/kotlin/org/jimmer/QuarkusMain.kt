package org.jimmer

import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.annotations.QuarkusMain

/**
 * 自定义主类入口
 */
@QuarkusMain
open class QuarkusMain

fun main(args: Array<String>) {
    Quarkus.run(*args)
    // 如果启动 listener
    // 如果你把这句话放在上面，启动时将会输出两次。
    // 但如果你把这句话放下面，关闭时将会输出两次
    // 这么神奇的东西不试试？？？
    // 好吧，其实是 StartupEvent 和 ShutdownEvent 的声明周期的问题啦
    println("url prefix: http://localhost:7789")
}