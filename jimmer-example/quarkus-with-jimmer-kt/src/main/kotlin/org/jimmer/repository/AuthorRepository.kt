package org.jimmer.repository

import jakarta.enterprise.context.ApplicationScoped
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.jimmer.domain.Author

/**
 * @author jhlz
 * @version x.x.x
 */
@ApplicationScoped
class AuthorRepository(private val sqlClient: KSqlClient) {

    fun addOrUpdate(author: Author) = sqlClient.entities.save(author)
}