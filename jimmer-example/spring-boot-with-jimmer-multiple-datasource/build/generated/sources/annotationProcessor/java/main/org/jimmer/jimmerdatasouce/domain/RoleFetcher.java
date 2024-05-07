package org.jimmer.jimmerdatasouce.domain;

import java.lang.Override;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = Role.class
)
public class RoleFetcher extends AbstractTypedFetcher<Role, RoleFetcher> {
    public static final RoleFetcher $ = new RoleFetcher(null);

    private RoleFetcher(FetcherImpl<Role> base) {
        super(Role.class, base);
    }

    private RoleFetcher(RoleFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private RoleFetcher(RoleFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static RoleFetcher $from(Fetcher<Role> base) {
        return base instanceof RoleFetcher ? 
        	(RoleFetcher)base : 
        	new RoleFetcher((FetcherImpl<Role>)base);
    }

    @NewChain
    public RoleFetcher roleCode() {
        return add("roleCode");
    }

    @NewChain
    public RoleFetcher roleCode(boolean enabled) {
        return enabled ? add("roleCode") : remove("roleCode");
    }

    @NewChain
    public RoleFetcher roleName() {
        return add("roleName");
    }

    @NewChain
    public RoleFetcher roleName(boolean enabled) {
        return enabled ? add("roleName") : remove("roleName");
    }

    @NewChain
    public RoleFetcher createDatetime() {
        return add("createDatetime");
    }

    @NewChain
    public RoleFetcher createDatetime(boolean enabled) {
        return enabled ? add("createDatetime") : remove("createDatetime");
    }

    @NewChain
    public RoleFetcher updateDatetime() {
        return add("updateDatetime");
    }

    @NewChain
    public RoleFetcher updateDatetime(boolean enabled) {
        return enabled ? add("updateDatetime") : remove("updateDatetime");
    }

    @NewChain
    public RoleFetcher remark() {
        return add("remark");
    }

    @NewChain
    public RoleFetcher remark(boolean enabled) {
        return enabled ? add("remark") : remove("remark");
    }

    @NewChain
    public RoleFetcher status() {
        return add("status");
    }

    @NewChain
    public RoleFetcher status(boolean enabled) {
        return enabled ? add("status") : remove("status");
    }

    @Override
    protected RoleFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new RoleFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected RoleFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new RoleFetcher(this, prop, fieldConfig);
    }
}
