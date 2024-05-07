package org.jimmer.jimmerdatasouce.domain;

import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Student.class
)
public class StudentTable extends AbstractTypedTable<Student> implements StudentProps {
    public static final StudentTable $ = new StudentTable();

    public StudentTable() {
        super(Student.class);
    }

    public StudentTable(AbstractTypedTable.DelayedOperation<Student> delayedOperation) {
        super(Student.class, delayedOperation);
    }

    public StudentTable(TableImplementor<Student> table) {
        super(table);
    }

    protected StudentTable(StudentTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Num<Long> userId() {
        return __get(StudentProps.USER_ID.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> createTime() {
        return __get(StudentProps.CREATE_TIME.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> updateTime() {
        return __get(StudentProps.UPDATE_TIME.unwrap());
    }

    @Override
    public PropExpression.Str createBy() {
        return __get(StudentProps.CREATE_BY.unwrap());
    }

    @Override
    public PropExpression.Str updateBy() {
        return __get(StudentProps.UPDATE_BY.unwrap());
    }

    @Override
    public PropExpression.Str remark() {
        return __get(StudentProps.REMARK.unwrap());
    }

    @Override
    public PropExpression.Str firstName() {
        return __get(StudentProps.FIRST_NAME.unwrap());
    }

    @Override
    public PropExpression.Str lastName() {
        return __get(StudentProps.LAST_NAME.unwrap());
    }

    @Override
    public PropExpression.Cmp<Gender> gender() {
        return __get(StudentProps.GENDER.unwrap());
    }

    @Override
    public Predicate courses(Function<CourseTableEx, Predicate> block) {
        return exists(StudentProps.COURSES.unwrap(), block);
    }

    @Override
    public StudentTableEx asTableEx() {
        return new StudentTableEx(this, null);
    }

    @Override
    public StudentTable __disableJoin(String reason) {
        return new StudentTable(this, reason);
    }

    @GeneratedBy(
            type = Student.class
    )
    public static class Remote extends AbstractTypedTable<Student> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Student.class, delayedOperation);
        }

        public Remote(TableImplementor<Student> table) {
            super(table);
        }

        public PropExpression.Num<Long> userId() {
            return __get(StudentProps.USER_ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<Student> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
