package org.jimmer.jimmerdatasouce.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;
import org.babyfish.jimmer.runtime.NonSharedList;
import org.babyfish.jimmer.runtime.Visibility;
import org.babyfish.jimmer.sql.ManyToMany;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        type = Student.class
)
public interface StudentDraft extends Student, BaseEntityDraft {
    StudentDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    StudentDraft setUserId(long userId);

    @OldChain
    StudentDraft setCreateTime(LocalDateTime createTime);

    @OldChain
    StudentDraft setUpdateTime(LocalDateTime updateTime);

    @OldChain
    StudentDraft setCreateBy(String createBy);

    @OldChain
    StudentDraft setUpdateBy(String updateBy);

    @OldChain
    StudentDraft setRemark(String remark);

    @OldChain
    StudentDraft setFirstName(String firstName);

    @OldChain
    StudentDraft setLastName(String lastName);

    @OldChain
    StudentDraft setGender(Gender gender);

    List<CourseDraft> courses(boolean autoCreate);

    @OldChain
    StudentDraft setCourses(List<Course> courses);

    @OldChain
    StudentDraft addIntoCourses(DraftConsumer<CourseDraft> block);

    @OldChain
    StudentDraft addIntoCourses(Course base, DraftConsumer<CourseDraft> block);

    @GeneratedBy(
            type = Student.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_USER_ID = 5;

        public static final int SLOT_CREATE_TIME = 0;

        public static final int SLOT_UPDATE_TIME = 1;

        public static final int SLOT_CREATE_BY = 2;

        public static final int SLOT_UPDATE_BY = 3;

        public static final int SLOT_REMARK = 4;

        public static final int SLOT_FIRST_NAME = 6;

        public static final int SLOT_LAST_NAME = 7;

        public static final int SLOT_GENDER = 8;

        public static final int SLOT_FULL_NAME = 9;

        public static final int SLOT_COURSES = 10;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.130",
                Student.class,
                Collections.singleton(BaseEntityDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (Student)base)
            )
            .redefine("createTime", SLOT_CREATE_TIME)
            .redefine("updateTime", SLOT_UPDATE_TIME)
            .redefine("createBy", SLOT_CREATE_BY)
            .redefine("updateBy", SLOT_UPDATE_BY)
            .redefine("remark", SLOT_REMARK)
            .id(SLOT_USER_ID, "userId", long.class)
            .add(SLOT_FIRST_NAME, "firstName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_LAST_NAME, "lastName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_GENDER, "gender", ImmutablePropCategory.SCALAR, Gender.class, false)
            .add(SLOT_FULL_NAME, "fullName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_COURSES, "courses", ManyToMany.class, Course.class, false)
            .build();

        private Producer() {
        }

        public Student produce(DraftConsumer<StudentDraft> block) {
            return produce(null, block);
        }

        public Student produce(Student base, DraftConsumer<StudentDraft> block) {
            return (Student)Internal.produce(TYPE, base, block);
        }

        @GeneratedBy(
                type = Student.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "createTime", "updateTime", "createBy", "updateBy", "remark", "userId", "firstName", "lastName", "gender", "fullName", "courses"})
        public abstract interface Implementor extends Student, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_CREATE_TIME:
                    		return createTime();
                    case SLOT_UPDATE_TIME:
                    		return updateTime();
                    case SLOT_CREATE_BY:
                    		return createBy();
                    case SLOT_UPDATE_BY:
                    		return updateBy();
                    case SLOT_REMARK:
                    		return remark();
                    case SLOT_USER_ID:
                    		return (Long)userId();
                    case SLOT_FIRST_NAME:
                    		return firstName();
                    case SLOT_LAST_NAME:
                    		return lastName();
                    case SLOT_GENDER:
                    		return gender();
                    case SLOT_FULL_NAME:
                    		return fullName();
                    case SLOT_COURSES:
                    		return courses();
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Student\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "createTime":
                    		return createTime();
                    case "updateTime":
                    		return updateTime();
                    case "createBy":
                    		return createBy();
                    case "updateBy":
                    		return updateBy();
                    case "remark":
                    		return remark();
                    case "userId":
                    		return (Long)userId();
                    case "firstName":
                    		return firstName();
                    case "lastName":
                    		return lastName();
                    case "gender":
                    		return gender();
                    case "fullName":
                    		return fullName();
                    case "courses":
                    		return courses();
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Student\": \"" + prop + "\"");
                }
            }

            default long getUserId() {
                return userId();
            }

            @Nullable
            default LocalDateTime getCreateTime() {
                return createTime();
            }

            @Nullable
            default LocalDateTime getUpdateTime() {
                return updateTime();
            }

            @Nullable
            default String getCreateBy() {
                return createBy();
            }

            @Nullable
            default String getUpdateBy() {
                return updateBy();
            }

            @Nullable
            default String getRemark() {
                return remark();
            }

            default String getFirstName() {
                return firstName();
            }

            default String getLastName() {
                return lastName();
            }

            default Gender getGender() {
                return gender();
            }

            default String getFullName() {
                return fullName();
            }

            default List<Course> getCourses() {
                return courses();
            }

            @Override
            default ImmutableType __type() {
                return TYPE;
            }

            default int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        @GeneratedBy(
                type = Student.class
        )
        private static class Impl implements Implementor, Cloneable, Serializable {
            private Visibility __visibility;

            long __userIdValue;

            boolean __userIdLoaded = false;

            LocalDateTime __createTimeValue;

            boolean __createTimeLoaded = false;

            LocalDateTime __updateTimeValue;

            boolean __updateTimeLoaded = false;

            String __createByValue;

            boolean __createByLoaded = false;

            String __updateByValue;

            boolean __updateByLoaded = false;

            String __remarkValue;

            boolean __remarkLoaded = false;

            String __firstNameValue;

            String __lastNameValue;

            Gender __genderValue;

            NonSharedList<Course> __coursesValue;

            Impl() {
                __visibility = Visibility.of(11);
                __visibility.show(SLOT_FULL_NAME, false);
            }

            @Override
            @JsonIgnore
            public long userId() {
                if (!__userIdLoaded) {
                    throw new UnloadedException(Student.class, "userId");
                }
                return __userIdValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public LocalDateTime createTime() {
                if (!__createTimeLoaded) {
                    throw new UnloadedException(Student.class, "createTime");
                }
                return __createTimeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public LocalDateTime updateTime() {
                if (!__updateTimeLoaded) {
                    throw new UnloadedException(Student.class, "updateTime");
                }
                return __updateTimeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String createBy() {
                if (!__createByLoaded) {
                    throw new UnloadedException(Student.class, "createBy");
                }
                return __createByValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String updateBy() {
                if (!__updateByLoaded) {
                    throw new UnloadedException(Student.class, "updateBy");
                }
                return __updateByValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String remark() {
                if (!__remarkLoaded) {
                    throw new UnloadedException(Student.class, "remark");
                }
                return __remarkValue;
            }

            @Override
            @JsonIgnore
            public String firstName() {
                if (__firstNameValue == null) {
                    throw new UnloadedException(Student.class, "firstName");
                }
                return __firstNameValue;
            }

            @Override
            @JsonIgnore
            public String lastName() {
                if (__lastNameValue == null) {
                    throw new UnloadedException(Student.class, "lastName");
                }
                return __lastNameValue;
            }

            @Override
            @JsonIgnore
            public Gender gender() {
                if (__genderValue == null) {
                    throw new UnloadedException(Student.class, "gender");
                }
                return __genderValue;
            }

            @Override
            @JsonIgnore
            public List<Course> courses() {
                if (__coursesValue == null) {
                    throw new UnloadedException(Student.class, "courses");
                }
                return __coursesValue;
            }

            @Override
            public Impl clone() {
                try {
                    return (Impl)super.clone();
                } catch(CloneNotSupportedException ex) {
                    throw new AssertionError(ex);
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isLoaded(prop.asName());
                    case SLOT_CREATE_TIME:
                    		return __createTimeLoaded;
                    case SLOT_UPDATE_TIME:
                    		return __updateTimeLoaded;
                    case SLOT_CREATE_BY:
                    		return __createByLoaded;
                    case SLOT_UPDATE_BY:
                    		return __updateByLoaded;
                    case SLOT_REMARK:
                    		return __remarkLoaded;
                    case SLOT_USER_ID:
                    		return __userIdLoaded;
                    case SLOT_FIRST_NAME:
                    		return __firstNameValue != null;
                    case SLOT_LAST_NAME:
                    		return __lastNameValue != null;
                    case SLOT_GENDER:
                    		return __genderValue != null;
                    case SLOT_FULL_NAME:
                    		return __isLoaded(PropId.byIndex(SLOT_FIRST_NAME)) && 
                        __isLoaded(PropId.byIndex(SLOT_LAST_NAME));
                    case SLOT_COURSES:
                    		return __coursesValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Student\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "createTime":
                    		return __createTimeLoaded;
                    case "updateTime":
                    		return __updateTimeLoaded;
                    case "createBy":
                    		return __createByLoaded;
                    case "updateBy":
                    		return __updateByLoaded;
                    case "remark":
                    		return __remarkLoaded;
                    case "userId":
                    		return __userIdLoaded;
                    case "firstName":
                    		return __firstNameValue != null;
                    case "lastName":
                    		return __lastNameValue != null;
                    case "gender":
                    		return __genderValue != null;
                    case "fullName":
                    		return __isLoaded(PropId.byIndex(SLOT_FIRST_NAME)) && 
                        __isLoaded(PropId.byIndex(SLOT_LAST_NAME));
                    case "courses":
                    		return __coursesValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Student\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isVisible(PropId prop) {
                if (__visibility == null) {
                    return true;
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isVisible(prop.asName());
                    case SLOT_CREATE_TIME:
                    		return __visibility.visible(SLOT_CREATE_TIME);
                    case SLOT_UPDATE_TIME:
                    		return __visibility.visible(SLOT_UPDATE_TIME);
                    case SLOT_CREATE_BY:
                    		return __visibility.visible(SLOT_CREATE_BY);
                    case SLOT_UPDATE_BY:
                    		return __visibility.visible(SLOT_UPDATE_BY);
                    case SLOT_REMARK:
                    		return __visibility.visible(SLOT_REMARK);
                    case SLOT_USER_ID:
                    		return __visibility.visible(SLOT_USER_ID);
                    case SLOT_FIRST_NAME:
                    		return __visibility.visible(SLOT_FIRST_NAME);
                    case SLOT_LAST_NAME:
                    		return __visibility.visible(SLOT_LAST_NAME);
                    case SLOT_GENDER:
                    		return __visibility.visible(SLOT_GENDER);
                    case SLOT_FULL_NAME:
                    		return __visibility.visible(SLOT_FULL_NAME);
                    case SLOT_COURSES:
                    		return __visibility.visible(SLOT_COURSES);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "createTime":
                    		return __visibility.visible(SLOT_CREATE_TIME);
                    case "updateTime":
                    		return __visibility.visible(SLOT_UPDATE_TIME);
                    case "createBy":
                    		return __visibility.visible(SLOT_CREATE_BY);
                    case "updateBy":
                    		return __visibility.visible(SLOT_UPDATE_BY);
                    case "remark":
                    		return __visibility.visible(SLOT_REMARK);
                    case "userId":
                    		return __visibility.visible(SLOT_USER_ID);
                    case "firstName":
                    		return __visibility.visible(SLOT_FIRST_NAME);
                    case "lastName":
                    		return __visibility.visible(SLOT_LAST_NAME);
                    case "gender":
                    		return __visibility.visible(SLOT_GENDER);
                    case "fullName":
                    		return __visibility.visible(SLOT_FULL_NAME);
                    case "courses":
                    		return __visibility.visible(SLOT_COURSES);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__userIdLoaded) {
                    hash = 31 * hash + Long.hashCode(__userIdValue);
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (__createTimeLoaded && __createTimeValue != null) {
                    hash = 31 * hash + __createTimeValue.hashCode();
                }
                if (__updateTimeLoaded && __updateTimeValue != null) {
                    hash = 31 * hash + __updateTimeValue.hashCode();
                }
                if (__createByLoaded && __createByValue != null) {
                    hash = 31 * hash + __createByValue.hashCode();
                }
                if (__updateByLoaded && __updateByValue != null) {
                    hash = 31 * hash + __updateByValue.hashCode();
                }
                if (__remarkLoaded && __remarkValue != null) {
                    hash = 31 * hash + __remarkValue.hashCode();
                }
                if (__firstNameValue != null) {
                    hash = 31 * hash + __firstNameValue.hashCode();
                }
                if (__lastNameValue != null) {
                    hash = 31 * hash + __lastNameValue.hashCode();
                }
                if (__genderValue != null) {
                    hash = 31 * hash + __genderValue.hashCode();
                }
                if (__coursesValue != null) {
                    hash = 31 * hash + __coursesValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__userIdLoaded) {
                    hash = 31 * hash + Long.hashCode(__userIdValue);
                }
                if (__createTimeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__createTimeValue);
                }
                if (__updateTimeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__updateTimeValue);
                }
                if (__createByLoaded) {
                    hash = 31 * hash + System.identityHashCode(__createByValue);
                }
                if (__updateByLoaded) {
                    hash = 31 * hash + System.identityHashCode(__updateByValue);
                }
                if (__remarkLoaded) {
                    hash = 31 * hash + System.identityHashCode(__remarkValue);
                }
                if (__firstNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__firstNameValue);
                }
                if (__lastNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__lastNameValue);
                }
                if (__genderValue != null) {
                    hash = 31 * hash + System.identityHashCode(__genderValue);
                }
                if (__coursesValue != null) {
                    hash = 31 * hash + System.identityHashCode(__coursesValue);
                }
                return hash;
            }

            @Override
            public int __hashCode(boolean shallow) {
                return shallow ? __shallowHashCode() : hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_USER_ID)) != __other.__isVisible(PropId.byIndex(SLOT_USER_ID))) {
                    return false;
                }
                boolean __userIdLoaded = this.__userIdLoaded;
                if (__userIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER_ID))) {
                    return false;
                }
                if (__userIdLoaded) {
                    // If entity-id is loaded, return directly
                    return __userIdValue == __other.userId();
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_TIME))) {
                    return false;
                }
                boolean __createTimeLoaded = this.__createTimeLoaded;
                if (__createTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_TIME))) {
                    return false;
                }
                if (__createTimeLoaded && !Objects.equals(__createTimeValue, __other.createTime())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_TIME))) {
                    return false;
                }
                boolean __updateTimeLoaded = this.__updateTimeLoaded;
                if (__updateTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_TIME))) {
                    return false;
                }
                if (__updateTimeLoaded && !Objects.equals(__updateTimeValue, __other.updateTime())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                boolean __createByLoaded = this.__createByLoaded;
                if (__createByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                if (__createByLoaded && !Objects.equals(__createByValue, __other.createBy())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                boolean __updateByLoaded = this.__updateByLoaded;
                if (__updateByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                if (__updateByLoaded && !Objects.equals(__updateByValue, __other.updateBy())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARK)) != __other.__isVisible(PropId.byIndex(SLOT_REMARK))) {
                    return false;
                }
                boolean __remarkLoaded = this.__remarkLoaded;
                if (__remarkLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARK))) {
                    return false;
                }
                if (__remarkLoaded && !Objects.equals(__remarkValue, __other.remark())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FIRST_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_FIRST_NAME))) {
                    return false;
                }
                boolean __firstNameLoaded = __firstNameValue != null;
                if (__firstNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FIRST_NAME))) {
                    return false;
                }
                if (__firstNameLoaded && !Objects.equals(__firstNameValue, __other.firstName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_LAST_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_LAST_NAME))) {
                    return false;
                }
                boolean __lastNameLoaded = __lastNameValue != null;
                if (__lastNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_LAST_NAME))) {
                    return false;
                }
                if (__lastNameLoaded && !Objects.equals(__lastNameValue, __other.lastName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_GENDER)) != __other.__isVisible(PropId.byIndex(SLOT_GENDER))) {
                    return false;
                }
                boolean __genderLoaded = __genderValue != null;
                if (__genderLoaded != __other.__isLoaded(PropId.byIndex(SLOT_GENDER))) {
                    return false;
                }
                if (__genderLoaded && !Objects.equals(__genderValue, __other.gender())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FULL_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_FULL_NAME))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSES)) != __other.__isVisible(PropId.byIndex(SLOT_COURSES))) {
                    return false;
                }
                boolean __coursesLoaded = __coursesValue != null;
                if (__coursesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COURSES))) {
                    return false;
                }
                if (__coursesLoaded && !Objects.equals(__coursesValue, __other.courses())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_USER_ID)) != __other.__isVisible(PropId.byIndex(SLOT_USER_ID))) {
                    return false;
                }
                boolean __userIdLoaded = this.__userIdLoaded;
                if (__userIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER_ID))) {
                    return false;
                }
                if (__userIdLoaded && __userIdValue != __other.userId()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_TIME))) {
                    return false;
                }
                boolean __createTimeLoaded = this.__createTimeLoaded;
                if (__createTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_TIME))) {
                    return false;
                }
                if (__createTimeLoaded && __createTimeValue != __other.createTime()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_TIME)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_TIME))) {
                    return false;
                }
                boolean __updateTimeLoaded = this.__updateTimeLoaded;
                if (__updateTimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_TIME))) {
                    return false;
                }
                if (__updateTimeLoaded && __updateTimeValue != __other.updateTime()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                boolean __createByLoaded = this.__createByLoaded;
                if (__createByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                if (__createByLoaded && __createByValue != __other.createBy()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                boolean __updateByLoaded = this.__updateByLoaded;
                if (__updateByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                if (__updateByLoaded && __updateByValue != __other.updateBy()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARK)) != __other.__isVisible(PropId.byIndex(SLOT_REMARK))) {
                    return false;
                }
                boolean __remarkLoaded = this.__remarkLoaded;
                if (__remarkLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARK))) {
                    return false;
                }
                if (__remarkLoaded && __remarkValue != __other.remark()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FIRST_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_FIRST_NAME))) {
                    return false;
                }
                boolean __firstNameLoaded = __firstNameValue != null;
                if (__firstNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FIRST_NAME))) {
                    return false;
                }
                if (__firstNameLoaded && __firstNameValue != __other.firstName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_LAST_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_LAST_NAME))) {
                    return false;
                }
                boolean __lastNameLoaded = __lastNameValue != null;
                if (__lastNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_LAST_NAME))) {
                    return false;
                }
                if (__lastNameLoaded && __lastNameValue != __other.lastName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_GENDER)) != __other.__isVisible(PropId.byIndex(SLOT_GENDER))) {
                    return false;
                }
                boolean __genderLoaded = __genderValue != null;
                if (__genderLoaded != __other.__isLoaded(PropId.byIndex(SLOT_GENDER))) {
                    return false;
                }
                if (__genderLoaded && __genderValue != __other.gender()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FULL_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_FULL_NAME))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSES)) != __other.__isVisible(PropId.byIndex(SLOT_COURSES))) {
                    return false;
                }
                boolean __coursesLoaded = __coursesValue != null;
                if (__coursesLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COURSES))) {
                    return false;
                }
                if (__coursesLoaded && __coursesValue != __other.courses()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }
        }

        @GeneratedBy(
                type = Student.class
        )
        private static class DraftImpl implements Implementor, DraftSpi, StudentDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, Student base) {
                __ctx = ctx;
                if (base != null) {
                    __base = (Impl)base;
                }
                else {
                    __modified = new Impl();
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isLoaded(String prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isVisible(PropId prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public boolean __isVisible(String prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public int hashCode() {
                return (__modified!= null ? __modified : __base).hashCode();
            }

            @Override
            public int __hashCode(boolean shallow) {
                return (__modified!= null ? __modified : __base).__hashCode(shallow);
            }

            @Override
            public boolean equals(Object obj) {
                return (__modified!= null ? __modified : __base).equals(obj);
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return (__modified!= null ? __modified : __base).__equals(obj, shallow);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString((__modified!= null ? __modified : __base));
            }

            @Override
            @JsonIgnore
            public long userId() {
                return (__modified!= null ? __modified : __base).userId();
            }

            @Override
            public StudentDraft setUserId(long userId) {
                Impl __tmpModified = __modified();
                __tmpModified.__userIdValue = userId;
                __tmpModified.__userIdLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public LocalDateTime createTime() {
                return (__modified!= null ? __modified : __base).createTime();
            }

            @Override
            public StudentDraft setCreateTime(LocalDateTime createTime) {
                Impl __tmpModified = __modified();
                __tmpModified.__createTimeValue = createTime;
                __tmpModified.__createTimeLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public LocalDateTime updateTime() {
                return (__modified!= null ? __modified : __base).updateTime();
            }

            @Override
            public StudentDraft setUpdateTime(LocalDateTime updateTime) {
                Impl __tmpModified = __modified();
                __tmpModified.__updateTimeValue = updateTime;
                __tmpModified.__updateTimeLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String createBy() {
                return (__modified!= null ? __modified : __base).createBy();
            }

            @Override
            public StudentDraft setCreateBy(String createBy) {
                Impl __tmpModified = __modified();
                __tmpModified.__createByValue = createBy;
                __tmpModified.__createByLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String updateBy() {
                return (__modified!= null ? __modified : __base).updateBy();
            }

            @Override
            public StudentDraft setUpdateBy(String updateBy) {
                Impl __tmpModified = __modified();
                __tmpModified.__updateByValue = updateBy;
                __tmpModified.__updateByLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String remark() {
                return (__modified!= null ? __modified : __base).remark();
            }

            @Override
            public StudentDraft setRemark(String remark) {
                Impl __tmpModified = __modified();
                __tmpModified.__remarkValue = remark;
                __tmpModified.__remarkLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String firstName() {
                return (__modified!= null ? __modified : __base).firstName();
            }

            @Override
            public StudentDraft setFirstName(String firstName) {
                if (firstName == null) {
                    throw new IllegalArgumentException(
                        "'firstName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__firstNameValue = firstName;
                return this;
            }

            @Override
            @JsonIgnore
            public String lastName() {
                return (__modified!= null ? __modified : __base).lastName();
            }

            @Override
            public StudentDraft setLastName(String lastName) {
                if (lastName == null) {
                    throw new IllegalArgumentException(
                        "'lastName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__lastNameValue = lastName;
                return this;
            }

            @Override
            @JsonIgnore
            public Gender gender() {
                return (__modified!= null ? __modified : __base).gender();
            }

            @Override
            public StudentDraft setGender(Gender gender) {
                if (gender == null) {
                    throw new IllegalArgumentException(
                        "'gender' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__genderValue = gender;
                return this;
            }

            @Override
            @JsonIgnore
            public String fullName() {
                return (__modified!= null ? __modified : __base).fullName();
            }

            @Override
            @JsonIgnore
            public List<Course> courses() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).courses(), Course.class, true);
            }

            @Override
            public List<CourseDraft> courses(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_COURSES)))) {
                    setCourses(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).courses(), Course.class, true);
            }

            @Override
            public StudentDraft setCourses(List<Course> courses) {
                if (courses == null) {
                    throw new IllegalArgumentException(
                        "'courses' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__coursesValue = NonSharedList.of(__tmpModified.__coursesValue, courses);
                return this;
            }

            @Override
            public StudentDraft addIntoCourses(DraftConsumer<CourseDraft> block) {
                addIntoCourses(null, block);
                return this;
            }

            @Override
            public StudentDraft addIntoCourses(Course base, DraftConsumer<CourseDraft> block) {
                courses(true).add((CourseDraft)CourseDraft.$.produce(base, block));
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(PropId prop, Object value) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__set(prop.asName(), value);
                    return;
                    case SLOT_CREATE_TIME:
                    		setCreateTime((LocalDateTime)value);break;
                    case SLOT_UPDATE_TIME:
                    		setUpdateTime((LocalDateTime)value);break;
                    case SLOT_CREATE_BY:
                    		setCreateBy((String)value);break;
                    case SLOT_UPDATE_BY:
                    		setUpdateBy((String)value);break;
                    case SLOT_REMARK:
                    		setRemark((String)value);break;
                    case SLOT_USER_ID:
                    		if (value == null) throw new IllegalArgumentException("'userId' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setUserId((Long)value);
                            break;
                    case SLOT_FIRST_NAME:
                    		setFirstName((String)value);break;
                    case SLOT_LAST_NAME:
                    		setLastName((String)value);break;
                    case SLOT_GENDER:
                    		setGender((Gender)value);break;
                    case SLOT_FULL_NAME:
                    		break;
                    case SLOT_COURSES:
                    		setCourses((List<Course>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Student\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "createTime":
                    		setCreateTime((LocalDateTime)value);break;
                    case "updateTime":
                    		setUpdateTime((LocalDateTime)value);break;
                    case "createBy":
                    		setCreateBy((String)value);break;
                    case "updateBy":
                    		setUpdateBy((String)value);break;
                    case "remark":
                    		setRemark((String)value);break;
                    case "userId":
                    		if (value == null) throw new IllegalArgumentException("'userId' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setUserId((Long)value);
                            break;
                    case "firstName":
                    		setFirstName((String)value);break;
                    case "lastName":
                    		setLastName((String)value);break;
                    case "gender":
                    		setGender((Gender)value);break;
                    case "fullName":
                    		break;
                    case "courses":
                    		setCourses((List<Course>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Student\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(11);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_CREATE_TIME:
                    		__visibility.show(SLOT_CREATE_TIME, visible);break;
                    case SLOT_UPDATE_TIME:
                    		__visibility.show(SLOT_UPDATE_TIME, visible);break;
                    case SLOT_CREATE_BY:
                    		__visibility.show(SLOT_CREATE_BY, visible);break;
                    case SLOT_UPDATE_BY:
                    		__visibility.show(SLOT_UPDATE_BY, visible);break;
                    case SLOT_REMARK:
                    		__visibility.show(SLOT_REMARK, visible);break;
                    case SLOT_USER_ID:
                    		__visibility.show(SLOT_USER_ID, visible);break;
                    case SLOT_FIRST_NAME:
                    		__visibility.show(SLOT_FIRST_NAME, visible);break;
                    case SLOT_LAST_NAME:
                    		__visibility.show(SLOT_LAST_NAME, visible);break;
                    case SLOT_GENDER:
                    		__visibility.show(SLOT_GENDER, visible);break;
                    case SLOT_FULL_NAME:
                    		__visibility.show(SLOT_FULL_NAME, visible);break;
                    case SLOT_COURSES:
                    		__visibility.show(SLOT_COURSES, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Student\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __show(String prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(11);
                }
                switch (prop) {
                    case "createTime":
                    		__visibility.show(SLOT_CREATE_TIME, visible);break;
                    case "updateTime":
                    		__visibility.show(SLOT_UPDATE_TIME, visible);break;
                    case "createBy":
                    		__visibility.show(SLOT_CREATE_BY, visible);break;
                    case "updateBy":
                    		__visibility.show(SLOT_UPDATE_BY, visible);break;
                    case "remark":
                    		__visibility.show(SLOT_REMARK, visible);break;
                    case "userId":
                    		__visibility.show(SLOT_USER_ID, visible);break;
                    case "firstName":
                    		__visibility.show(SLOT_FIRST_NAME, visible);break;
                    case "lastName":
                    		__visibility.show(SLOT_LAST_NAME, visible);break;
                    case "gender":
                    		__visibility.show(SLOT_GENDER, visible);break;
                    case "fullName":
                    		__visibility.show(SLOT_FULL_NAME, visible);break;
                    case "courses":
                    		__visibility.show(SLOT_COURSES, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Student\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __unload(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__unload(prop.asName());
                    return;
                    case SLOT_CREATE_TIME:
                    		__modified().__createTimeLoaded = false;break;
                    case SLOT_UPDATE_TIME:
                    		__modified().__updateTimeLoaded = false;break;
                    case SLOT_CREATE_BY:
                    		__modified().__createByLoaded = false;break;
                    case SLOT_UPDATE_BY:
                    		__modified().__updateByLoaded = false;break;
                    case SLOT_REMARK:
                    		__modified().__remarkLoaded = false;break;
                    case SLOT_USER_ID:
                    		__modified().__userIdLoaded = false;break;
                    case SLOT_FIRST_NAME:
                    		__modified().__firstNameValue = null;break;
                    case SLOT_LAST_NAME:
                    		__modified().__lastNameValue = null;break;
                    case SLOT_GENDER:
                    		__modified().__genderValue = null;break;
                    case SLOT_FULL_NAME:
                    		break;
                    case SLOT_COURSES:
                    		__modified().__coursesValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Student\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "createTime":
                    		__modified().__createTimeLoaded = false;break;
                    case "updateTime":
                    		__modified().__updateTimeLoaded = false;break;
                    case "createBy":
                    		__modified().__createByLoaded = false;break;
                    case "updateBy":
                    		__modified().__updateByLoaded = false;break;
                    case "remark":
                    		__modified().__remarkLoaded = false;break;
                    case "userId":
                    		__modified().__userIdLoaded = false;break;
                    case "firstName":
                    		__modified().__firstNameValue = null;break;
                    case "lastName":
                    		__modified().__lastNameValue = null;break;
                    case "gender":
                    		__modified().__genderValue = null;break;
                    case "fullName":
                    		break;
                    case "courses":
                    		__modified().__coursesValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Student\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public DraftContext __draftContext() {
                return __ctx;
            }

            @Override
            public Object __resolve() {
                if (__resolving) {
                    throw new CircularReferenceException();
                }
                __resolving = true;
                try {
                    Implementor base = __base;
                    Impl __tmpModified = __modified;
                    if (__tmpModified == null) {
                        if (base.__isLoaded(PropId.byIndex(SLOT_COURSES))) {
                            List<Course> oldValue = base.courses();
                            List<Course> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setCourses(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__coursesValue = NonSharedList.of(__tmpModified.__coursesValue, __ctx.resolveList(__tmpModified.__coursesValue));
                    }
                    if (__base != null && __tmpModified == null) {
                        return base;
                    }
                    return __tmpModified;
                }
                finally {
                    __resolving = false;
                }
            }

            Impl __modified() {
                Impl __tmpModified = __modified;
                if (__tmpModified == null) {
                    __tmpModified = __base.clone();
                    __modified = __tmpModified;
                }
                return __tmpModified;
            }
        }
    }

    @GeneratedBy(
            type = Student.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
            __draft.__show(PropId.byIndex(Producer.SLOT_FIRST_NAME), false);
            __draft.__show(PropId.byIndex(Producer.SLOT_LAST_NAME), false);
            __draft.__show(PropId.byIndex(Producer.SLOT_FULL_NAME), false);
        }

        public Builder userId(Long userId) {
            if (userId != null) {
                __draft.setUserId(userId);
            }
            return this;
        }

        @Nullable
        public Builder createTime(LocalDateTime createTime) {
            __draft.setCreateTime(createTime);
            return this;
        }

        @Nullable
        public Builder updateTime(LocalDateTime updateTime) {
            __draft.setUpdateTime(updateTime);
            return this;
        }

        @Nullable
        public Builder createBy(String createBy) {
            __draft.setCreateBy(createBy);
            return this;
        }

        @Nullable
        public Builder updateBy(String updateBy) {
            __draft.setUpdateBy(updateBy);
            return this;
        }

        @Nullable
        public Builder remark(String remark) {
            __draft.setRemark(remark);
            return this;
        }

        public Builder firstName(String firstName) {
            if (firstName != null) {
                __draft.setFirstName(firstName);
                __draft.__show(PropId.byIndex(Producer.SLOT_FIRST_NAME), true);
            }
            return this;
        }

        public Builder lastName(String lastName) {
            if (lastName != null) {
                __draft.setLastName(lastName);
                __draft.__show(PropId.byIndex(Producer.SLOT_LAST_NAME), true);
            }
            return this;
        }

        public Builder gender(Gender gender) {
            if (gender != null) {
                __draft.setGender(gender);
            }
            return this;
        }

        public Builder courses(List<Course> courses) {
            if (courses != null) {
                __draft.setCourses(courses);
            }
            return this;
        }

        public Student build() {
            return (Student)__draft.__modified();
        }
    }
}
