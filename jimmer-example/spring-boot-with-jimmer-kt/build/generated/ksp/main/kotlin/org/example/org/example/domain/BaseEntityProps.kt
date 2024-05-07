@file:Suppress(
    "RedundantVisibilityModifier",
    "Unused",
)
@file:GeneratedBy(type = org.example.org.example.domain.BaseEntity::class)

package org.example.org.example.domain

import java.time.LocalDateTime
import kotlin.String
import kotlin.Suppress
import org.babyfish.jimmer.`internal`.GeneratedBy
import org.babyfish.jimmer.kt.toImmutableProp
import org.babyfish.jimmer.meta.TypedProp
import org.babyfish.jimmer.sql.kt.ast.expression.KNullablePropExpression
import org.babyfish.jimmer.sql.kt.ast.table.KProps

@GeneratedBy(type = BaseEntity::class)
public val KProps<BaseEntity>.createTime: KNullablePropExpression<LocalDateTime>
    get() = get<LocalDateTime>(BaseEntityProps.CREATE_TIME.unwrap()) as
            KNullablePropExpression<LocalDateTime>

@GeneratedBy(type = BaseEntity::class)
public val KProps<BaseEntity>.updateTime: KNullablePropExpression<LocalDateTime>
    get() = get<LocalDateTime>(BaseEntityProps.UPDATE_TIME.unwrap()) as
            KNullablePropExpression<LocalDateTime>

@GeneratedBy(type = BaseEntity::class)
public val KProps<BaseEntity>.createBy: KNullablePropExpression<String>
    get() = get<String>(BaseEntityProps.CREATE_BY.unwrap()) as KNullablePropExpression<String>

@GeneratedBy(type = BaseEntity::class)
public val KProps<BaseEntity>.updateBy: KNullablePropExpression<String>
    get() = get<String>(BaseEntityProps.UPDATE_BY.unwrap()) as KNullablePropExpression<String>

@GeneratedBy(type = BaseEntity::class)
public val KProps<BaseEntity>.remark: KNullablePropExpression<String>
    get() = get<String>(BaseEntityProps.REMARK.unwrap()) as KNullablePropExpression<String>

@GeneratedBy(type = BaseEntity::class)
public object BaseEntityProps {
    public val CREATE_TIME: TypedProp.Scalar<BaseEntity, LocalDateTime?> =
            TypedProp.scalar(BaseEntity::createTime.toImmutableProp())

    public val UPDATE_TIME: TypedProp.Scalar<BaseEntity, LocalDateTime?> =
            TypedProp.scalar(BaseEntity::updateTime.toImmutableProp())

    public val CREATE_BY: TypedProp.Scalar<BaseEntity, String?> =
            TypedProp.scalar(BaseEntity::createBy.toImmutableProp())

    public val UPDATE_BY: TypedProp.Scalar<BaseEntity, String?> =
            TypedProp.scalar(BaseEntity::updateBy.toImmutableProp())

    public val REMARK: TypedProp.Scalar<BaseEntity, String?> =
            TypedProp.scalar(BaseEntity::remark.toImmutableProp())
}
