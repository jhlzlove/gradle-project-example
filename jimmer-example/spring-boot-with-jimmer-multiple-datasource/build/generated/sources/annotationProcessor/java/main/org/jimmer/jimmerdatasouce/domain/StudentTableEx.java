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
        type = Student.class
)
public class StudentTableEx extends StudentTable implements TableEx<Student> {
    public static final StudentTableEx $ = new StudentTableEx(StudentTable.$, null);

    public StudentTableEx() {
        super();
    }

    public StudentTableEx(AbstractTypedTable.DelayedOperation<Student> delayedOperation) {
        super(delayedOperation);
    }

    public StudentTableEx(TableImplementor<Student> table) {
        super(table);
    }

    protected StudentTableEx(StudentTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public CourseTableEx courses() {
        __beforeJoin();
        if (raw != null) {
            return new CourseTableEx(raw.joinImplementor(StudentProps.COURSES.unwrap()));
        }
        return new CourseTableEx(joinOperation(StudentProps.COURSES.unwrap()));
    }

    public CourseTableEx courses(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new CourseTableEx(raw.joinImplementor(StudentProps.COURSES.unwrap(), joinType));
        }
        return new CourseTableEx(joinOperation(StudentProps.COURSES.unwrap(), joinType));
    }

    @Override
    public Predicate courses(Function<CourseTableEx, Predicate> block) {
        return exists(StudentProps.COURSES.unwrap(), block);
    }

    @Override
    public StudentTableEx asTableEx() {
        return this;
    }

    @Override
    public StudentTableEx __disableJoin(String reason) {
        return new StudentTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<StudentTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<StudentTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
