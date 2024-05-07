package org.jimmer.jimmerdatasouce.domain;

import java.lang.Long;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = Course.class
)
@PropsFor(Course.class)
public interface CourseProps extends Props {
    TypedProp.Scalar<Course, Long> COURSE_ID = 
        TypedProp.scalar(ImmutableType.get(Course.class).getProp("courseId"));

    TypedProp.Scalar<Course, String> COURSE_NAME = 
        TypedProp.scalar(ImmutableType.get(Course.class).getProp("courseName"));

    TypedProp.Scalar<Course, String> COURSE_CODE = 
        TypedProp.scalar(ImmutableType.get(Course.class).getProp("courseCode"));

    TypedProp.Scalar<Course, LocalDateTime> CREATE_TIME = 
        TypedProp.scalar(ImmutableType.get(Course.class).getProp("createTime"));

    TypedProp.ReferenceList<Course, Student> STUDENTS = 
        TypedProp.referenceList(ImmutableType.get(Course.class).getProp("students"));

    PropExpression.Num<Long> courseId();

    PropExpression.Str courseName();

    PropExpression.Str courseCode();

    PropExpression.Cmp<LocalDateTime> createTime();

    Predicate students(Function<StudentTableEx, Predicate> block);
}
