package org.jimmer.listener

import io.quarkus.runtime.StartupEvent
import jakarta.enterprise.event.Observes

/**
 * 每次请求开始执行
 * Quarkus 程序启动时执行 @Startup 也可以用在类上，同时如果类上只有 @Startup，则 @ApplicationScoped 会自动添加
 *
 * @author jhlz
 * @version x.x.x
 */
// @ApplicationScoped
class StartListener {

    /**
     * 使用注解和使用 StartupEvent 参数二选一
     */
    // @Startup
    fun onStart(@Observes startup: StartupEvent) {
        println("潮水啊！我已归来！")
    }
}