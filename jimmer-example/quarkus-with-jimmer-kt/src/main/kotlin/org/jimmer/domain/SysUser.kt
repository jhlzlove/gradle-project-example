package org.jimmer.domain

import org.babyfish.jimmer.sql.*

/**
 * @author jhlz
 * @date 2024/2/29 14:40
 * @since x.x.x
 */
@Entity
interface SysUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int
    val username: String
    val  password: String

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumnName = "user_id",
            inverseJoinColumnName = "role_id",
    )
    val roles: List<Role>
}