package org.jimmer.jimmerdatasouce.domain;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Course.class
)
public class CourseTableEx extends CourseTable implements TableEx<Course> {
    public static final CourseTableEx $ = new CourseTableEx(CourseTable.$, null);

    public CourseTableEx() {
        super();
    }

    public CourseTableEx(AbstractTypedTable.DelayedOperation<Course> delayedOperation) {
        super(delayedOperation);
    }

    public CourseTableEx(TableImplementor<Course> table) {
        super(table);
    }

    protected CourseTableEx(CourseTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public StudentTableEx students() {
        __beforeJoin();
        if (raw != null) {
            return new StudentTableEx(raw.joinImplementor(CourseProps.STUDENTS.unwrap()));
        }
        return new StudentTableEx(joinOperation(CourseProps.STUDENTS.unwrap()));
    }

    public StudentTableEx students(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new StudentTableEx(raw.joinImplementor(CourseProps.STUDENTS.unwrap(), joinType));
        }
        return new StudentTableEx(joinOperation(CourseProps.STUDENTS.unwrap(), joinType));
    }

    @Override
    public Predicate students(Function<StudentTableEx, Predicate> block) {
        return exists(CourseProps.STUDENTS.unwrap(), block);
    }

    @Override
    public CourseTableEx asTableEx() {
        return this;
    }

    @Override
    public CourseTableEx __disableJoin(String reason) {
        return new CourseTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<CourseTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<CourseTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
