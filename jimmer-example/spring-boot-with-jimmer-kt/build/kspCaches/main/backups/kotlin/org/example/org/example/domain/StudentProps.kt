@file:Suppress(
    "RedundantVisibilityModifier",
    "Unused",
)
@file:GeneratedBy(type = Student::class)

package org.example.org.example.domain

import java.time.LocalDateTime
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import org.babyfish.jimmer.`internal`.GeneratedBy
import org.babyfish.jimmer.kt.toImmutableProp
import org.babyfish.jimmer.meta.TypedProp
import org.babyfish.jimmer.sql.ast.Selection
import org.babyfish.jimmer.sql.kt.ast.expression.KNonNullExpression
import org.babyfish.jimmer.sql.kt.ast.expression.KNonNullPropExpression
import org.babyfish.jimmer.sql.kt.ast.expression.KNullablePropExpression
import org.babyfish.jimmer.sql.kt.ast.table.KNonNullProps
import org.babyfish.jimmer.sql.kt.ast.table.KNonNullTable
import org.babyfish.jimmer.sql.kt.ast.table.KNonNullTableEx
import org.babyfish.jimmer.sql.kt.ast.table.KNullableProps
import org.babyfish.jimmer.sql.kt.ast.table.KNullableTable
import org.babyfish.jimmer.sql.kt.ast.table.KNullableTableEx
import org.babyfish.jimmer.sql.kt.ast.table.KProps
import org.babyfish.jimmer.sql.kt.ast.table.KRemoteRef
import org.babyfish.jimmer.sql.kt.ast.table.KTableEx
import org.babyfish.jimmer.sql.kt.ast.table.`impl`.KRemoteRefImplementor
import org.babyfish.jimmer.sql.kt.fetcher.newFetcher

public val KNonNullProps<Student>.userId: KNonNullPropExpression<Long>
    get() = get<Long>(StudentProps.USER_ID.unwrap()) as KNonNullPropExpression<Long>

public val KNullableProps<Student>.userId: KNullablePropExpression<Long>
    get() = get<Long>(StudentProps.USER_ID.unwrap()) as KNullablePropExpression<Long>

public val KProps<Student>.createTime: KNullablePropExpression<LocalDateTime>
    get() = get<LocalDateTime>(StudentProps.CREATE_TIME.unwrap()) as
            KNullablePropExpression<LocalDateTime>

public val KProps<Student>.updateTime: KNullablePropExpression<LocalDateTime>
    get() = get<LocalDateTime>(StudentProps.UPDATE_TIME.unwrap()) as
            KNullablePropExpression<LocalDateTime>

public val KProps<Student>.createBy: KNullablePropExpression<String>
    get() = get<String>(StudentProps.CREATE_BY.unwrap()) as KNullablePropExpression<String>

public val KProps<Student>.updateBy: KNullablePropExpression<String>
    get() = get<String>(StudentProps.UPDATE_BY.unwrap()) as KNullablePropExpression<String>

public val KProps<Student>.remark: KNullablePropExpression<String>
    get() = get<String>(StudentProps.REMARK.unwrap()) as KNullablePropExpression<String>

public val KNonNullProps<Student>.firstName: KNonNullPropExpression<String>
    get() = get<String>(StudentProps.FIRST_NAME.unwrap()) as KNonNullPropExpression<String>

public val KNullableProps<Student>.firstName: KNullablePropExpression<String>
    get() = get<String>(StudentProps.FIRST_NAME.unwrap()) as KNullablePropExpression<String>

public val KNonNullProps<Student>.lastName: KNonNullPropExpression<String>
    get() = get<String>(StudentProps.LAST_NAME.unwrap()) as KNonNullPropExpression<String>

public val KNullableProps<Student>.lastName: KNullablePropExpression<String>
    get() = get<String>(StudentProps.LAST_NAME.unwrap()) as KNullablePropExpression<String>

public val KNonNullProps<Student>.gender: KNonNullPropExpression<Gender>
    get() = get<Gender>(StudentProps.GENDER.unwrap()) as KNonNullPropExpression<Gender>

public val KNullableProps<Student>.gender: KNullablePropExpression<Gender>
    get() = get<Gender>(StudentProps.GENDER.unwrap()) as KNullablePropExpression<Gender>

public
        fun KProps<Student>.courseIds(block: KNonNullTableEx<Course>.() -> KNonNullExpression<Boolean>?):
        KNonNullExpression<Boolean>? = exists(StudentProps.COURSE_IDS.unwrap(), block)

public val KTableEx<Student>.courseIds: KNonNullTableEx<Course>
    get() = join(StudentProps.COURSE_IDS.unwrap())

public val KTableEx<Student>.`courseIds?`: KNullableTableEx<Course>
    get() = outerJoin(StudentProps.COURSE_IDS.unwrap())

public val KRemoteRef.NonNull<Student>.userId: KNonNullPropExpression<Long>
    get() = (this as KRemoteRefImplementor<*>).id<Long>() as KNonNullPropExpression<Long>

public val KRemoteRef.Nullable<Student>.userId: KNullablePropExpression<Long>
    get() = (this as KRemoteRefImplementor<*>).id<Long>() as KNullablePropExpression<Long>

public fun KNonNullTable<Student>.fetchBy(block: StudentFetcherDsl.() -> Unit): Selection<Student> =
        fetch(newFetcher(Student::class).`by`(block))

public fun KNullableTable<Student>.fetchBy(block: StudentFetcherDsl.() -> Unit): Selection<Student?>
        = fetch(newFetcher(Student::class).`by`(block))

public object StudentProps {
    public val USER_ID: TypedProp.Scalar<Student, Long> =
            TypedProp.scalar(Student::userId.toImmutableProp())

    public val CREATE_TIME: TypedProp.Scalar<Student, LocalDateTime?> =
            TypedProp.scalar(Student::createTime.toImmutableProp())

    public val UPDATE_TIME: TypedProp.Scalar<Student, LocalDateTime?> =
            TypedProp.scalar(Student::updateTime.toImmutableProp())

    public val CREATE_BY: TypedProp.Scalar<Student, String?> =
            TypedProp.scalar(Student::createBy.toImmutableProp())

    public val UPDATE_BY: TypedProp.Scalar<Student, String?> =
            TypedProp.scalar(Student::updateBy.toImmutableProp())

    public val REMARK: TypedProp.Scalar<Student, String?> =
            TypedProp.scalar(Student::remark.toImmutableProp())

    public val FIRST_NAME: TypedProp.Scalar<Student, String> =
            TypedProp.scalar(Student::firstName.toImmutableProp())

    public val LAST_NAME: TypedProp.Scalar<Student, String> =
            TypedProp.scalar(Student::lastName.toImmutableProp())

    public val GENDER: TypedProp.Scalar<Student, Gender> =
            TypedProp.scalar(Student::gender.toImmutableProp())

    public val FULL_NAME: TypedProp.Scalar<Student, String> =
            TypedProp.scalar(Student::fullName.toImmutableProp())

    public val COURSE_IDS: TypedProp.ReferenceList<Student, Course> =
            TypedProp.referenceList(Student::courseIds.toImmutableProp())
}
