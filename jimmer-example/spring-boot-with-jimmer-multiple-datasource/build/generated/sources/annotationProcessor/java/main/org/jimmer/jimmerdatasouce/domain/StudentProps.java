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
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = Student.class
)
@PropsFor(Student.class)
public interface StudentProps extends BaseEntityProps {
    TypedProp.Scalar<Student, Long> USER_ID = 
        TypedProp.scalar(ImmutableType.get(Student.class).getProp("userId"));

    TypedProp.Scalar<Student, LocalDateTime> CREATE_TIME = 
        TypedProp.scalar(ImmutableType.get(Student.class).getProp("createTime"));

    TypedProp.Scalar<Student, LocalDateTime> UPDATE_TIME = 
        TypedProp.scalar(ImmutableType.get(Student.class).getProp("updateTime"));

    TypedProp.Scalar<Student, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(Student.class).getProp("createBy"));

    TypedProp.Scalar<Student, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(Student.class).getProp("updateBy"));

    TypedProp.Scalar<Student, String> REMARK = 
        TypedProp.scalar(ImmutableType.get(Student.class).getProp("remark"));

    TypedProp.Scalar<Student, String> FIRST_NAME = 
        TypedProp.scalar(ImmutableType.get(Student.class).getProp("firstName"));

    TypedProp.Scalar<Student, String> LAST_NAME = 
        TypedProp.scalar(ImmutableType.get(Student.class).getProp("lastName"));

    TypedProp.Scalar<Student, Gender> GENDER = 
        TypedProp.scalar(ImmutableType.get(Student.class).getProp("gender"));

    TypedProp.Scalar<Student, String> FULL_NAME = 
        TypedProp.scalar(ImmutableType.get(Student.class).getProp("fullName"));

    TypedProp.ReferenceList<Student, Course> COURSES = 
        TypedProp.referenceList(ImmutableType.get(Student.class).getProp("courses"));

    PropExpression.Num<Long> userId();

    PropExpression.Str firstName();

    PropExpression.Str lastName();

    PropExpression.Cmp<Gender> gender();

    Predicate courses(Function<CourseTableEx, Predicate> block);
}
