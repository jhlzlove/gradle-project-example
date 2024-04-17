package org.jimmer.domain

import org.babyfish.jimmer.sql.*

/**
 * @author jhlz
 * @since 2024/4/17 13:48
 * @version x.x.x
 */
@Entity
@Table(name = "tb_dept")
interface Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val deptId: Long
    val deptName: String
    val leaderId: Int?

    val roleId: Int?
}