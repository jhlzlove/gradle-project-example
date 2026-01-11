package org.springboot.boot4.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jhlz
 * @version x.x.x
 */
@Configuration
public class WebmvcConfig implements WebMvcConfigurer {

    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        // usePathSegment 的 index 是请求的 {version} 的位置索引，从 0 开始
        configurer.usePathSegment(0)
                .setDefaultVersion("1.0");
    }
}
