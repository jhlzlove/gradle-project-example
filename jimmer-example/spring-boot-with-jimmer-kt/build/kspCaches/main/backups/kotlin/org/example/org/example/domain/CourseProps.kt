@file:Suppress(
    "RedundantVisibilityModifier",
    "Unused",
)
@file:GeneratedBy(type = org.example.org.example.domain.Course::class)

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

@GeneratedBy(type = Course::class)
public val KNonNullProps<Course>.courseId: KNonNullPropExpression<Long>
    get() = get<Long>(CourseProps.COURSE_ID.unwrap()) as KNonNullPropExpression<Long>

@GeneratedBy(type = Course::class)
public val KNullableProps<Course>.courseId: KNullablePropExpression<Long>
    get() = get<Long>(CourseProps.COURSE_ID.unwrap()) as KNullablePropExpression<Long>

@GeneratedBy(type = Course::class)
public val KNonNullProps<Course>.courseName: KNonNullPropExpression<String>
    get() = get<String>(CourseProps.COURSE_NAME.unwrap()) as KNonNullPropExpression<String>

@GeneratedBy(type = Course::class)
public val KNullableProps<Course>.courseName: KNullablePropExpression<String>
    get() = get<String>(CourseProps.COURSE_NAME.unwrap()) as KNullablePropExpression<String>

@GeneratedBy(type = Course::class)
public val KNonNullProps<Course>.courseCode: KNonNullPropExpression<String>
    get() = get<String>(CourseProps.COURSE_CODE.unwrap()) as KNonNullPropExpression<String>

@GeneratedBy(type = Course::class)
public val KNullableProps<Course>.courseCode: KNullablePropExpression<String>
    get() = get<String>(CourseProps.COURSE_CODE.unwrap()) as KNullablePropExpression<String>

@GeneratedBy(type = Course::class)
public val KProps<Course>.createTime: KNullablePropExpression<LocalDateTime>
    get() = get<LocalDateTime>(CourseProps.CREATE_TIME.unwrap()) as
            KNullablePropExpression<LocalDateTime>

public
        fun KProps<Course>.students(block: KNonNullTableEx<Student>.() -> KNonNullExpression<Boolean>?):
        KNonNullExpression<Boolean>? = exists(CourseProps.STUDENTS.unwrap(), block)

@GeneratedBy(type = Course::class)
public val KTableEx<Course>.students: KNonNullTableEx<Student>
    get() = join(CourseProps.STUDENTS.unwrap())

@GeneratedBy(type = Course::class)
public val KTableEx<Course>.`students?`: KNullableTableEx<Student>
    get() = outerJoin(CourseProps.STUDENTS.unwrap())

@GeneratedBy(type = Course::class)
public val KRemoteRef.NonNull<Course>.courseId: KNonNullPropExpression<Long>
    get() = (this as KRemoteRefImplementor<*>).id<Long>() as KNonNullPropExpression<Long>

@GeneratedBy(type = Course::class)
public val KRemoteRef.Nullable<Course>.courseId: KNullablePropExpression<Long>
    get() = (this as KRemoteRefImplementor<*>).id<Long>() as KNullablePropExpression<Long>

@GeneratedBy(type = Course::class)
public fun KNonNullTable<Course>.fetchBy(block: CourseFetcherDsl.() -> Unit): Selection<Course> =
        fetch(newFetcher(Course::class).`by`(block))

@GeneratedBy(type = Course::class)
public fun KNullableTable<Course>.fetchBy(block: CourseFetcherDsl.() -> Unit): Selection<Course?> =
        fetch(newFetcher(Course::class).`by`(block))

@GeneratedBy(type = Course::class)
public object CourseProps {
    public val COURSE_ID: TypedProp.Scalar<Course, Long> =
            TypedProp.scalar(Course::courseId.toImmutableProp())

    public val COURSE_NAME: TypedProp.Scalar<Course, String> =
            TypedProp.scalar(Course::courseName.toImmutableProp())

    public val COURSE_CODE: TypedProp.Scalar<Course, String> =
            TypedProp.scalar(Course::courseCode.toImmutableProp())

    public val CREATE_TIME: TypedProp.Scalar<Course, LocalDateTime?> =
            TypedProp.scalar(Course::createTime.toImmutableProp())

    public val STUDENTS: TypedProp.ReferenceList<Course, Student> =
            TypedProp.referenceList(Course::students.toImmutableProp())
}
