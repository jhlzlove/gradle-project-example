package org.jimmer.domain

import org.babyfish.jimmer.sql.MappedSuperclass
import java.time.LocalDateTime

/**
 * @author jhlz
 * @version x.x.x
 */
@MappedSuperclass
interface BaseEntity {

    val createTime: LocalDateTime

    val updateTime: LocalDateTime

    val createBy: String?

    val updateBy: String?
}