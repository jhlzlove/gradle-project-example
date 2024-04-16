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
@GeneratedBy(type = Student::class)
public interface StudentDraft : Student, BaseEntityDraft {
    override var userId: Long

    override var firstName: String

    override var lastName: String

    override var gender: Gender

    override val fullName: String

    override var courseIds: List<Course>

    public fun courseIds(): MutableList<CourseDraft>

    public object `$` {
        public const val SLOT_USER_ID: Int = 5

        public const val SLOT_CREATE_TIME: Int = 0

        public const val SLOT_UPDATE_TIME: Int = 1

        public const val SLOT_CREATE_BY: Int = 2

        public const val SLOT_UPDATE_BY: Int = 3

        public const val SLOT_REMARK: Int = 4

        public const val SLOT_FIRST_NAME: Int = 6

        public const val SLOT_LAST_NAME: Int = 7

        public const val SLOT_GENDER: Int = 8

        public const val SLOT_FULL_NAME: Int = 9

        public const val SLOT_COURSE_IDS: Int = 10

        public val type: ImmutableType = ImmutableType
            .newBuilder(
                "0.8.125",
                Student::class,
                listOf(
                    BaseEntityDraft.`$`.type
                ),
            ) { ctx, base ->
                DraftImpl(ctx, base as Student?)
            }
            .redefine("createTime", SLOT_CREATE_TIME)
            .redefine("updateTime", SLOT_UPDATE_TIME)
            .redefine("createBy", SLOT_CREATE_BY)
            .redefine("updateBy", SLOT_UPDATE_BY)
            .redefine("remark", SLOT_REMARK)
            .id(SLOT_USER_ID, "userId", Long::class.java)
            .add(SLOT_FIRST_NAME, "firstName", ImmutablePropCategory.SCALAR, String::class.java,
                    false)
            .add(SLOT_LAST_NAME, "lastName", ImmutablePropCategory.SCALAR, String::class.java,
                    false)
            .add(SLOT_GENDER, "gender", ImmutablePropCategory.SCALAR, Gender::class.java, false)
            .add(SLOT_FULL_NAME, "fullName", ImmutablePropCategory.SCALAR, String::class.java,
                    false)
            .add(SLOT_COURSE_IDS, "courseIds", ManyToMany::class.java, Course::class.java, false)
            .build()

        public fun produce(base: Student? = null, block: StudentDraft.() -> Unit): Student {
            val consumer = DraftConsumer<StudentDraft> { block(it) }
            return Internal.produce(type, base, consumer) as Student
        }

        @JsonPropertyOrder("dummyPropForJacksonError__", "createTime", "updateTime", "createBy",
                "updateBy", "remark", "userId", "firstName", "lastName", "gender", "fullName",
                "courseIds")
        private abstract interface Implementor : Student, ImmutableSpi {
            public val dummyPropForJacksonError__: Int
                get() = throw ImmutableModuleRequiredException()

            override fun __get(prop: PropId): Any? = when (prop.asIndex()) {
                -1 ->
                	__get(prop.asName())
                SLOT_CREATE_TIME ->
                	createTime
                SLOT_UPDATE_TIME ->
                	updateTime
                SLOT_CREATE_BY ->
                	createBy
                SLOT_UPDATE_BY ->
                	updateBy
                SLOT_REMARK ->
                	remark
                SLOT_USER_ID ->
                	userId
                SLOT_FIRST_NAME ->
                	firstName
                SLOT_LAST_NAME ->
                	lastName
                SLOT_GENDER ->
                	gender
                SLOT_FULL_NAME ->
                	fullName
                SLOT_COURSE_IDS ->
                	courseIds
                else -> throw IllegalArgumentException(
                    "Illegal property name" + 
                    " for \"org.example.org.example.domain.Student\": " + 
                    prop
                )

            }

            override fun __get(prop: String): Any? = when (prop) {
                "createTime" ->
                	createTime
                "updateTime" ->
                	updateTime
                "createBy" ->
                	createBy
                "updateBy" ->
                	updateBy
                "remark" ->
                	remark
                "userId" ->
                	userId
                "firstName" ->
                	firstName
                "lastName" ->
                	lastName
                "gender" ->
                	gender
                "fullName" ->
                	fullName
                "courseIds" ->
                	courseIds
                else -> throw IllegalArgumentException(
                    "Illegal property name" + 
                    " for \"org.example.org.example.domain.Student\": " + 
                    prop
                )

            }

            override fun __type(): ImmutableType = `$`.type
        }

        private class Impl : Implementor, Cloneable, Serializable {
            @get:JsonIgnore
            internal var __visibility: Visibility? = null

            @get:JsonIgnore
            internal var __userIdValue: Long = 0

            @get:JsonIgnore
            internal var __userIdLoaded: Boolean = false

            @get:JsonIgnore
            internal var __createTimeValue: LocalDateTime? = null

            @get:JsonIgnore
            internal var __createTimeLoaded: Boolean = false

            @get:JsonIgnore
            internal var __updateTimeValue: LocalDateTime? = null

            @get:JsonIgnore
            internal var __updateTimeLoaded: Boolean = false

            @get:JsonIgnore
            internal var __createByValue: String? = null

            @get:JsonIgnore
            internal var __createByLoaded: Boolean = false

            @get:JsonIgnore
            internal var __updateByValue: String? = null

            @get:JsonIgnore
            internal var __updateByLoaded: Boolean = false

            @get:JsonIgnore
            internal var __remarkValue: String? = null

            @get:JsonIgnore
            internal var __remarkLoaded: Boolean = false

            @get:JsonIgnore
            internal var __firstNameValue: String? = null

            @get:JsonIgnore
            internal var __lastNameValue: String? = null

            @get:JsonIgnore
            internal var __genderValue: Gender? = null

            @get:JsonIgnore
            internal var __courseIdsValue: NonSharedList<Course>? = null

            override val userId: Long
                get() {
                    if (!__userIdLoaded) {
                        throw UnloadedException(Student::class.java, "userId")
                    }
                    return __userIdValue
                }

            override val createTime: LocalDateTime?
                get() {
                    if (!__createTimeLoaded) {
                        throw UnloadedException(Student::class.java, "createTime")
                    }
                    return __createTimeValue
                }

            override val updateTime: LocalDateTime?
                get() {
                    if (!__updateTimeLoaded) {
                        throw UnloadedException(Student::class.java, "updateTime")
                    }
                    return __updateTimeValue
                }

            override val createBy: String?
                get() {
                    if (!__createByLoaded) {
                        throw UnloadedException(Student::class.java, "createBy")
                    }
                    return __createByValue
                }

            override val updateBy: String?
                get() {
                    if (!__updateByLoaded) {
                        throw UnloadedException(Student::class.java, "updateBy")
                    }
                    return __updateByValue
                }

            override val remark: String?
                get() {
                    if (!__remarkLoaded) {
                        throw UnloadedException(Student::class.java, "remark")
                    }
                    return __remarkValue
                }

            override val firstName: String
                get() {
                    val __firstNameValue = this.__firstNameValue
                    if (__firstNameValue === null) {
                        throw UnloadedException(Student::class.java, "firstName")
                    }
                    return __firstNameValue
                }

            override val lastName: String
                get() {
                    val __lastNameValue = this.__lastNameValue
                    if (__lastNameValue === null) {
                        throw UnloadedException(Student::class.java, "lastName")
                    }
                    return __lastNameValue
                }

            override val gender: Gender
                get() {
                    val __genderValue = this.__genderValue
                    if (__genderValue === null) {
                        throw UnloadedException(Student::class.java, "gender")
                    }
                    return __genderValue
                }

            override val courseIds: List<Course>
                get() {
                    val __courseIdsValue = this.__courseIdsValue
                    if (__courseIdsValue === null) {
                        throw UnloadedException(Student::class.java, "courseIds")
                    }
                    return __courseIdsValue
                }

            public constructor() {
                val __visibility = Visibility.of(11)
                __visibility.show(SLOT_FULL_NAME, false)
                this.__visibility = __visibility
            }

            public override fun clone(): Impl = super.clone() as Impl

            override fun __isLoaded(prop: PropId): Boolean = when (prop.asIndex()) {
                -1 ->
                	__isLoaded(prop.asName())
                SLOT_CREATE_TIME ->
                	__createTimeLoaded
                SLOT_UPDATE_TIME ->
                	__updateTimeLoaded
                SLOT_CREATE_BY ->
                	__createByLoaded
                SLOT_UPDATE_BY ->
                	__updateByLoaded
                SLOT_REMARK ->
                	__remarkLoaded
                SLOT_USER_ID ->
                	__userIdLoaded
                SLOT_FIRST_NAME ->
                	__firstNameValue !== null
                SLOT_LAST_NAME ->
                	__lastNameValue !== null
                SLOT_GENDER ->
                	__genderValue !== null
                SLOT_FULL_NAME ->
                	__isLoaded(PropId.byIndex(SLOT_FIRST_NAME)) && 
                    __isLoaded(PropId.byIndex(SLOT_LAST_NAME))
                SLOT_COURSE_IDS ->
                	__courseIdsValue !== null
                else -> throw IllegalArgumentException(
                    "Illegal property name" + 
                    " for \"org.example.org.example.domain.Student\": " + 
                    prop
                )

            }

            override fun __isLoaded(prop: String): Boolean = when (prop) {
                "createTime" ->
                	__createTimeLoaded
                "updateTime" ->
                	__updateTimeLoaded
                "createBy" ->
                	__createByLoaded
                "updateBy" ->
                	__updateByLoaded
                "remark" ->
                	__remarkLoaded
                "userId" ->
                	__userIdLoaded
                "firstName" ->
                	__firstNameValue !== null
                "lastName" ->
                	__lastNameValue !== null
                "gender" ->
                	__genderValue !== null
                "fullName" ->
                	__isLoaded(PropId.byIndex(SLOT_FIRST_NAME)) && 
                    __isLoaded(PropId.byIndex(SLOT_LAST_NAME))
                "courseIds" ->
                	__courseIdsValue !== null
                else -> throw IllegalArgumentException(
                    "Illegal property name" + 
                    " for \"org.example.org.example.domain.Student\": " + 
                    prop
                )

            }

            override fun __isVisible(prop: PropId): Boolean {
                val __visibility = this.__visibility ?: return true
                return when (prop.asIndex()) {
                    -1 ->
                    	__isVisible(prop.asName())
                    SLOT_CREATE_TIME ->
                    	__visibility.visible(SLOT_CREATE_TIME)
                    SLOT_UPDATE_TIME ->
                    	__visibility.visible(SLOT_UPDATE_TIME)
                    SLOT_CREATE_BY ->
                    	__visibility.visible(SLOT_CREATE_BY)
                    SLOT_UPDATE_BY ->
                    	__visibility.visible(SLOT_UPDATE_BY)
                    SLOT_REMARK ->
                    	__visibility.visible(SLOT_REMARK)
                    SLOT_USER_ID ->
                    	__visibility.visible(SLOT_USER_ID)
                    SLOT_FIRST_NAME ->
                    	__visibility.visible(SLOT_FIRST_NAME)
                    SLOT_LAST_NAME ->
                    	__visibility.visible(SLOT_LAST_NAME)
                    SLOT_GENDER ->
                    	__visibility.visible(SLOT_GENDER)
                    SLOT_FULL_NAME ->
                    	__visibility.visible(SLOT_FULL_NAME)
                    SLOT_COURSE_IDS ->
                    	__visibility.visible(SLOT_COURSE_IDS)
                    else -> true
                }
            }

            override fun __isVisible(prop: String): Boolean {
                val __visibility = this.__visibility ?: return true
                return when (prop) {
                    "createTime" ->
                    	__visibility.visible(SLOT_CREATE_TIME)
                    "updateTime" ->
                    	__visibility.visible(SLOT_UPDATE_TIME)
                    "createBy" ->
                    	__visibility.visible(SLOT_CREATE_BY)
                    "updateBy" ->
                    	__visibility.visible(SLOT_UPDATE_BY)
                    "remark" ->
                    	__visibility.visible(SLOT_REMARK)
                    "userId" ->
                    	__visibility.visible(SLOT_USER_ID)
                    "firstName" ->
                    	__visibility.visible(SLOT_FIRST_NAME)
                    "lastName" ->
                    	__visibility.visible(SLOT_LAST_NAME)
                    "gender" ->
                    	__visibility.visible(SLOT_GENDER)
                    "fullName" ->
                    	__visibility.visible(SLOT_FULL_NAME)
                    "courseIds" ->
                    	__visibility.visible(SLOT_COURSE_IDS)
                    else -> true
                }
            }

            public fun __shallowHashCode(): Int {
                var hash = __visibility?.hashCode() ?: 0
                if (__userIdLoaded) {
                    hash = 31 * hash + __userIdValue.hashCode()
                }
                if (__createTimeLoaded) {
                    hash = 31 * hash + (__createTimeValue?.hashCode() ?: 0)
                }
                if (__updateTimeLoaded) {
                    hash = 31 * hash + (__updateTimeValue?.hashCode() ?: 0)
                }
                if (__createByLoaded) {
                    hash = 31 * hash + (__createByValue?.hashCode() ?: 0)
                }
                if (__updateByLoaded) {
                    hash = 31 * hash + (__updateByValue?.hashCode() ?: 0)
                }
                if (__remarkLoaded) {
                    hash = 31 * hash + (__remarkValue?.hashCode() ?: 0)
                }
                if (__firstNameValue !== null) {
                    hash = 31 * hash + __firstNameValue.hashCode()
                }
                if (__lastNameValue !== null) {
                    hash = 31 * hash + __lastNameValue.hashCode()
                }
                if (__genderValue !== null) {
                    hash = 31 * hash + __genderValue.hashCode()
                }
                if (__courseIdsValue !== null) {
                    hash = 31 * hash + System.identityHashCode(__courseIdsValue)
                }
                return hash
            }

            override fun hashCode(): Int {
                var hash = __visibility?.hashCode() ?: 0
                if (__userIdLoaded) {
                    hash = 31 * hash + __userIdValue.hashCode()
                    return hash
                }
                if (__createTimeLoaded) {
                    hash = 31 * hash + (__createTimeValue?.hashCode() ?: 0)
                }
                if (__updateTimeLoaded) {
                    hash = 31 * hash + (__updateTimeValue?.hashCode() ?: 0)
                }
                if (__createByLoaded) {
                    hash = 31 * hash + (__createByValue?.hashCode() ?: 0)
                }
                if (__updateByLoaded) {
                    hash = 31 * hash + (__updateByValue?.hashCode() ?: 0)
                }
                if (__remarkLoaded) {
                    hash = 31 * hash + (__remarkValue?.hashCode() ?: 0)
                }
                if (__firstNameValue !== null) {
                    hash = 31 * hash + __firstNameValue.hashCode()
                }
                if (__lastNameValue !== null) {
                    hash = 31 * hash + __lastNameValue.hashCode()
                }
                if (__genderValue !== null) {
                    hash = 31 * hash + __genderValue.hashCode()
                }
                if (__courseIdsValue !== null) {
                    hash = 31 * hash + __courseIdsValue.hashCode()
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
                if (__isVisible(PropId.byIndex(SLOT_USER_ID)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_USER_ID))) {
                    return false
                }
                val __userIdLoaded = 
                    this.__userIdLoaded
                if (__userIdLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_USER_ID)))) {
                    return false
                }
                if (__userIdLoaded && this.__userIdValue != __other.userId) {
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
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_TIME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_UPDATE_TIME))) {
                    return false
                }
                val __updateTimeLoaded = 
                    this.__updateTimeLoaded
                if (__updateTimeLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_UPDATE_TIME)))) {
                    return false
                }
                if (__updateTimeLoaded && this.__updateTimeValue != __other.updateTime) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false
                }
                val __createByLoaded = 
                    this.__createByLoaded
                if (__createByLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY)))) {
                    return false
                }
                if (__createByLoaded && this.__createByValue != __other.createBy) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false
                }
                val __updateByLoaded = 
                    this.__updateByLoaded
                if (__updateByLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY)))) {
                    return false
                }
                if (__updateByLoaded && this.__updateByValue != __other.updateBy) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARK)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_REMARK))) {
                    return false
                }
                val __remarkLoaded = 
                    this.__remarkLoaded
                if (__remarkLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_REMARK)))) {
                    return false
                }
                if (__remarkLoaded && this.__remarkValue != __other.remark) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_FIRST_NAME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_FIRST_NAME))) {
                    return false
                }
                val __firstNameLoaded = 
                    this.__firstNameValue !== null
                if (__firstNameLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_FIRST_NAME)))) {
                    return false
                }
                if (__firstNameLoaded && this.__firstNameValue != __other.firstName) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_LAST_NAME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_LAST_NAME))) {
                    return false
                }
                val __lastNameLoaded = 
                    this.__lastNameValue !== null
                if (__lastNameLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_LAST_NAME)))) {
                    return false
                }
                if (__lastNameLoaded && this.__lastNameValue != __other.lastName) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_GENDER)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_GENDER))) {
                    return false
                }
                val __genderLoaded = 
                    this.__genderValue !== null
                if (__genderLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_GENDER)))) {
                    return false
                }
                if (__genderLoaded && this.__genderValue != __other.gender) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_FULL_NAME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_FULL_NAME))) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_IDS)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_COURSE_IDS))) {
                    return false
                }
                val __courseIdsLoaded = 
                    this.__courseIdsValue !== null
                if (__courseIdsLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_COURSE_IDS)))) {
                    return false
                }
                if (__courseIdsLoaded && this.__courseIdsValue !== __other.courseIds) {
                    return false
                }
                return true
            }

            override fun equals(other: Any?): Boolean {
                val __other = other as? Implementor
                if (__other === null) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_USER_ID)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_USER_ID))) {
                    return false
                }
                val __userIdLoaded = 
                    this.__userIdLoaded
                if (__userIdLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_USER_ID)))) {
                    return false
                }
                if (__userIdLoaded) {
                    return this.__userIdValue == __other.userId
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
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_TIME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_UPDATE_TIME))) {
                    return false
                }
                val __updateTimeLoaded = 
                    this.__updateTimeLoaded
                if (__updateTimeLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_UPDATE_TIME)))) {
                    return false
                }
                if (__updateTimeLoaded && this.__updateTimeValue != __other.updateTime) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false
                }
                val __createByLoaded = 
                    this.__createByLoaded
                if (__createByLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY)))) {
                    return false
                }
                if (__createByLoaded && this.__createByValue != __other.createBy) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false
                }
                val __updateByLoaded = 
                    this.__updateByLoaded
                if (__updateByLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY)))) {
                    return false
                }
                if (__updateByLoaded && this.__updateByValue != __other.updateBy) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARK)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_REMARK))) {
                    return false
                }
                val __remarkLoaded = 
                    this.__remarkLoaded
                if (__remarkLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_REMARK)))) {
                    return false
                }
                if (__remarkLoaded && this.__remarkValue != __other.remark) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_FIRST_NAME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_FIRST_NAME))) {
                    return false
                }
                val __firstNameLoaded = 
                    this.__firstNameValue !== null
                if (__firstNameLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_FIRST_NAME)))) {
                    return false
                }
                if (__firstNameLoaded && this.__firstNameValue != __other.firstName) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_LAST_NAME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_LAST_NAME))) {
                    return false
                }
                val __lastNameLoaded = 
                    this.__lastNameValue !== null
                if (__lastNameLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_LAST_NAME)))) {
                    return false
                }
                if (__lastNameLoaded && this.__lastNameValue != __other.lastName) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_GENDER)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_GENDER))) {
                    return false
                }
                val __genderLoaded = 
                    this.__genderValue !== null
                if (__genderLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_GENDER)))) {
                    return false
                }
                if (__genderLoaded && this.__genderValue != __other.gender) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_FULL_NAME)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_FULL_NAME))) {
                    return false
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_IDS)) !=
                        __other.__isVisible(PropId.byIndex(SLOT_COURSE_IDS))) {
                    return false
                }
                val __courseIdsLoaded = 
                    this.__courseIdsValue !== null
                if (__courseIdsLoaded != (__other.__isLoaded(PropId.byIndex(SLOT_COURSE_IDS)))) {
                    return false
                }
                if (__courseIdsLoaded && this.__courseIdsValue != __other.courseIds) {
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
            base: Student?,
        ) : Implementor, StudentDraft, DraftSpi {
            private val __ctx: DraftContext? = ctx

            private val __base: Impl? = base as Impl?

            private var __modified: Impl? = if (base === null) Impl() else null

            public var __resolving: Boolean = false

            override var userId: Long
                get() = (__modified ?: __base!!).userId
                set(userId) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__userIdValue = userId
                    __tmpModified.__userIdLoaded = true
                }

            override var createTime: LocalDateTime?
                get() = (__modified ?: __base!!).createTime
                set(createTime) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__createTimeValue = createTime
                    __tmpModified.__createTimeLoaded = true
                }

            override var updateTime: LocalDateTime?
                get() = (__modified ?: __base!!).updateTime
                set(updateTime) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__updateTimeValue = updateTime
                    __tmpModified.__updateTimeLoaded = true
                }

            override var createBy: String?
                get() = (__modified ?: __base!!).createBy
                set(createBy) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__createByValue = createBy
                    __tmpModified.__createByLoaded = true
                }

            override var updateBy: String?
                get() = (__modified ?: __base!!).updateBy
                set(updateBy) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__updateByValue = updateBy
                    __tmpModified.__updateByLoaded = true
                }

            override var remark: String?
                get() = (__modified ?: __base!!).remark
                set(remark) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__remarkValue = remark
                    __tmpModified.__remarkLoaded = true
                }

            override var firstName: String
                get() = (__modified ?: __base!!).firstName
                set(firstName) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__firstNameValue = firstName
                }

            override var lastName: String
                get() = (__modified ?: __base!!).lastName
                set(lastName) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__lastNameValue = lastName
                }

            override var gender: Gender
                get() = (__modified ?: __base!!).gender
                set(gender) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__genderValue = gender
                }

            override val fullName: String
                get() = (__modified ?: __base!!).fullName

            override var courseIds: List<Course>
                get() = __ctx().toDraftList((__modified ?: __base!!).courseIds, Course::class.java,
                        true)
                set(courseIds) {
                    val __tmpModified = (__modified ?: __base!!.clone())
                            .also { __modified = it }
                    __tmpModified.__courseIdsValue =
                            NonSharedList.of(__tmpModified.__courseIdsValue, courseIds)
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
            override fun courseIds(): MutableList<CourseDraft> {
                if (!__isLoaded(PropId.byIndex(SLOT_COURSE_IDS))) {
                    courseIds = emptyList()
                }
                return courseIds as MutableList<CourseDraft>
            }

            override fun __unload(prop: PropId) {
                when (prop.asIndex()) {
                    -1 ->
                    	__unload(prop.asName())
                    SLOT_CREATE_TIME ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__createTimeLoaded = false
                    SLOT_UPDATE_TIME ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__updateTimeLoaded = false
                    SLOT_CREATE_BY ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__createByLoaded = false
                    SLOT_UPDATE_BY ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__updateByLoaded = false
                    SLOT_REMARK ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__remarkLoaded = false
                    SLOT_USER_ID ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__userIdLoaded = false
                    SLOT_FIRST_NAME ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__firstNameValue = null
                    SLOT_LAST_NAME ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__lastNameValue = null
                    SLOT_GENDER ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__genderValue = null
                    SLOT_FULL_NAME ->
                    	{}
                    SLOT_COURSE_IDS ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__courseIdsValue = null
                    else -> throw IllegalArgumentException(
                        "Illegal property name" + 
                        " for \"org.example.org.example.domain.Student\": " + 
                        prop
                    )

                }
            }

            override fun __unload(prop: String) {
                when (prop) {
                    "createTime" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__createTimeLoaded = false
                    "updateTime" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__updateTimeLoaded = false
                    "createBy" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__createByLoaded = false
                    "updateBy" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__updateByLoaded = false
                    "remark" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__remarkLoaded = false
                    "userId" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__userIdLoaded = false
                    "firstName" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__firstNameValue = null
                    "lastName" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__lastNameValue = null
                    "gender" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__genderValue = null
                    "fullName" ->
                    	{}
                    "courseIds" ->
                    	(__modified ?: __base!!.clone())
                                .also { __modified = it }
                                .__courseIdsValue = null
                    else -> throw IllegalArgumentException(
                        "Illegal property name" + 
                        " for \"org.example.org.example.domain.Student\": " + 
                        prop
                    )

                }
            }

            override fun __set(prop: PropId, `value`: Any?) {
                when (prop.asIndex()) {
                    -1 ->
                    	__set(prop.asName(), value)
                    SLOT_CREATE_TIME ->
                    	this.createTime = value as LocalDateTime?
                    SLOT_UPDATE_TIME ->
                    	this.updateTime = value as LocalDateTime?
                    SLOT_CREATE_BY ->
                    	this.createBy = value as String?
                    SLOT_UPDATE_BY ->
                    	this.updateBy = value as String?
                    SLOT_REMARK ->
                    	this.remark = value as String?
                    SLOT_USER_ID ->
                    	this.userId = value as Long?
                    	?: throw IllegalArgumentException("'userId cannot be null")
                    SLOT_FIRST_NAME ->
                    	this.firstName = value as String?
                    	?: throw IllegalArgumentException("'firstName cannot be null")
                    SLOT_LAST_NAME ->
                    	this.lastName = value as String?
                    	?: throw IllegalArgumentException("'lastName cannot be null")
                    SLOT_GENDER ->
                    	this.gender = value as Gender?
                    	?: throw IllegalArgumentException("'gender cannot be null")
                    SLOT_FULL_NAME ->
                    	return //fullName is readonly, ignore
                    SLOT_COURSE_IDS ->
                    	this.courseIds = value as List<Course>?
                    	?: throw IllegalArgumentException("'courseIds cannot be null")
                    else -> throw IllegalArgumentException(
                        "Illegal property name" + 
                        " for \"org.example.org.example.domain.Student\": " + 
                        prop
                    )

                }
            }

            override fun __set(prop: String, `value`: Any?) {
                when (prop) {
                    "createTime" ->
                    	this.createTime = value as LocalDateTime?
                    "updateTime" ->
                    	this.updateTime = value as LocalDateTime?
                    "createBy" ->
                    	this.createBy = value as String?
                    "updateBy" ->
                    	this.updateBy = value as String?
                    "remark" ->
                    	this.remark = value as String?
                    "userId" ->
                    	this.userId = value as Long?
                    	?: throw IllegalArgumentException("'userId cannot be null")
                    "firstName" ->
                    	this.firstName = value as String?
                    	?: throw IllegalArgumentException("'firstName cannot be null")
                    "lastName" ->
                    	this.lastName = value as String?
                    	?: throw IllegalArgumentException("'lastName cannot be null")
                    "gender" ->
                    	this.gender = value as Gender?
                    	?: throw IllegalArgumentException("'gender cannot be null")
                    "fullName" ->
                    	return //fullName is readonly, ignore
                    "courseIds" ->
                    	this.courseIds = value as List<Course>?
                    	?: throw IllegalArgumentException("'courseIds cannot be null")
                    else -> throw IllegalArgumentException(
                        "Illegal property name" + 
                        " for \"org.example.org.example.domain.Student\": " + 
                        prop
                    )

                }
            }

            override fun __show(prop: PropId, visible: Boolean) {
                val __visibility = (__modified ?: __base!!).__visibility
                    ?: if (visible) {
                        null
                    } else {
                        Visibility.of(11).also{
                            (__modified ?: __base!!.clone())
                            .also { __modified = it }.__visibility = it}
                    }
                    ?: return
                when (prop.asIndex()) {
                    -1 ->
                    	__show(prop.asName(), visible)
                    SLOT_CREATE_TIME ->
                    	__visibility.show(SLOT_CREATE_TIME, visible)
                    SLOT_UPDATE_TIME ->
                    	__visibility.show(SLOT_UPDATE_TIME, visible)
                    SLOT_CREATE_BY ->
                    	__visibility.show(SLOT_CREATE_BY, visible)
                    SLOT_UPDATE_BY ->
                    	__visibility.show(SLOT_UPDATE_BY, visible)
                    SLOT_REMARK ->
                    	__visibility.show(SLOT_REMARK, visible)
                    SLOT_USER_ID ->
                    	__visibility.show(SLOT_USER_ID, visible)
                    SLOT_FIRST_NAME ->
                    	__visibility.show(SLOT_FIRST_NAME, visible)
                    SLOT_LAST_NAME ->
                    	__visibility.show(SLOT_LAST_NAME, visible)
                    SLOT_GENDER ->
                    	__visibility.show(SLOT_GENDER, visible)
                    SLOT_FULL_NAME ->
                    	__visibility.show(SLOT_FULL_NAME, visible)
                    SLOT_COURSE_IDS ->
                    	__visibility.show(SLOT_COURSE_IDS, visible)
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
                        Visibility.of(11).also{
                            (__modified ?: __base!!.clone())
                            .also { __modified = it }.__visibility = it}
                    }
                    ?: return
                when (prop) {
                    "createTime" ->
                    	__visibility.show(SLOT_CREATE_TIME, visible)
                    "updateTime" ->
                    	__visibility.show(SLOT_UPDATE_TIME, visible)
                    "createBy" ->
                    	__visibility.show(SLOT_CREATE_BY, visible)
                    "updateBy" ->
                    	__visibility.show(SLOT_UPDATE_BY, visible)
                    "remark" ->
                    	__visibility.show(SLOT_REMARK, visible)
                    "userId" ->
                    	__visibility.show(SLOT_USER_ID, visible)
                    "firstName" ->
                    	__visibility.show(SLOT_FIRST_NAME, visible)
                    "lastName" ->
                    	__visibility.show(SLOT_LAST_NAME, visible)
                    "gender" ->
                    	__visibility.show(SLOT_GENDER, visible)
                    "fullName" ->
                    	__visibility.show(SLOT_FULL_NAME, visible)
                    "courseIds" ->
                    	__visibility.show(SLOT_COURSE_IDS, visible)
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
                        if (__isLoaded(PropId.byIndex(SLOT_COURSE_IDS))) {
                            val oldValue = base!!.courseIds
                            val newValue = __ctx.resolveList(oldValue)
                            if (oldValue !== newValue) {
                                courseIds = newValue
                            }
                        }
                        __tmpModified = __modified
                    } else {
                        __tmpModified.__courseIdsValue =
                                NonSharedList.of(__tmpModified.__courseIdsValue,
                                __ctx.resolveList(__tmpModified.__courseIdsValue))
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

        init {
            __draft.__show(PropId.byIndex(`$`.SLOT_FIRST_NAME), false)
            __draft.__show(PropId.byIndex(`$`.SLOT_LAST_NAME), false)
            __draft.__show(PropId.byIndex(`$`.SLOT_FULL_NAME), false)
        }

        public fun userId(userId: Long?): Builder {
            if (userId !== null) {
                __draft.userId = userId
                __draft.__show(PropId.byIndex(`$`.SLOT_USER_ID), true)
            }
            return this
        }

        public fun createTime(createTime: LocalDateTime?): Builder {
            __draft.createTime = createTime
            __draft.__show(PropId.byIndex(`$`.SLOT_CREATE_TIME), true)
            return this
        }

        public fun updateTime(updateTime: LocalDateTime?): Builder {
            __draft.updateTime = updateTime
            __draft.__show(PropId.byIndex(`$`.SLOT_UPDATE_TIME), true)
            return this
        }

        public fun createBy(createBy: String?): Builder {
            __draft.createBy = createBy
            __draft.__show(PropId.byIndex(`$`.SLOT_CREATE_BY), true)
            return this
        }

        public fun updateBy(updateBy: String?): Builder {
            __draft.updateBy = updateBy
            __draft.__show(PropId.byIndex(`$`.SLOT_UPDATE_BY), true)
            return this
        }

        public fun remark(remark: String?): Builder {
            __draft.remark = remark
            __draft.__show(PropId.byIndex(`$`.SLOT_REMARK), true)
            return this
        }

        public fun firstName(firstName: String?): Builder {
            if (firstName !== null) {
                __draft.firstName = firstName
                __draft.__show(PropId.byIndex(`$`.SLOT_FIRST_NAME), true)
            }
            return this
        }

        public fun lastName(lastName: String?): Builder {
            if (lastName !== null) {
                __draft.lastName = lastName
                __draft.__show(PropId.byIndex(`$`.SLOT_LAST_NAME), true)
            }
            return this
        }

        public fun gender(gender: Gender?): Builder {
            if (gender !== null) {
                __draft.gender = gender
                __draft.__show(PropId.byIndex(`$`.SLOT_GENDER), true)
            }
            return this
        }

        public fun courseIds(courseIds: List<Course>?): Builder {
            if (courseIds !== null) {
                __draft.courseIds = courseIds
                __draft.__show(PropId.byIndex(`$`.SLOT_COURSE_IDS), true)
            }
            return this
        }

        public fun build(): Student = __draft.__unwrap() as Student
    }
}

public fun ImmutableCreator<Student>.`by`(base: Student? = null, block: StudentDraft.() -> Unit =
        {}): Student = StudentDraft.`$`.produce(base, block)

public operator fun ImmutableCompanion<Student>.invoke(base: Student? = null,
        block: StudentDraft.() -> Unit): Student = StudentDraft.`$`.produce(base, block)

public fun MutableList<StudentDraft>.addBy(base: Student? = null, block: StudentDraft.() -> Unit =
        {}): MutableList<StudentDraft> {
    add(StudentDraft.`$`.produce(base, block) as StudentDraft)
    return this
}

public fun Student.copy(block: StudentDraft.() -> Unit): Student = StudentDraft.`$`.produce(this,
        block)
