package org.jimmer.repository

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.transaction.Transactional
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.jimmer.domain.Role

/**
 * @author jhlz
 * @since 2024/4/17 14:21
 * @version x.x.x
 */
@ApplicationScoped
class RoleRepository @Inject constructor(val sqlClient: KSqlClient) {

    @Transactional
    fun addRole(role: Role) =
        sqlClient.save(role).originalEntity

    fun getRoleById(id: Long) = sqlClient.findById(Role::class, id)

    fun deleteRoleById(id: Long) = sqlClient.deleteById(Role::class, id)
}