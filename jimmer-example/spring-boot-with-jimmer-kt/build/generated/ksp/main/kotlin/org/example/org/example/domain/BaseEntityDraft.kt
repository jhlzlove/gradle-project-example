@file:Suppress(
    "RedundantVisibilityModifier",
    "Unused",
)

package org.example.org.example.domain

import java.time.LocalDateTime
import kotlin.String
import kotlin.Suppress
import org.babyfish.jimmer.Draft
import org.babyfish.jimmer.`internal`.GeneratedBy
import org.babyfish.jimmer.kt.DslScope
import org.babyfish.jimmer.meta.ImmutablePropCategory
import org.babyfish.jimmer.meta.ImmutableType

@DslScope
@GeneratedBy(type = BaseEntity::class)
public interface BaseEntityDraft : BaseEntity, Draft {
    override var createTime: LocalDateTime?

    override var updateTime: LocalDateTime?

    override var createBy: String?

    override var updateBy: String?

    override var remark: String?

    @GeneratedBy(type = BaseEntity::class)
    public object `$` {
        public val type: ImmutableType = ImmutableType
                    .newBuilder(
                        "0.8.130",
                        BaseEntity::class,
                        listOf(

                        ),
                        null
                    )
                    .add(-1, "createTime", ImmutablePropCategory.SCALAR, LocalDateTime::class.java,
                            true)
                    .add(-1, "updateTime", ImmutablePropCategory.SCALAR, LocalDateTime::class.java,
                            true)
                    .add(-1, "createBy", ImmutablePropCategory.SCALAR, String::class.java, true)
                    .add(-1, "updateBy", ImmutablePropCategory.SCALAR, String::class.java, true)
                    .add(-1, "remark", ImmutablePropCategory.SCALAR, String::class.java, true)
                    .build()
    }
}
