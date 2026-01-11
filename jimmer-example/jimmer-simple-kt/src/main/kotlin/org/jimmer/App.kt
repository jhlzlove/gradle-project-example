package org.jimmer

import org.babyfish.jimmer.sql.dialect.PostgresDialect
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.newKSqlClient
import org.babyfish.jimmer.sql.runtime.DatabaseValidationMode
import org.babyfish.jimmer.sql.runtime.DefaultDatabaseNamingStrategy
import org.babyfish.jimmer.sql.runtime.Executor
import org.babyfish.jimmer.sql.runtime.SqlFormatter
import org.jimmer.domain.Gender
import org.jimmer.domain.Student
import java.sql.Connection
import java.sql.DriverManager
import java.time.LocalDateTime

/**
 * @author jhlz
 * @version x.x.x
 */
fun main() {
    val sqlClient = sqlClient()
    val user = Student {
        firstName = "Columbina"
        lastName = "Hyposelenia"
        gender = Gender.GIRL
        age = 16
        createTime = LocalDateTime.now()
    }

    sqlClient.save(user)

    val list = sqlClient.createQuery(Student::class) {
        select(table)
    }.execute()

    list.forEach { println(it) }
}

fun connect(): Connection {
    val url = "jdbc:postgresql://localhost:5432/db_jimmer?currentSchema=school"
    val username = "postgres"
    val password = "postgres"
    return DriverManager.getConnection(url, username, password)
}

fun sqlClient(): KSqlClient = newKSqlClient {
    // 打印 SQL 并自动美化
    setExecutor(Executor.log())
    setSqlFormatter(SqlFormatter.PRETTY)
    // 设置连接管理
    setConnectionManager {
        connect().use {
            proceed(it)
        }
    }
    // 指定数据库方言
    setDialect(PostgresDialect())
    // 数据库与实体验证，验证失败直接抛出错误，程序无法运行
    setDatabaseValidationMode(DatabaseValidationMode.ERROR)
    // 数据库命名策略，默认大写
    setDatabaseNamingStrategy(DefaultDatabaseNamingStrategy.LOWER_CASE)
}
