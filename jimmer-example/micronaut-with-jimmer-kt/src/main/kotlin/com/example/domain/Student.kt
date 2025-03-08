package com.example.domain;

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
@Table(name = "db_student")
interface Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    @Key
    val firstName: String

    @Key
    val lastName: String

    val collegeId: Long?

    val gender: String

    /**
     * 简单计算属性，获取全名
     */
    @Formula(dependencies = ["firstName", "lastName"])
    val fullName: String get() = "$firstName$lastName"

    val birthday: LocalDateTime?

    @LogicalDeleted("2")
    @Column(name = "is_delete")
    val delete: Int

}