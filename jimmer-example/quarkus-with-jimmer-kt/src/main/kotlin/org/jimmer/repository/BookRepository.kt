package org.jimmer.repository

import jakarta.enterprise.context.ApplicationScoped
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.jimmer.domain.Book

/**
 * @author jhlz
 * @version x.x.x
 */
@ApplicationScoped
class BookRepository(private val sqlClient: KSqlClient) {

    fun add(book: Book) {
       sqlClient.save(book)
    }
}