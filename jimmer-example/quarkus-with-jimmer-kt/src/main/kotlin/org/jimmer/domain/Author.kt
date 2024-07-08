package org.jimmer.domain

import org.babyfish.jimmer.sql.*

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_author")
interface Author: BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    @Key
    val username: String

    val age: Int

    val gender: String

    val address: String?

    @ManyToMany
    @JoinTable(
        name = "author_book",
        joinColumnName = "author_id",
        inverseJoinColumnName = "book_id"
    )
    val books: List<Book>
}