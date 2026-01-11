package org.jimmer.config

import org.babyfish.jimmer.spring.SqlClients
import org.babyfish.jimmer.spring.transaction.JimmerTransactionManager
import org.babyfish.jimmer.spring.transaction.TransactionalSqlClients
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.PlatformTransactionManager
import javax.sql.DataSource

/**
 * jimmer 多数据源配置
 * @author jhlz
 * @version x.x.x
 */
@Configuration
class SqlClientConfig {
    @Bean
    fun tm1(
        ctx: ApplicationContext,
        @Qualifier("ds1") dataSource: DataSource
    ): PlatformTransactionManager =
        JimmerTransactionManager(
            SqlClients.kotlin(ctx, dataSource, null)
        )

    @Bean
    fun tm2(
        ctx: ApplicationContext,
        @Qualifier("ds2") dataSource: DataSource
    ): PlatformTransactionManager =
        JimmerTransactionManager(
            SqlClients.kotlin(ctx, dataSource, null)
        )

    @Bean
    fun sqlClient(): KSqlClient = TransactionalSqlClients.kotlin()
}