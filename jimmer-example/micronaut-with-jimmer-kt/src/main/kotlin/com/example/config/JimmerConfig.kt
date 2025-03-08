package com.example.config

import io.micronaut.context.annotation.Factory
import jakarta.inject.Singleton
import org.babyfish.jimmer.sql.dialect.PostgresDialect
import org.babyfish.jimmer.sql.kt.newKSqlClient
import org.babyfish.jimmer.sql.runtime.ConnectionManager
import org.babyfish.jimmer.sql.runtime.Executor
import org.babyfish.jimmer.sql.runtime.SqlFormatter
import java.sql.DriverManager

/**
 * @author jhlz
 * @version x.x.x
 */
@Factory
class JimmerConfig {

    @Singleton
    fun sqlClient() = newKSqlClient {
        setExecutor(Executor.log())
        setSqlFormatter(SqlFormatter.PRETTY)
        setDialect(PostgresDialect.INSTANCE)
        setConnectionManager {
            val conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_jimmer?currentSchema=public&serverTimezone=Asia/Shanghai", "postgres", "postgres")
            ConnectionManager.singleConnectionManager(conn).execute {
                proceed(it)
            }
        }
    }
}