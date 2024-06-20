package org.jimmer.org.jimmer.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


/**
 * @author jhlz
 * @version x.x.x
 */
@Configuration
class WebConfig: WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowCredentials(false) // 所有头
            .allowedHeaders("/**") // 所有源
            .allowedOrigins("/**") // 所有方法
            .allowedMethods("/**")
            .maxAge(5000)
    }
}