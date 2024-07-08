package org.jimmer.domain

import org.babyfish.jimmer.sql.*

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_store")
interface Store : BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    val storeName: String

    @OneToMany(mappedBy = "store")
    val books: List<Book>
}