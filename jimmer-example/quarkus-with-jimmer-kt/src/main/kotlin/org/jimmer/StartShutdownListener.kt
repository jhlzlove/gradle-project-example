package org.jimmer

import io.quarkus.runtime.Shutdown
import io.quarkus.runtime.ShutdownEvent
import io.quarkus.runtime.Startup
import io.quarkus.runtime.StartupEvent
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.event.Observes

/**
 * @author jhlz
 * @version x.x.x
 */
@ApplicationScoped
class StartShutdownListener {

    /**
     * 启动时执行
     * Startup 也可以用在类上，同时如果类上只有 @Startup，则 @ApplicationScoped 会自动添加
     */
    @Startup
    fun onStart(@Observes startup: StartupEvent) {
        println("啊哈哈哈哈，潮水啊！我已归来！")
    }

    /**
     * 关闭时执行
     */
    @Shutdown
    fun onShutdown(@Observes shutdown: ShutdownEvent) {
        println("噢，不！")
    }
}