package org.jimmer.domain;

import org.babyfish.jimmer.Formula
import org.babyfish.jimmer.sql.*
import java.time.LocalDateTime

/**
 * 学生信息
 * @author jhlz
 * @since 2024/4/16 9:54
 * @version x.x.x
 */
@Entity
interface Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    @Key
    val firstName: String

    @Key
    val lastName: String

    val age: Int?

    val gender: Gender

    val createTime: LocalDateTime?

    /**
     * 简单计算属性，获取全名
     */
    @Formula(dependencies = ["firstName", "lastName"])
    val fullName: String get() = "$firstName$lastName"

    @LogicalDeleted("1")
    @Column(name = "is_delete")
    val delete: Int
}