package org.springboot.boot4;

import org.springboot.boot4.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(AppConfig.class)
@SpringBootApplication
public class Sb4Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb4Application.class, args);
    }

}
