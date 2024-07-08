package org.jimmer.jimmerdatasouce.config;

import org.babyfish.jimmer.spring.SqlClients;
import org.babyfish.jimmer.spring.transaction.JimmerTransactionManager;
import org.babyfish.jimmer.spring.transaction.TransactionalSqlClients;
import org.babyfish.jimmer.sql.JSqlClient;
import org.babyfish.jimmer.sql.runtime.ConnectionManager;
import org.babyfish.jimmer.sql.runtime.DatabaseValidationMode;
import org.babyfish.jimmer.sql.runtime.Executor;
import org.babyfish.jimmer.sql.runtime.SqlFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * 该类主要配置多数据源事务
 * @author jhlz
 * @version x.x.x
 */
@Configuration
public class SqlClientConfig {

    @Bean("tm1")
    public PlatformTransactionManager tm1(ApplicationContext ctx, @Qualifier("ds1") DataSource dataSource) {
        return new JimmerTransactionManager(SqlClients.java(ctx, dataSource, null));
    }

    @Bean("tm2")
    public PlatformTransactionManager tm2(ApplicationContext ctx, @Qualifier("ds2") DataSource dataSource) {
        return new JimmerTransactionManager(SqlClients.java(ctx, dataSource, null));
    }

    @Bean
    public JSqlClient sqlClient() {
        return TransactionalSqlClients.java();
    }

}
