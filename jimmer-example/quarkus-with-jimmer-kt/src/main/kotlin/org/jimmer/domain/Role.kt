package org.jimmer.domain

import org.babyfish.jimmer.sql.*
import java.time.LocalDateTime

/**
 * @author jhlz
 * @since 2024/4/17 13:48
 * @version x.x.x
 */
@Entity
@Table(name = "tb_role")
interface Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val roleId: Long

    val roleName: String
    val roleCode: String
    val createTime: LocalDateTime?
    val updateTime: LocalDateTime?
    val remark: String?

    /**
     * 状态0正常，1停用
     */
    val status: Int
}