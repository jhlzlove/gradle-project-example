package org.jimmer.domain

import org.babyfish.jimmer.sql.*
import java.time.LocalDateTime

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
interface Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long
    @IdView
    val parentId: Long?
    val name: String
    val code: String
    val createTime: LocalDateTime?


    /**
     * 自关联的树
     */
    @ManyToOne
    @JoinColumn( foreignKeyType = ForeignKeyType.FAKE)
    val parent: Category?
    @OneToMany(mappedBy = "parent")
    val childs: List<Category>
}