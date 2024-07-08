package org.jimmer.listener

import io.quarkus.runtime.ShutdownEvent
import jakarta.enterprise.event.Observes

/**
 * 每次请求结束执行
 * @author jhlz
 * @version x.x.x
 */
// @ApplicationScoped
class ShutdownListener {

    /**
     * 使用注解和使用 ShutdownEvent 参数二选一
     */
    // @Shutdown
    fun onShutdown(@Observes shutdown: ShutdownEvent) {
        println("那年春 除却花开不是真")
    }
}