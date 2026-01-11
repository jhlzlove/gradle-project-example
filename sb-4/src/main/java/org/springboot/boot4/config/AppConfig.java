package org.springboot.boot4.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jhlz
 * @version x.x.x
 */
@ConfigurationProperties(prefix = "app")
public record AppConfig(String name, String version, String desc, String icon) {
}
