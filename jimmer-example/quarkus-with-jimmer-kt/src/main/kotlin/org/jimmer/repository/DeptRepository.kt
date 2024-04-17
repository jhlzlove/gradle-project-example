package org.jimmer.repository

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.transaction.Transactional
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.jimmer.domain.Dept

/**
 * @author jhlz
 * @since 2024/4/17 13:53
 * @version x.x.x
 */
@ApplicationScoped
class DeptRepository @Inject constructor(private val sqlClient: KSqlClient) {

    @Transactional
    fun addDept(dept: Dept) : Dept {
        return sqlClient.save(dept).originalEntity
    }

}