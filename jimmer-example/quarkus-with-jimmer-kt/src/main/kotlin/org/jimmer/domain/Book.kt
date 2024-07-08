package org.jimmer.domain

import org.babyfish.jimmer.sql.*

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_book")
interface Book : BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    val bookName: String

    @Key
    val bookCode: String

    @ManyToMany(mappedBy = "books")
    val authors: List<Author>

    /**
     * 基于中间表的多对一
     */
    @ManyToOne
    @JoinTable(
        name = "store_book",
        joinColumnName = "book_id",
        inverseJoinColumnName = "store_id"
    )
    val store: Store?
}