package org.jimmer.jimmerdatasouce.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Spring 多数据源配置
 * 使用 DataSourceProperties 主要是读取的配置项中的 url 字段，不使用 DataSourceProperties 默认读取的是 jdbcUrl
 * @author jhlz
 * @version x.x.x
 */
@Configuration
public class DataSourceConfig {

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.ds1")
    public DataSourceProperties dp1() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.ds1.hikari")
    public HikariDataSource ds1() {
        return dp1().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.ds2")
    public DataSourceProperties dp2() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.ds2.hikari")
    public HikariDataSource ds2() {
        return dp2().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }
}
