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
import org.babyfish.jimmer.Draft;
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
        type = Course.class
)
public interface CourseDraft extends Course, Draft {
    CourseDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    CourseDraft setCourseId(long courseId);

    @OldChain
    CourseDraft setCourseName(String courseName);

    @OldChain
    CourseDraft setCourseCode(String courseCode);

    @OldChain
    CourseDraft setCreateTime(LocalDateTime createTime);

    List<StudentDraft> students(boolean autoCreate);

    @OldChain
    CourseDraft setStudents(List<Student> students);

    @OldChain
    CourseDraft addIntoStudents(DraftConsumer<StudentDraft> block);

    @OldChain
    CourseDraft addIntoStudents(Student base, DraftConsumer<StudentDraft> block);

    @GeneratedBy(
            type = Course.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_COURSE_ID = 0;

        public static final int SLOT_COURSE_NAME = 1;

        public static final int SLOT_COURSE_CODE = 2;

        public static final int SLOT_CREATE_TIME = 3;

        public static final int SLOT_STUDENTS = 4;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.130",
                Course.class,
                Collections.emptyList(),
                (ctx, base) -> new DraftImpl(ctx, (Course)base)
            )
            .id(SLOT_COURSE_ID, "courseId", long.class)
            .add(SLOT_COURSE_NAME, "courseName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_COURSE_CODE, "courseCode", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_CREATE_TIME, "createTime", ImmutablePropCategory.SCALAR, LocalDateTime.class, true)
            .add(SLOT_STUDENTS, "students", ManyToMany.class, Student.class, false)
            .build();

        private Producer() {
        }

        public Course produce(DraftConsumer<CourseDraft> block) {
            return produce(null, block);
        }

        public Course produce(Course base, DraftConsumer<CourseDraft> block) {
            return (Course)Internal.produce(TYPE, base, block);
        }

        @GeneratedBy(
                type = Course.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "courseId", "courseName", "courseCode", "createTime", "students"})
        public abstract interface Implementor extends Course, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_COURSE_ID:
                    		return (Long)courseId();
                    case SLOT_COURSE_NAME:
                    		return courseName();
                    case SLOT_COURSE_CODE:
                    		return courseCode();
                    case SLOT_CREATE_TIME:
                    		return createTime();
                    case SLOT_STUDENTS:
                    		return students();
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Course\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "courseId":
                    		return (Long)courseId();
                    case "courseName":
                    		return courseName();
                    case "courseCode":
                    		return courseCode();
                    case "createTime":
                    		return createTime();
                    case "students":
                    		return students();
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Course\": \"" + prop + "\"");
                }
            }

            default long getCourseId() {
                return courseId();
            }

            default String getCourseName() {
                return courseName();
            }

            default String getCourseCode() {
                return courseCode();
            }

            @Nullable
            default LocalDateTime getCreateTime() {
                return createTime();
            }

            default List<Student> getStudents() {
                return students();
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
                type = Course.class
        )
        private static class Impl implements Implementor, Cloneable, Serializable {
            private Visibility __visibility;

            long __courseIdValue;

            boolean __courseIdLoaded = false;

            String __courseNameValue;

            String __courseCodeValue;

            LocalDateTime __createTimeValue;

            boolean __createTimeLoaded = false;

            NonSharedList<Student> __studentsValue;

            @Override
            @JsonIgnore
            public long courseId() {
                if (!__courseIdLoaded) {
                    throw new UnloadedException(Course.class, "courseId");
                }
                return __courseIdValue;
            }

            @Override
            @JsonIgnore
            public String courseName() {
                if (__courseNameValue == null) {
                    throw new UnloadedException(Course.class, "courseName");
                }
                return __courseNameValue;
            }

            @Override
            @JsonIgnore
            public String courseCode() {
                if (__courseCodeValue == null) {
                    throw new UnloadedException(Course.class, "courseCode");
                }
                return __courseCodeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public LocalDateTime createTime() {
                if (!__createTimeLoaded) {
                    throw new UnloadedException(Course.class, "createTime");
                }
                return __createTimeValue;
            }

            @Override
            @JsonIgnore
            public List<Student> students() {
                if (__studentsValue == null) {
                    throw new UnloadedException(Course.class, "students");
                }
                return __studentsValue;
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
                    case SLOT_COURSE_ID:
                    		return __courseIdLoaded;
                    case SLOT_COURSE_NAME:
                    		return __courseNameValue != null;
                    case SLOT_COURSE_CODE:
                    		return __courseCodeValue != null;
                    case SLOT_CREATE_TIME:
                    		return __createTimeLoaded;
                    case SLOT_STUDENTS:
                    		return __studentsValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Course\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "courseId":
                    		return __courseIdLoaded;
                    case "courseName":
                    		return __courseNameValue != null;
                    case "courseCode":
                    		return __courseCodeValue != null;
                    case "createTime":
                    		return __createTimeLoaded;
                    case "students":
                    		return __studentsValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Course\": \"" + prop + "\"");
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
                    case SLOT_COURSE_ID:
                    		return __visibility.visible(SLOT_COURSE_ID);
                    case SLOT_COURSE_NAME:
                    		return __visibility.visible(SLOT_COURSE_NAME);
                    case SLOT_COURSE_CODE:
                    		return __visibility.visible(SLOT_COURSE_CODE);
                    case SLOT_CREATE_TIME:
                    		return __visibility.visible(SLOT_CREATE_TIME);
                    case SLOT_STUDENTS:
                    		return __visibility.visible(SLOT_STUDENTS);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "courseId":
                    		return __visibility.visible(SLOT_COURSE_ID);
                    case "courseName":
                    		return __visibility.visible(SLOT_COURSE_NAME);
                    case "courseCode":
                    		return __visibility.visible(SLOT_COURSE_CODE);
                    case "createTime":
                    		return __visibility.visible(SLOT_CREATE_TIME);
                    case "students":
                    		return __visibility.visible(SLOT_STUDENTS);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__courseIdLoaded) {
                    hash = 31 * hash + Long.hashCode(__courseIdValue);
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (__courseNameValue != null) {
                    hash = 31 * hash + __courseNameValue.hashCode();
                }
                if (__courseCodeValue != null) {
                    hash = 31 * hash + __courseCodeValue.hashCode();
                }
                if (__createTimeLoaded && __createTimeValue != null) {
                    hash = 31 * hash + __createTimeValue.hashCode();
                }
                if (__studentsValue != null) {
                    hash = 31 * hash + __studentsValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__courseIdLoaded) {
                    hash = 31 * hash + Long.hashCode(__courseIdValue);
                }
                if (__courseNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__courseNameValue);
                }
                if (__courseCodeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__courseCodeValue);
                }
                if (__createTimeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__createTimeValue);
                }
                if (__studentsValue != null) {
                    hash = 31 * hash + System.identityHashCode(__studentsValue);
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
                if (__isVisible(PropId.byIndex(SLOT_COURSE_ID)) != __other.__isVisible(PropId.byIndex(SLOT_COURSE_ID))) {
                    return false;
                }
                boolean __courseIdLoaded = this.__courseIdLoaded;
                if (__courseIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COURSE_ID))) {
                    return false;
                }
                if (__courseIdLoaded) {
                    // If entity-id is loaded, return directly
                    return __courseIdValue == __other.courseId();
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_COURSE_NAME))) {
                    return false;
                }
                boolean __courseNameLoaded = __courseNameValue != null;
                if (__courseNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COURSE_NAME))) {
                    return false;
                }
                if (__courseNameLoaded && !Objects.equals(__courseNameValue, __other.courseName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_COURSE_CODE))) {
                    return false;
                }
                boolean __courseCodeLoaded = __courseCodeValue != null;
                if (__courseCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COURSE_CODE))) {
                    return false;
                }
                if (__courseCodeLoaded && !Objects.equals(__courseCodeValue, __other.courseCode())) {
                    return false;
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
                if (__isVisible(PropId.byIndex(SLOT_STUDENTS)) != __other.__isVisible(PropId.byIndex(SLOT_STUDENTS))) {
                    return false;
                }
                boolean __studentsLoaded = __studentsValue != null;
                if (__studentsLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STUDENTS))) {
                    return false;
                }
                if (__studentsLoaded && !Objects.equals(__studentsValue, __other.students())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_COURSE_ID)) != __other.__isVisible(PropId.byIndex(SLOT_COURSE_ID))) {
                    return false;
                }
                boolean __courseIdLoaded = this.__courseIdLoaded;
                if (__courseIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COURSE_ID))) {
                    return false;
                }
                if (__courseIdLoaded && __courseIdValue != __other.courseId()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_COURSE_NAME))) {
                    return false;
                }
                boolean __courseNameLoaded = __courseNameValue != null;
                if (__courseNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COURSE_NAME))) {
                    return false;
                }
                if (__courseNameLoaded && __courseNameValue != __other.courseName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_COURSE_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_COURSE_CODE))) {
                    return false;
                }
                boolean __courseCodeLoaded = __courseCodeValue != null;
                if (__courseCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_COURSE_CODE))) {
                    return false;
                }
                if (__courseCodeLoaded && __courseCodeValue != __other.courseCode()) {
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
                if (__isVisible(PropId.byIndex(SLOT_STUDENTS)) != __other.__isVisible(PropId.byIndex(SLOT_STUDENTS))) {
                    return false;
                }
                boolean __studentsLoaded = __studentsValue != null;
                if (__studentsLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STUDENTS))) {
                    return false;
                }
                if (__studentsLoaded && __studentsValue != __other.students()) {
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
                type = Course.class
        )
        private static class DraftImpl implements Implementor, DraftSpi, CourseDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, Course base) {
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
            public long courseId() {
                return (__modified!= null ? __modified : __base).courseId();
            }

            @Override
            public CourseDraft setCourseId(long courseId) {
                Impl __tmpModified = __modified();
                __tmpModified.__courseIdValue = courseId;
                __tmpModified.__courseIdLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String courseName() {
                return (__modified!= null ? __modified : __base).courseName();
            }

            @Override
            public CourseDraft setCourseName(String courseName) {
                if (courseName == null) {
                    throw new IllegalArgumentException(
                        "'courseName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__courseNameValue = courseName;
                return this;
            }

            @Override
            @JsonIgnore
            public String courseCode() {
                return (__modified!= null ? __modified : __base).courseCode();
            }

            @Override
            public CourseDraft setCourseCode(String courseCode) {
                if (courseCode == null) {
                    throw new IllegalArgumentException(
                        "'courseCode' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__courseCodeValue = courseCode;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public LocalDateTime createTime() {
                return (__modified!= null ? __modified : __base).createTime();
            }

            @Override
            public CourseDraft setCreateTime(LocalDateTime createTime) {
                Impl __tmpModified = __modified();
                __tmpModified.__createTimeValue = createTime;
                __tmpModified.__createTimeLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public List<Student> students() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).students(), Student.class, true);
            }

            @Override
            public List<StudentDraft> students(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_STUDENTS)))) {
                    setStudents(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).students(), Student.class, true);
            }

            @Override
            public CourseDraft setStudents(List<Student> students) {
                if (students == null) {
                    throw new IllegalArgumentException(
                        "'students' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__studentsValue = NonSharedList.of(__tmpModified.__studentsValue, students);
                return this;
            }

            @Override
            public CourseDraft addIntoStudents(DraftConsumer<StudentDraft> block) {
                addIntoStudents(null, block);
                return this;
            }

            @Override
            public CourseDraft addIntoStudents(Student base, DraftConsumer<StudentDraft> block) {
                students(true).add((StudentDraft)StudentDraft.$.produce(base, block));
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
                    case SLOT_COURSE_ID:
                    		if (value == null) throw new IllegalArgumentException("'courseId' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setCourseId((Long)value);
                            break;
                    case SLOT_COURSE_NAME:
                    		setCourseName((String)value);break;
                    case SLOT_COURSE_CODE:
                    		setCourseCode((String)value);break;
                    case SLOT_CREATE_TIME:
                    		setCreateTime((LocalDateTime)value);break;
                    case SLOT_STUDENTS:
                    		setStudents((List<Student>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Course\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "courseId":
                    		if (value == null) throw new IllegalArgumentException("'courseId' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setCourseId((Long)value);
                            break;
                    case "courseName":
                    		setCourseName((String)value);break;
                    case "courseCode":
                    		setCourseCode((String)value);break;
                    case "createTime":
                    		setCreateTime((LocalDateTime)value);break;
                    case "students":
                    		setStudents((List<Student>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Course\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(5);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_COURSE_ID:
                    		__visibility.show(SLOT_COURSE_ID, visible);break;
                    case SLOT_COURSE_NAME:
                    		__visibility.show(SLOT_COURSE_NAME, visible);break;
                    case SLOT_COURSE_CODE:
                    		__visibility.show(SLOT_COURSE_CODE, visible);break;
                    case SLOT_CREATE_TIME:
                    		__visibility.show(SLOT_CREATE_TIME, visible);break;
                    case SLOT_STUDENTS:
                    		__visibility.show(SLOT_STUDENTS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Course\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(5);
                }
                switch (prop) {
                    case "courseId":
                    		__visibility.show(SLOT_COURSE_ID, visible);break;
                    case "courseName":
                    		__visibility.show(SLOT_COURSE_NAME, visible);break;
                    case "courseCode":
                    		__visibility.show(SLOT_COURSE_CODE, visible);break;
                    case "createTime":
                    		__visibility.show(SLOT_CREATE_TIME, visible);break;
                    case "students":
                    		__visibility.show(SLOT_STUDENTS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Course\": \"" + 
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
                    case SLOT_COURSE_ID:
                    		__modified().__courseIdLoaded = false;break;
                    case SLOT_COURSE_NAME:
                    		__modified().__courseNameValue = null;break;
                    case SLOT_COURSE_CODE:
                    		__modified().__courseCodeValue = null;break;
                    case SLOT_CREATE_TIME:
                    		__modified().__createTimeLoaded = false;break;
                    case SLOT_STUDENTS:
                    		__modified().__studentsValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Course\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "courseId":
                    		__modified().__courseIdLoaded = false;break;
                    case "courseName":
                    		__modified().__courseNameValue = null;break;
                    case "courseCode":
                    		__modified().__courseCodeValue = null;break;
                    case "createTime":
                    		__modified().__createTimeLoaded = false;break;
                    case "students":
                    		__modified().__studentsValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Course\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        if (base.__isLoaded(PropId.byIndex(SLOT_STUDENTS))) {
                            List<Student> oldValue = base.students();
                            List<Student> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setStudents(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__studentsValue = NonSharedList.of(__tmpModified.__studentsValue, __ctx.resolveList(__tmpModified.__studentsValue));
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
            type = Course.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
        }

        public Builder courseId(Long courseId) {
            if (courseId != null) {
                __draft.setCourseId(courseId);
            }
            return this;
        }

        public Builder courseName(String courseName) {
            if (courseName != null) {
                __draft.setCourseName(courseName);
            }
            return this;
        }

        public Builder courseCode(String courseCode) {
            if (courseCode != null) {
                __draft.setCourseCode(courseCode);
            }
            return this;
        }

        @Nullable
        public Builder createTime(LocalDateTime createTime) {
            __draft.setCreateTime(createTime);
            return this;
        }

        public Builder students(List<Student> students) {
            if (students != null) {
                __draft.setStudents(students);
            }
            return this;
        }

        public Course build() {
            return (Course)__draft.__modified();
        }
    }
}
