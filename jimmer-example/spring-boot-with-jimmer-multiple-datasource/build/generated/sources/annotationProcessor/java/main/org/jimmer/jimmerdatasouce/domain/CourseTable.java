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
        type = Course.class
)
public class CourseTable extends AbstractTypedTable<Course> implements CourseProps {
    public static final CourseTable $ = new CourseTable();

    public CourseTable() {
        super(Course.class);
    }

    public CourseTable(AbstractTypedTable.DelayedOperation<Course> delayedOperation) {
        super(Course.class, delayedOperation);
    }

    public CourseTable(TableImplementor<Course> table) {
        super(table);
    }

    protected CourseTable(CourseTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Num<Long> courseId() {
        return __get(CourseProps.COURSE_ID.unwrap());
    }

    @Override
    public PropExpression.Str courseName() {
        return __get(CourseProps.COURSE_NAME.unwrap());
    }

    @Override
    public PropExpression.Str courseCode() {
        return __get(CourseProps.COURSE_CODE.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> createTime() {
        return __get(CourseProps.CREATE_TIME.unwrap());
    }

    @Override
    public Predicate students(Function<StudentTableEx, Predicate> block) {
        return exists(CourseProps.STUDENTS.unwrap(), block);
    }

    @Override
    public CourseTableEx asTableEx() {
        return new CourseTableEx(this, null);
    }

    @Override
    public CourseTable __disableJoin(String reason) {
        return new CourseTable(this, reason);
    }

    @GeneratedBy(
            type = Course.class
    )
    public static class Remote extends AbstractTypedTable<Course> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Course.class, delayedOperation);
        }

        public Remote(TableImplementor<Course> table) {
            super(table);
        }

        public PropExpression.Num<Long> courseId() {
            return __get(CourseProps.COURSE_ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<Course> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
