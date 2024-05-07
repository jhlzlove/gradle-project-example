package org.jimmer.jimmerdatasouce.domain;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.ListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = Student.class
)
public class StudentFetcher extends AbstractTypedFetcher<Student, StudentFetcher> {
    public static final StudentFetcher $ = new StudentFetcher(null);

    private StudentFetcher(FetcherImpl<Student> base) {
        super(Student.class, base);
    }

    private StudentFetcher(StudentFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private StudentFetcher(StudentFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static StudentFetcher $from(Fetcher<Student> base) {
        return base instanceof StudentFetcher ? 
        	(StudentFetcher)base : 
        	new StudentFetcher((FetcherImpl<Student>)base);
    }

    @NewChain
    public StudentFetcher createTime() {
        return add("createTime");
    }

    @NewChain
    public StudentFetcher createTime(boolean enabled) {
        return enabled ? add("createTime") : remove("createTime");
    }

    @NewChain
    public StudentFetcher updateTime() {
        return add("updateTime");
    }

    @NewChain
    public StudentFetcher updateTime(boolean enabled) {
        return enabled ? add("updateTime") : remove("updateTime");
    }

    @NewChain
    public StudentFetcher createBy() {
        return add("createBy");
    }

    @NewChain
    public StudentFetcher createBy(boolean enabled) {
        return enabled ? add("createBy") : remove("createBy");
    }

    @NewChain
    public StudentFetcher updateBy() {
        return add("updateBy");
    }

    @NewChain
    public StudentFetcher updateBy(boolean enabled) {
        return enabled ? add("updateBy") : remove("updateBy");
    }

    @NewChain
    public StudentFetcher remark() {
        return add("remark");
    }

    @NewChain
    public StudentFetcher remark(boolean enabled) {
        return enabled ? add("remark") : remove("remark");
    }

    @NewChain
    public StudentFetcher firstName() {
        return add("firstName");
    }

    @NewChain
    public StudentFetcher firstName(boolean enabled) {
        return enabled ? add("firstName") : remove("firstName");
    }

    @NewChain
    public StudentFetcher lastName() {
        return add("lastName");
    }

    @NewChain
    public StudentFetcher lastName(boolean enabled) {
        return enabled ? add("lastName") : remove("lastName");
    }

    @NewChain
    public StudentFetcher gender() {
        return add("gender");
    }

    @NewChain
    public StudentFetcher gender(boolean enabled) {
        return enabled ? add("gender") : remove("gender");
    }

    @NewChain
    public StudentFetcher fullName() {
        return add("fullName");
    }

    @NewChain
    public StudentFetcher fullName(boolean enabled) {
        return enabled ? add("fullName") : remove("fullName");
    }

    @NewChain
    public StudentFetcher courses() {
        return add("courses");
    }

    @NewChain
    public StudentFetcher courses(boolean enabled) {
        return enabled ? add("courses") : remove("courses");
    }

    @NewChain
    public StudentFetcher courses(Fetcher<Course> childFetcher) {
        return add("courses", childFetcher);
    }

    @NewChain
    public StudentFetcher courses(Fetcher<Course> childFetcher,
            Consumer<ListFieldConfig<Course, CourseTable>> fieldConfig) {
        return add("courses", childFetcher, fieldConfig);
    }

    @NewChain
    public StudentFetcher courses(IdOnlyFetchType idOnlyFetchType) {
        return add("courses", idOnlyFetchType);
    }

    @Override
    protected StudentFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new StudentFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected StudentFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new StudentFetcher(this, prop, fieldConfig);
    }
}
