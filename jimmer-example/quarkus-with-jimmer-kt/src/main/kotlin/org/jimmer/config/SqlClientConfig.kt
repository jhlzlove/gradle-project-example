package org.jimmer.config

import io.agroal.api.AgroalDataSource
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Singleton
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.newKSqlClient
import org.babyfish.jimmer.sql.runtime.DatabaseValidationMode
import org.babyfish.jimmer.sql.runtime.Executor
import org.babyfish.jimmer.sql.runtime.SqlFormatter
import org.jimmer.interceptor.AuditInterceptor

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
class SqlClientConfig(
    private val dataSource: AgroalDataSource,
    private val auditInterceptor: AuditInterceptor,
) {

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
        // 全部使用伪外键
        setForeignKeyEnabledByDefault(false)
        // 添加拦截器
        addDraftInterceptor(auditInterceptor)
        // 验证实体与数据库的关联关系，有错误直接报错 阻止程序运行
        setDatabaseValidationMode(DatabaseValidationMode.ERROR)
    }

}