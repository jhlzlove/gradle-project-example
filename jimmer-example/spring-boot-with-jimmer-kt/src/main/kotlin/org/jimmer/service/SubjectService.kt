package org.jimmer.service

import org.babyfish.jimmer.Page
import org.babyfish.jimmer.kt.isLoaded
import org.babyfish.jimmer.kt.new
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.ast.expression.eq
import org.babyfish.jimmer.sql.kt.ast.expression.isNull
import org.jimmer.domain.*
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.Instant

/**
 * @author jhlz
 * @version x.x.x
 */
@Service
class SubjectService(val sqlClient: KSqlClient) {

    fun page(): Page<Subject> {
        return sqlClient.createQuery(Subject::class) {
            where(table.delete eq 0)
            select(table)
        }.fetchPage(0, 10)
    }

    fun listTree(): List<Subject> {
        return sqlClient.createQuery(Subject::class) {
            where(table.parentId.isNull())
            where(table.delete eq 0)
            select(table.fetchBy {
                allScalarFields()
                createTime(false)
                delete(false)
                `childs*`()
            })
        }.execute()
    }

    @Transactional
    fun add(subject: Subject): Boolean {
        val target = new(Subject::class).by {
            name = subject.name
            // 没有使用自定义
            code = when (isLoaded(subject, Subject::code)) {
                true -> subject.code
                false -> Instant.now().toEpochMilli().toString()
            }
            parentId = when (isLoaded(subject, Subject::parentId)) {
                true -> subject.parentId
                false -> null
            }
        }
        return sqlClient.save(target).isRowAffected
    }

    @Transactional
    fun delete(id: Long): Int {
        return sqlClient.deleteById(Subject::class, id).totalAffectedRowCount
    }
}