package org.jimmer.domain

import org.babyfish.jimmer.sql.*
import java.time.LocalDateTime

/**
 * @author jhlz
 * @date 2024/2/29 14:41
 * @since x.x.x
 */
@Entity
interface Role {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int
    val roleName: String
    val roleCode: String
    val createBy: String?
    val updateBy: String?
    val createTime: LocalDateTime?
    val updateTime: LocalDateTime?

    @ManyToMany(mappedBy = "roles")
    val users :List<SysUser>
}