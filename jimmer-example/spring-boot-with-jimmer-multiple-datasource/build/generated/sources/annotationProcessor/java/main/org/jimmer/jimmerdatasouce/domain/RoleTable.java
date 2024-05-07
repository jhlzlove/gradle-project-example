package org.jimmer.jimmerdatasouce.domain;

import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Role.class
)
public class RoleTable extends AbstractTypedTable<Role> implements RoleProps {
    public static final RoleTable $ = new RoleTable();

    public RoleTable() {
        super(Role.class);
    }

    public RoleTable(AbstractTypedTable.DelayedOperation<Role> delayedOperation) {
        super(Role.class, delayedOperation);
    }

    public RoleTable(TableImplementor<Role> table) {
        super(table);
    }

    protected RoleTable(RoleTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Num<Long> roleId() {
        return __get(RoleProps.ROLE_ID.unwrap());
    }

    @Override
    public PropExpression.Str roleCode() {
        return __get(RoleProps.ROLE_CODE.unwrap());
    }

    @Override
    public PropExpression.Str roleName() {
        return __get(RoleProps.ROLE_NAME.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> createDatetime() {
        return __get(RoleProps.CREATE_DATETIME.unwrap());
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> updateDatetime() {
        return __get(RoleProps.UPDATE_DATETIME.unwrap());
    }

    @Override
    public PropExpression.Str remark() {
        return __get(RoleProps.REMARK.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> status() {
        return __get(RoleProps.STATUS.unwrap());
    }

    @Override
    public RoleTableEx asTableEx() {
        return new RoleTableEx(this, null);
    }

    @Override
    public RoleTable __disableJoin(String reason) {
        return new RoleTable(this, reason);
    }

    @GeneratedBy(
            type = Role.class
    )
    public static class Remote extends AbstractTypedTable<Role> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Role.class, delayedOperation);
        }

        public Remote(TableImplementor<Role> table) {
            super(table);
        }

        public PropExpression.Num<Long> roleId() {
            return __get(RoleProps.ROLE_ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<Role> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
