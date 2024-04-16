@file:Suppress(
    "RedundantVisibilityModifier",
    "Unused",
)

package org.example.org.example.domain

import com.fasterxml.jackson.`annotation`.JsonIgnore
import com.fasterxml.jackson.`annotation`.JsonPropertyOrder
import java.io.Serializable
import java.lang.System
import java.time.LocalDateTime
import kotlin.Any
import kotlin.Boolean
import kotlin.Cloneable
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.MutableList
import org.babyfish.jimmer.CircularReferenceException
import org.babyfish.jimmer.Draft
import org.babyfish.jimmer.DraftConsumer
import org.babyfish.jimmer.ImmutableObjects
import org.babyfish.jimmer.UnloadedException
import org.babyfish.jimmer.`internal`.GeneratedBy
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException
import org.babyfish.jimmer.kt.DslScope
import org.babyfish.jimmer.kt.ImmutableCompanion
import org.babyfish.jimmer.kt.ImmutableCreator
import org.babyfish.jimmer.meta.ImmutablePropCategory
import org.babyfish.jimmer.meta.ImmutableType
import org.babyfish.jimmer.meta.PropId
import org.babyfish.jimmer.runtime.DraftContext
import org.babyfish.jimmer.runtime.DraftSpi
import org.babyfish.jimmer.runtime.ImmutableSpi
import org.babyfish.jimmer.runtime.Internal
import org.babyfish.jimmer.runtime.NonSharedList
import org.babyfish.jimmer.runtime.Visibility
import org.babyfish.jimmer.sql.ManyToMany

@DslScope
@GeneratedBy(type = Course::class)
public interface CourseDraft : Course, Draft {
    override var courseId: Long

    override var courseName: String

    override var courseCode: String

    override var createTime: LocalDateTime?

    override var students: List<Student>

    public fun students(): MutableList<StudentDraft>

    public object `$` {
        public const val SLOT_COURSE_ID: Int = 0

        public const val SLOT_COURSE_NAME: Int = 1

        public const val SLOT_COURSE_CODE: Int = 2

        public const val SLOT_CREATE_TIME: Int = 3

        public const val SLOT_STUDENTS: Int = 4

        public val type: ImmutableType = ImmutableType
            .newBuilder(
                "0.8.125",
                Course::class,
                listOf(

                ),
            ) { ctx, base ->
                DraftImpl(ctx, base as Course?)
            }
            .id(SLOT_COURSE_ID, "courseId", Long::class.java)
            .add(SLOT_COURSE_NAME, "courseName", ImmutablePropCategory.SCALAR, String::class.java,
                    false)
            .add(SLOT_COURSE_CODE, "courseCode", ImmutablePropCategory.SCALAR, String::class.java,
                    false)
            .add(SLOT_CREATE_TIME, "createTime", ImmutablePropCategory.SCALAR,
                    LocalDateTime::class.java, true)
            .add(SLOT_STUDENTS, "students", ManyToMany::class.java, Student::class.java, false)
            .build()

        public fun produce(base: Course? = null, block: CourseDraft.() -> Unit): Course {
            val consumer = DraftConsumer<CourseDraft> { block(it) }
            return Internal.produce(type, base, consumer) as Course
        }

        @JsonPropertyOrder("dummyPropForJacksonError__", "courseId", "courseName", "courseCode",
                "createTime", "students")
        private abstract interface Implementor : Course, ImmutableSpi {
            public val dummyPropForJacksonError__: Int
                get() = throw ImmutableModuleRequiredException()

            override fun __get(prop: PropId): Any? = when (prop.asIndex()) {
                -1 ->
                	__get(prop.asName())
                SLOT_COURSE_ID ->
                	courseId
                SLOT_COURSE_NAME ->
                	courseName
                SLOT_COURSE_CODE ->
                	courseCode
                SLOT_CREATE_TIME ->
                	createTime
                SLOT_STUDENTS ->
                	students
                else -> throw IllegalArgumentException(
                    "Illegal property name" + 
                    " for \"org.example.org.example.domain.Course\": " + 
                    prop
                )

            }

            override fun __get(prop: String): Any? = when (prop) {
                "courseId" ->
                	courseId
                "courseName" ->
                	courseName
                "courseCode" ->
                	courseCode
                "createTime" ->
                	createTime
                "students" ->
                	students
                else -> throw IllegalArgumentException(
                    "Illegal property name" + 
                    " for \"org.example.org.example.domain.Course\": " + 
                    prop
                )

            }

            override fun __type(): ImmutableType = `$`.type
        }

        private class Impl : Implementor, Cloneable, Serializable {
            @get:JsonIgnore
            internal var __visibility: Visibility? = null

            @get:JsonIgnore
            internal var __courseIdValue: Long = 0

            @get:JsonIgnore
            internal var __courseIdLoaded: Boolean = false

            @get:JsonIgnore
            internal var __courseNameValue: String? = null

            @get:JsonIgnore
            internal var __courseCodeValue: String? = null

            @get:JsonIgnore
            internal var __createTimeValue: LocalDateTime? = null

            @get:JsonIgnore
            internal var __createTimeLoaded: Boolean = false

            @get:JsonIgnore
            internal var __studentsValue: NonSharedList<Student>? = null

            override val courseId: Long
                get() {
                    if (!__courseIdLoaded) {
                        throw UnloadedException(Course::class.java, "courseId")
                    }
                    return __courseIdValue
                }

            override val courseName: String
                get() {
                    val __courseNameValue = this.__courseNameValue
                    if (__courseNameValue === null) {
                        throw UnloadedException(Course::class.java, "courseName")
                    }
                    return __courseNameValue
                }

            override val courseCode: String
                get() {
                    val __courseCodeValue = this.__courseCodeValue
                    if (__courseCodeValue === null) {
                        throw UnloadedException(Course::class.java, "courseCode")
                    }
                    return __courseCodeValue
                }

            override val createTime: LocalDateTime?
                get() {
                    if (!__createTimeLoaded) {
                        throw UnloadedException(Course::class.java, "createTime")
                    }
                    return __createTimeValue
                }

            override val students: List<Student>
                get() {
                    val __studentsValue = this.__studentsValue
                    if (__studentsValue === null) {
                        throw UnloadedException(Course::class.java, "students")
                    }
                    return __studentsValue
                }

            public override fun clone(): Impl = super.clone() as Impl

            override fun __isLoaded(prop: PropId): Boolean = when (prop.asIndex()) {
                -1 ->
                	__isLoaded(prop.asName())
                SLOT_COURSE_ID ->
                	__courseIdLoaded
                SLOT_COURSE_NAME ->
                	__courseNameValue !== null
                SLOT_COURSE_CODE ->
                	__courseCodeValue !== null
                SLOT_CREATE_TIME ->
                	__createTimeLoaded
                SLOT_STUDENTS ->
                	__studentsValue !== null
                else -> throw IllegalArgumentException(
                    "Illegal property name" + 
                    " for \"org.example.org.example.domain.Course\": " + 
                    prop
                )

            }

            override fun __isLoaded(prop: String): Boolean = when (prop) {
                "courseId" ->
                	__courseIdLoaded
                "courseName" ->
                	__courseNameValue !== null
                "courseCode" ->
                	__courseCodeValue !== null
                "createTime" ->
                	__createTimeLoaded
                "students" ->
                	__studentsValue !== null
                else -> throw IllegalArgumentException(
                    "Illegal property name" + 
                    " for \"org.example.org.example.domain.Course\": " + 
                    prop
                )

            }

            override fun __isVisible(prop: PropId): Boolean {
                val __visibility = this.__visibility ?: return true
                return when (prop.asIndex()) {
                    -1 ->
                    	__isVisible(prop.asName())
                    SLOT_COURSE_ID ->
                    	__visibility.visible(SLOT_COURSE_ID)
                    SLOT_COURSE_NAME ->
                    	__visibility.visible(SLOT_COURSE_NAME)
                    SLOT_COURSE_CODE ->
                    	__visibility.visible(SLOT_COURSE_CODE)
                    SLOT_CREATE_TIME ->
                    	__visibility.visible(SLOT_CREATE_TIME)
                    SLOT_STUDENTS ->
                    	__visibility.visible(SLOT_STUDENTS)
                    else -> true
                }
            }

            override fun __isVisible(prop: String): Boolean {
                val __visibility = this.__visibility ?: return true
                return when (prop) {
                    "courseId" ->
                    	__visibility.visible(SLOT_COURSE_ID)
                    "courseName" ->
                    	__visibility.visible(SLOT_COURSE_NAME)
                    "courseCode" ->
                    	__visibility.visible(SLOT_COURSE_CODE)
                    "createTime" ->
                    	__visibility.visible(SLOT_CREATE_TIME)
                    "students" ->
                    	__visibility.visible(SLOT_STUDENTS)
                    else -> true
                }
            }

            public fun __shallowHashCode(): Int {
                var hash = __visibility?.hashCode() ?: 0
                if (__courseIdLoaded) {
                    hash = 31 * hash + __courseIdValue.hashCode()
                }
                if (__courseNameValue !== null) {
                    hash = 31 * hash + __courseNameValue.hashCode()
                }
                if (__courseCodeValue !== null) {
                    hash = 31 * hash + __courseCodeValue.hashCode()
                }
                if (__createTimeLoaded) {
                    hash = 31 * hash + (__createTimeValue?.hashCode() ?: 0)
                }
                if (__studentsValue !== null) {
                    hash = 31 * hash + System.identityHashCode(__studentsValue)
                }
                return hash
            }

            override fun hashCode(): Int {
                var hash = __visibility?.hashCode() ?: 0
                if (__courseIdLoaded) {
                    hash = 31 * hash + __courseIdValue.hashCode()
                    return hash
                }
                if (__courseNameValue !== null) {
                    hash = 31 * hash + __courseNameValue.hashCode()
                }
                if (__courseCodeValue !== null) {
                    hash = 31 * hash + __courseCodeValue.hashCode()
                }
                if (__createTimeLoaded) {
                    hash = 31 * hash + (__createTimeValue?.hashCode() ?: 0)
                }
                if (__studentsValue !== null) {
                    hash = 31 * hash + __studentsValue.hashCode()
                }
                return hash
            }

            override fun __hashCode(shallow: Boolean): Int = if (shallow) __shallowHashCode() else
                    hashCode()

            public fun __shallowEquals(other: Any?): Boolean {
                val __other = other as? Implementor
                if (__other === null) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_ID)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_COURSE_ID))) {
                    return false
                }
                val __courseIdLoaded = 
                    this.__courseIdLoaded
                if (__courseIdLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_COURSE_ID)))) {
                    return false
                }
                if (__courseIdLoaded && this.__courseIdValue != __other.courseId) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_NAME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_COURSE_NAME))) {
                    return false
                }
                val __courseNameLoaded = 
                    this.__courseNameValue !== null
                if (__courseNameLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_COURSE_NAME)))) {
                    return false
                }
                if (__courseNameLoaded && this.__courseNameValue != __other.courseName) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_CODE)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_COURSE_CODE))) {
                    return false
                }
                val __courseCodeLoaded = 
                    this.__courseCodeValue !== null
                if (__courseCodeLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_COURSE_CODE)))) {
                    return false
                }
                if (__courseCodeLoaded && this.__courseCodeValue != __other.courseCode) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_TIME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_CREATE_TIME))) {
                    return false
                }
                val __createTimeLoaded = 
                    this.__createTimeLoaded
                if (__createTimeLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_CREATE_TIME)))) {
                    return false
                }
                if (__createTimeLoaded && this.__createTimeValue != __other.createTime) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_STUDENTS)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_STUDENTS))) {
                    return false
                }
                val __studentsLoaded = 
                    this.__studentsValue !== null
                if (__studentsLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_STUDENTS)))) {
                    return false
                }
                if (__studentsLoaded && this.__studentsValue !== __other.students) {
                    return false
                }
                return true
            }

            override fun equals(other: Any?): Boolean {
                val __other = other as? Implementor
                if (__other === null) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_ID)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_COURSE_ID))) {
                    return false
                }
                val __courseIdLoaded = 
                    this.__courseIdLoaded
                if (__courseIdLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_COURSE_ID)))) {
                    return false
                }
                if (__courseIdLoaded) {
                    return this.__courseIdValue == __other.courseId
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_NAME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_COURSE_NAME))) {
                    return false
                }
                val __courseNameLoaded = 
                    this.__courseNameValue !== null
                if (__courseNameLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_COURSE_NAME)))) {
                    return false
                }
                if (__courseNameLoaded && this.__courseNameValue != __other.courseName) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_CODE)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_COURSE_CODE))) {
                    return false
                }
                val __courseCodeLoaded = 
                    this.__courseCodeValue !== null
                if (__courseCodeLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_COURSE_CODE)))) {
                    return false
                }
                if (__courseCodeLoaded && this.__courseCodeValue != __other.courseCode) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_TIME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_CREATE_TIME))) {
                    return false
                }
                val __createTimeLoaded = 
                    this.__createTimeLoaded
                if (__createTimeLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_CREATE_TIME)))) {
                    return false
                }
                if (__createTimeLoaded && this.__createTimeValue != __other.createTime) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_STUDENTS)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_STUDENTS))) {
                    return false
                }
                val __studentsLoaded = 
                    this.__studentsValue !== null
                if (__studentsLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_STUDENTS)))) {
                    return false
                }
                if (__studentsLoaded && this.__studentsValue != __other.students) {
                    return false
                }
                return true
            }

            override fun __equals(obj: Any?, shallow: Boolean): Boolean = if (shallow)
                    __shallowEquals(obj) else equals(obj)

            override fun toString(): String = ImmutableObjects.toString(this)
        }

        internal class DraftImpl(
            ctx: DraftContext?,
            base: Course?,
        ) : Implementor, CourseDraft, DraftSpi {
            private val __ctx: DraftContext? = ctx

            private val __base: Impl? = base as Impl?

            private var __modified: Impl? = if (base === null) Impl() else null

            public var __resolving: Boolean = false

            override var courseId: Long
                get() = (__modified ?: __base!!).courseId
                set(courseId) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__courseIdValue = courseId
                    __tmpModified.__courseIdLoaded = true
                }

            override var courseName: String
                get() = (__modified ?: __base!!).courseName
                set(courseName) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__courseNameValue = courseName
                }

            override var courseCode: String
                get() = (__modified ?: __base!!).courseCode
                set(courseCode) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__courseCodeValue = courseCode
                }

            override var createTime: LocalDateTime?
                get() = (__modified ?: __base!!).createTime
                set(createTime) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__createTimeValue = createTime
                    __tmpModified.__createTimeLoaded = true
                }

            override var students: List<Student>
                get() = __ctx().toDraftList((__modified ?: __base!!).students, Student::class.java,
                        true)
                set(students) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__studentsValue = NonSharedList.of(__tmpModified.__studentsValue,
                            students)
                }

            override fun __isLoaded(prop: PropId): Boolean = (__modified ?:
                    __base!!).__isLoaded(prop)

            override fun __isLoaded(prop: String): Boolean = (__modified ?:
                    __base!!).__isLoaded(prop)

            override fun __isVisible(prop: PropId): Boolean = (__modified ?:
                    __base!!).__isVisible(prop)

            override fun __isVisible(prop: String): Boolean = (__modified ?:
                    __base!!).__isVisible(prop)

            override fun hashCode(): Int = (__modified ?: __base!!).hashCode()

            override fun __hashCode(shallow: Boolean): Int = (__modified ?:
                    __base!!).__hashCode(shallow)

            override fun equals(other: Any?): Boolean = (__modified ?: __base!!).equals(other)

            override fun __equals(other: Any?, shallow: Boolean): Boolean = (__modified ?:
                    __base!!).__equals(other, shallow)

            override fun toString(): String = ImmutableObjects.toString((__modified ?: __base!!))

            @Suppress("UNCHECKED_CAST")
            override fun students(): MutableList<StudentDraft> {
                if (!__isLoaded(PropId.byIndex(SLOT_STUDENTS))) {
                    students = emptyList()
                }
                return students as MutableList<StudentDraft>
            }

            override fun __unload(prop: PropId) {
                when (prop.asIndex()) {
                    -1 ->
                    	__unload(prop.asName())
                    SLOT_COURSE_ID ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__courseIdLoaded = false
                    SLOT_COURSE_NAME ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__courseNameValue = null
                    SLOT_COURSE_CODE ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__courseCodeValue = null
                    SLOT_CREATE_TIME ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__createTimeLoaded = false
                    SLOT_STUDENTS ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__studentsValue = null
                    else -> throw IllegalArgumentException(
                        "Illegal property name" + 
                        " for \"org.example.org.example.domain.Course\": " + 
                        prop
                    )

                }
            }

            override fun __unload(prop: String) {
                when (prop) {
                    "courseId" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__courseIdLoaded = false
                    "courseName" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__courseNameValue = null
                    "courseCode" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__courseCodeValue = null
                    "createTime" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__createTimeLoaded = false
                    "students" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__studentsValue = null
                    else -> throw IllegalArgumentException(
                        "Illegal property name" + 
                        " for \"org.example.org.example.domain.Course\": " + 
                        prop
                    )

                }
            }

            override fun __set(prop: PropId, `value`: Any?) {
                when (prop.asIndex()) {
                    -1 ->
                    	__set(prop.asName(), value)
                    SLOT_COURSE_ID ->
                    	this.courseId = value as Long?
                    	?: throw IllegalArgumentException("'courseId cannot be null")
                    SLOT_COURSE_NAME ->
                    	this.courseName = value as String?
                    	?: throw IllegalArgumentException("'courseName cannot be null")
                    SLOT_COURSE_CODE ->
                    	this.courseCode = value as String?
                    	?: throw IllegalArgumentException("'courseCode cannot be null")
                    SLOT_CREATE_TIME ->
                    	this.createTime = value as LocalDateTime?
                    SLOT_STUDENTS ->
                    	this.students = value as List<Student>?
                    	?: throw IllegalArgumentException("'students cannot be null")
                    else -> throw IllegalArgumentException(
                        "Illegal property name" + 
                        " for \"org.example.org.example.domain.Course\": " + 
                        prop
                    )

                }
            }

            override fun __set(prop: String, `value`: Any?) {
                when (prop) {
                    "courseId" ->
                    	this.courseId = value as Long?
                    	?: throw IllegalArgumentException("'courseId cannot be null")
                    "courseName" ->
                    	this.courseName = value as String?
                    	?: throw IllegalArgumentException("'courseName cannot be null")
                    "courseCode" ->
                    	this.courseCode = value as String?
                    	?: throw IllegalArgumentException("'courseCode cannot be null")
                    "createTime" ->
                    	this.createTime = value as LocalDateTime?
                    "students" ->
                    	this.students = value as List<Student>?
                    	?: throw IllegalArgumentException("'students cannot be null")
                    else -> throw IllegalArgumentException(
                        "Illegal property name" + 
                        " for \"org.example.org.example.domain.Course\": " + 
                        prop
                    )

                }
            }

            override fun __show(prop: PropId, visible: Boolean) {
                val __visibility = (__modified ?: __base!!).__visibility
                    ?: if (visible) {
                        null
                    } else {
                        Visibility.of(5).also{
                            (__modified ?: __base!!.clone())
                            .also { __modified = it }.__visibility = it}
                    }
                    ?: return
                when (prop.asIndex()) {
                    -1 ->
                    	__show(prop.asName(), visible)
                    SLOT_COURSE_ID ->
                    	__visibility.show(SLOT_COURSE_ID, visible)
                    SLOT_COURSE_NAME ->
                    	__visibility.show(SLOT_COURSE_NAME, visible)
                    SLOT_COURSE_CODE ->
                    	__visibility.show(SLOT_COURSE_CODE, visible)
                    SLOT_CREATE_TIME ->
                    	__visibility.show(SLOT_CREATE_TIME, visible)
                    SLOT_STUDENTS ->
                    	__visibility.show(SLOT_STUDENTS, visible)
                    else -> throw IllegalArgumentException(
                        "Illegal property id: \"" + 
                        prop + 
                        "\",it does not exists"
                    )
                }
            }

            override fun __show(prop: String, visible: Boolean) {
                val __visibility = (__modified ?: __base!!).__visibility
                    ?: if (visible) {
                        null
                    } else {
                        Visibility.of(5).also{
                            (__modified ?: __base!!.clone())
                            .also { __modified = it }.__visibility = it}
                    }
                    ?: return
                when (prop) {
                    "courseId" ->
                    	__visibility.show(SLOT_COURSE_ID, visible)
                    "courseName" ->
                    	__visibility.show(SLOT_COURSE_NAME, visible)
                    "courseCode" ->
                    	__visibility.show(SLOT_COURSE_CODE, visible)
                    "createTime" ->
                    	__visibility.show(SLOT_CREATE_TIME, visible)
                    "students" ->
                    	__visibility.show(SLOT_STUDENTS, visible)
                    else -> throw IllegalArgumentException(
                        "Illegal property name: \"" + 
                        prop + 
                        "\",it does not exists"
                    )
                }
            }

            override fun __draftContext(): DraftContext = __ctx()

            override fun __resolve(): Any {
                if (__resolving) {
                    throw CircularReferenceException()
                }
                __resolving = true
                val __ctx = __ctx()
                try {
                    val base = __base
                    var __tmpModified = __modified
                    if (__tmpModified === null) {
                        if (__isLoaded(PropId.byIndex(SLOT_STUDENTS))) {
                            val oldValue = base!!.students
                            val newValue = __ctx.resolveList(oldValue)
                            if (oldValue !== newValue) {
                                students = newValue
                            }
                        }
                        __tmpModified = __modified
                    } else {
                        __tmpModified.__studentsValue =
                                NonSharedList.of(__tmpModified.__studentsValue,
                                __ctx.resolveList(__tmpModified.__studentsValue))
                    }
                    if (base !== null && __tmpModified === null) {
                        return base
                    }
                    return __tmpModified!!
                } finally {
                    __resolving = false
                }
            }

            private fun __ctx(): DraftContext = __ctx ?:
                    error("The current draft object is simple draft which does not support converting nested object to nested draft")

            internal fun __unwrap(): Any = __modified ?:
                    error("Internal bug, draft for builder must have `__modified`")
        }
    }

    public class Builder {
        private val __draft: `$`.DraftImpl = `$`.DraftImpl(null, null)

        public fun courseId(courseId: Long?): Builder {
            if (courseId !== null) {
                __draft.courseId = courseId
                __draft.__show(PropId.byIndex(`$`.SLOT_COURSE_ID), true)
            }
            return this
        }

        public fun courseName(courseName: String?): Builder {
            if (courseName !== null) {
                __draft.courseName = courseName
                __draft.__show(PropId.byIndex(`$`.SLOT_COURSE_NAME), true)
            }
            return this
        }

        public fun courseCode(courseCode: String?): Builder {
            if (courseCode !== null) {
                __draft.courseCode = courseCode
                __draft.__show(PropId.byIndex(`$`.SLOT_COURSE_CODE), true)
            }
            return this
        }

        public fun createTime(createTime: LocalDateTime?): Builder {
            __draft.createTime = createTime
            __draft.__show(PropId.byIndex(`$`.SLOT_CREATE_TIME), true)
            return this
        }

        public fun students(students: List<Student>?): Builder {
            if (students !== null) {
                __draft.students = students
                __draft.__show(PropId.byIndex(`$`.SLOT_STUDENTS), true)
            }
            return this
        }

        public fun build(): Course = __draft.__unwrap() as Course
    }
}

public fun ImmutableCreator<Course>.`by`(base: Course? = null, block: CourseDraft.() -> Unit = {}):
        Course = CourseDraft.`$`.produce(base, block)

public operator fun ImmutableCompanion<Course>.invoke(base: Course? = null,
        block: CourseDraft.() -> Unit): Course = CourseDraft.`$`.produce(base, block)

public fun MutableList<CourseDraft>.addBy(base: Course? = null, block: CourseDraft.() -> Unit = {}):
        MutableList<CourseDraft> {
    add(CourseDraft.`$`.produce(base, block) as CourseDraft)
    return this
}

public fun Course.copy(block: CourseDraft.() -> Unit): Course = CourseDraft.`$`.produce(this, block)
