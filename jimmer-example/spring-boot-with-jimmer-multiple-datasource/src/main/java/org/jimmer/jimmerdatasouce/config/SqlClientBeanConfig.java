package org.jimmer.jimmerdatasouce.config;

import org.babyfish.jimmer.sql.JSqlClient;
import org.babyfish.jimmer.sql.runtime.ConnectionManager;
import org.babyfish.jimmer.sql.runtime.DatabaseValidationMode;
import org.babyfish.jimmer.sql.runtime.Executor;
import org.babyfish.jimmer.sql.runtime.SqlFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author jhlz
 * @version x.x.x
 */
@Configuration
public class SqlClientBeanConfig {

    final DataSource ds1;
    final DataSource ds2;

    public SqlClientBeanConfig(@Qualifier("ds1") DataSource ds1,
                               @Qualifier("ds2") DataSource ds2) {
        this.ds1 = ds1;
        this.ds2 = ds2;
    }

    @Bean
    public JSqlClient sq1() {
        return JSqlClient.newBuilder()
                .setConnectionManager(
                        ConnectionManager.simpleConnectionManager(ds1)
                )
                .setExecutor(Executor.log())
                .setSqlFormatter(SqlFormatter.PRETTY)
                .setDatabaseValidationMode(DatabaseValidationMode.NONE)
                .build();
    }

    @Bean
    public JSqlClient sq2() {
        return JSqlClient.newBuilder()
                .setConnectionManager(
                        ConnectionManager.simpleConnectionManager(ds2)
                )
                // 实体和数据库没有映射关系时给出警告而不是停止运行
                .setDatabaseValidationMode(DatabaseValidationMode.WARNING)
                .build();
    }
}
