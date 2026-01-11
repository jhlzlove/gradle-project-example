package org.jimmer.config

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import javax.sql.DataSource

/**
 *
 * @author jhlz
 * @version x.x.x
 */
@Configuration
class DataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.ds1")
    fun dsp1() = DataSourceProperties()

    @Bean
    @ConfigurationProperties("spring.datasource.ds2")
    fun dsp2() = DataSourceProperties()

    @Bean
    @Primary
    fun ds1(): DataSource {
        return dsp1().initializeDataSourceBuilder().build()
    }

    @Bean
    fun ds2(): DataSource? = dsp2().initializeDataSourceBuilder().build()
}