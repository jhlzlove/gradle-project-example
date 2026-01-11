package org.jimmer.domain

import org.babyfish.jimmer.sql.MappedSuperclass
import java.time.LocalDateTime

/**
 * @author jhlz
 * @version x.x.x
 */
@MappedSuperclass
interface CreateBaseEntity {
    val createTime: LocalDateTime?
}