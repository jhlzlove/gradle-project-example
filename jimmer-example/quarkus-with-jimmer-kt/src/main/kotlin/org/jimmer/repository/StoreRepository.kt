package org.jimmer.repository

import jakarta.enterprise.context.ApplicationScoped
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.jimmer.domain.Store

/**
 * @author jhlz
 * @version x.x.x
 */
@ApplicationScoped
class StoreRepository(private val sqlClient: KSqlClient) {

    fun add(store: Store) = sqlClient.save(store)
}