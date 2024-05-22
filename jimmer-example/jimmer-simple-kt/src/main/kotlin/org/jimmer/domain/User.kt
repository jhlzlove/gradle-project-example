package org.jimmer.domain

import org.babyfish.jimmer.sql.*
import java.time.LocalDate
import java.time.LocalDateTime

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_test")
interface User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int
    val username: String
    val gender: String

    val birthday: LocalDate?
    val address: String?
    val createTime: LocalDateTime?
    val updateTime: LocalDateTime?
    val remark: String?
}