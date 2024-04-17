package org.jimmer.config

import io.agroal.api.AgroalDataSource
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.inject.Singleton
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.newKSqlClient
import org.babyfish.jimmer.sql.runtime.DatabaseValidationMode
import org.babyfish.jimmer.sql.runtime.Executor
import org.babyfish.jimmer.sql.runtime.SqlFormatter

/**
 * sqlClient 配置，最重要是配置 ConnectionManager
 *
 * https://babyfish-ct.github.io/jimmer-doc/zh/docs/configuration/connection-manager
 *
 * @author jhlz
 * @since 2024/4/17 12:04
 * @version x.x.x
 */
@ApplicationScoped
class SqlClientConfig @Inject constructor(val dataSource: AgroalDataSource) {

    /**
     * 自定义项目中 sqlClient
     */
    @Singleton
    fun sqlClient(): KSqlClient = newKSqlClient {
        setConnectionManager {
            // 从 AgroalDataSource 获取连接
            val conn = dataSource.connection
            conn.use {
                proceed(conn)
            }
        }
        // sql 语句输出
        setExecutor(Executor.log())
        setSqlFormatter(SqlFormatter.PRETTY)
        // 验证实体与数据库的关联关系
        setDatabaseValidationMode(DatabaseValidationMode.ERROR)
    }

}