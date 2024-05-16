package org.jimmer.domain

import org.babyfish.jimmer.sql.MappedSuperclass
import java.time.LocalDateTime

/**
 * 公用实体
 * @author jhlz
 * @since 2024/4/16 9:59
 * @version x.x.x
 */
@MappedSuperclass
interface BaseEntity {
    val createTime: LocalDateTime?
    val updateTime: LocalDateTime?
    val createBy: String?
    val updateBy: String?
    val remark: String?
}