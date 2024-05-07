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
import java.util.Collections;
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
import org.babyfish.jimmer.runtime.Visibility;
import org.jetbrains.annotations.Nullable;

@GeneratedBy(
        type = Dept.class
)
public interface DeptDraft extends Dept, Draft {
    DeptDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    DeptDraft setDeptId(long deptId);

    @OldChain
    DeptDraft setDeptName(String deptName);

    @OldChain
    DeptDraft setLeaderId(Long leaderId);

    @OldChain
    DeptDraft setRoleId(Long roleId);

    @GeneratedBy(
            type = Dept.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_DEPT_ID = 0;

        public static final int SLOT_DEPT_NAME = 1;

        public static final int SLOT_LEADER_ID = 2;

        public static final int SLOT_ROLE_ID = 3;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.130",
                Dept.class,
                Collections.emptyList(),
                (ctx, base) -> new DraftImpl(ctx, (Dept)base)
            )
            .id(SLOT_DEPT_ID, "deptId", long.class)
            .add(SLOT_DEPT_NAME, "deptName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_LEADER_ID, "leaderId", ImmutablePropCategory.SCALAR, Long.class, true)
            .add(SLOT_ROLE_ID, "roleId", ImmutablePropCategory.SCALAR, Long.class, true)
            .build();

        private Producer() {
        }

        public Dept produce(DraftConsumer<DeptDraft> block) {
            return produce(null, block);
        }

        public Dept produce(Dept base, DraftConsumer<DeptDraft> block) {
            return (Dept)Internal.produce(TYPE, base, block);
        }

        @GeneratedBy(
                type = Dept.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "deptId", "deptName", "leaderId", "roleId"})
        public abstract interface Implementor extends Dept, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_DEPT_ID:
                    		return (Long)deptId();
                    case SLOT_DEPT_NAME:
                    		return deptName();
                    case SLOT_LEADER_ID:
                    		return leaderId();
                    case SLOT_ROLE_ID:
                    		return roleId();
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Dept\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "deptId":
                    		return (Long)deptId();
                    case "deptName":
                    		return deptName();
                    case "leaderId":
                    		return leaderId();
                    case "roleId":
                    		return roleId();
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Dept\": \"" + prop + "\"");
                }
            }

            default long getDeptId() {
                return deptId();
            }

            default String getDeptName() {
                return deptName();
            }

            default Long getLeaderId() {
                return leaderId();
            }

            default Long getRoleId() {
                return roleId();
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
                type = Dept.class
        )
        private static class Impl implements Implementor, Cloneable, Serializable {
            private Visibility __visibility;

            long __deptIdValue;

            boolean __deptIdLoaded = false;

            String __deptNameValue;

            Long __leaderIdValue;

            boolean __leaderIdLoaded = false;

            Long __roleIdValue;

            boolean __roleIdLoaded = false;

            @Override
            @JsonIgnore
            public long deptId() {
                if (!__deptIdLoaded) {
                    throw new UnloadedException(Dept.class, "deptId");
                }
                return __deptIdValue;
            }

            @Override
            @JsonIgnore
            public String deptName() {
                if (__deptNameValue == null) {
                    throw new UnloadedException(Dept.class, "deptName");
                }
                return __deptNameValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Long leaderId() {
                if (!__leaderIdLoaded) {
                    throw new UnloadedException(Dept.class, "leaderId");
                }
                return __leaderIdValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Long roleId() {
                if (!__roleIdLoaded) {
                    throw new UnloadedException(Dept.class, "roleId");
                }
                return __roleIdValue;
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
                    case SLOT_DEPT_ID:
                    		return __deptIdLoaded;
                    case SLOT_DEPT_NAME:
                    		return __deptNameValue != null;
                    case SLOT_LEADER_ID:
                    		return __leaderIdLoaded;
                    case SLOT_ROLE_ID:
                    		return __roleIdLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Dept\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "deptId":
                    		return __deptIdLoaded;
                    case "deptName":
                    		return __deptNameValue != null;
                    case "leaderId":
                    		return __leaderIdLoaded;
                    case "roleId":
                    		return __roleIdLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Dept\": \"" + prop + "\"");
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
                    case SLOT_DEPT_ID:
                    		return __visibility.visible(SLOT_DEPT_ID);
                    case SLOT_DEPT_NAME:
                    		return __visibility.visible(SLOT_DEPT_NAME);
                    case SLOT_LEADER_ID:
                    		return __visibility.visible(SLOT_LEADER_ID);
                    case SLOT_ROLE_ID:
                    		return __visibility.visible(SLOT_ROLE_ID);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "deptId":
                    		return __visibility.visible(SLOT_DEPT_ID);
                    case "deptName":
                    		return __visibility.visible(SLOT_DEPT_NAME);
                    case "leaderId":
                    		return __visibility.visible(SLOT_LEADER_ID);
                    case "roleId":
                    		return __visibility.visible(SLOT_ROLE_ID);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__deptIdLoaded) {
                    hash = 31 * hash + Long.hashCode(__deptIdValue);
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (__deptNameValue != null) {
                    hash = 31 * hash + __deptNameValue.hashCode();
                }
                if (__leaderIdLoaded && __leaderIdValue != null) {
                    hash = 31 * hash + __leaderIdValue.hashCode();
                }
                if (__roleIdLoaded && __roleIdValue != null) {
                    hash = 31 * hash + __roleIdValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__deptIdLoaded) {
                    hash = 31 * hash + Long.hashCode(__deptIdValue);
                }
                if (__deptNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__deptNameValue);
                }
                if (__leaderIdLoaded) {
                    hash = 31 * hash + System.identityHashCode(__leaderIdValue);
                }
                if (__roleIdLoaded) {
                    hash = 31 * hash + System.identityHashCode(__roleIdValue);
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
                if (__isVisible(PropId.byIndex(SLOT_DEPT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_DEPT_ID))) {
                    return false;
                }
                boolean __deptIdLoaded = this.__deptIdLoaded;
                if (__deptIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DEPT_ID))) {
                    return false;
                }
                if (__deptIdLoaded) {
                    // If entity-id is loaded, return directly
                    return __deptIdValue == __other.deptId();
                }
                if (__isVisible(PropId.byIndex(SLOT_DEPT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_DEPT_NAME))) {
                    return false;
                }
                boolean __deptNameLoaded = __deptNameValue != null;
                if (__deptNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DEPT_NAME))) {
                    return false;
                }
                if (__deptNameLoaded && !Objects.equals(__deptNameValue, __other.deptName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_LEADER_ID)) != __other.__isVisible(PropId.byIndex(SLOT_LEADER_ID))) {
                    return false;
                }
                boolean __leaderIdLoaded = this.__leaderIdLoaded;
                if (__leaderIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_LEADER_ID))) {
                    return false;
                }
                if (__leaderIdLoaded && !Objects.equals(__leaderIdValue, __other.leaderId())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_ID))) {
                    return false;
                }
                boolean __roleIdLoaded = this.__roleIdLoaded;
                if (__roleIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_ID))) {
                    return false;
                }
                if (__roleIdLoaded && !Objects.equals(__roleIdValue, __other.roleId())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_DEPT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_DEPT_ID))) {
                    return false;
                }
                boolean __deptIdLoaded = this.__deptIdLoaded;
                if (__deptIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DEPT_ID))) {
                    return false;
                }
                if (__deptIdLoaded && __deptIdValue != __other.deptId()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DEPT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_DEPT_NAME))) {
                    return false;
                }
                boolean __deptNameLoaded = __deptNameValue != null;
                if (__deptNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DEPT_NAME))) {
                    return false;
                }
                if (__deptNameLoaded && __deptNameValue != __other.deptName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_LEADER_ID)) != __other.__isVisible(PropId.byIndex(SLOT_LEADER_ID))) {
                    return false;
                }
                boolean __leaderIdLoaded = this.__leaderIdLoaded;
                if (__leaderIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_LEADER_ID))) {
                    return false;
                }
                if (__leaderIdLoaded && __leaderIdValue != __other.leaderId()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_ID))) {
                    return false;
                }
                boolean __roleIdLoaded = this.__roleIdLoaded;
                if (__roleIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_ID))) {
                    return false;
                }
                if (__roleIdLoaded && __roleIdValue != __other.roleId()) {
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
                type = Dept.class
        )
        private static class DraftImpl implements Implementor, DraftSpi, DeptDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, Dept base) {
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
            public long deptId() {
                return (__modified!= null ? __modified : __base).deptId();
            }

            @Override
            public DeptDraft setDeptId(long deptId) {
                Impl __tmpModified = __modified();
                __tmpModified.__deptIdValue = deptId;
                __tmpModified.__deptIdLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String deptName() {
                return (__modified!= null ? __modified : __base).deptName();
            }

            @Override
            public DeptDraft setDeptName(String deptName) {
                if (deptName == null) {
                    throw new IllegalArgumentException(
                        "'deptName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__deptNameValue = deptName;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Long leaderId() {
                return (__modified!= null ? __modified : __base).leaderId();
            }

            @Override
            public DeptDraft setLeaderId(Long leaderId) {
                Impl __tmpModified = __modified();
                __tmpModified.__leaderIdValue = leaderId;
                __tmpModified.__leaderIdLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Long roleId() {
                return (__modified!= null ? __modified : __base).roleId();
            }

            @Override
            public DeptDraft setRoleId(Long roleId) {
                Impl __tmpModified = __modified();
                __tmpModified.__roleIdValue = roleId;
                __tmpModified.__roleIdLoaded = true;
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
                    case SLOT_DEPT_ID:
                    		if (value == null) throw new IllegalArgumentException("'deptId' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setDeptId((Long)value);
                            break;
                    case SLOT_DEPT_NAME:
                    		setDeptName((String)value);break;
                    case SLOT_LEADER_ID:
                    		setLeaderId((Long)value);break;
                    case SLOT_ROLE_ID:
                    		setRoleId((Long)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Dept\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "deptId":
                    		if (value == null) throw new IllegalArgumentException("'deptId' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setDeptId((Long)value);
                            break;
                    case "deptName":
                    		setDeptName((String)value);break;
                    case "leaderId":
                    		setLeaderId((Long)value);break;
                    case "roleId":
                    		setRoleId((Long)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Dept\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(4);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_DEPT_ID:
                    		__visibility.show(SLOT_DEPT_ID, visible);break;
                    case SLOT_DEPT_NAME:
                    		__visibility.show(SLOT_DEPT_NAME, visible);break;
                    case SLOT_LEADER_ID:
                    		__visibility.show(SLOT_LEADER_ID, visible);break;
                    case SLOT_ROLE_ID:
                    		__visibility.show(SLOT_ROLE_ID, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Dept\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(4);
                }
                switch (prop) {
                    case "deptId":
                    		__visibility.show(SLOT_DEPT_ID, visible);break;
                    case "deptName":
                    		__visibility.show(SLOT_DEPT_NAME, visible);break;
                    case "leaderId":
                    		__visibility.show(SLOT_LEADER_ID, visible);break;
                    case "roleId":
                    		__visibility.show(SLOT_ROLE_ID, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Dept\": \"" + 
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
                    case SLOT_DEPT_ID:
                    		__modified().__deptIdLoaded = false;break;
                    case SLOT_DEPT_NAME:
                    		__modified().__deptNameValue = null;break;
                    case SLOT_LEADER_ID:
                    		__modified().__leaderIdLoaded = false;break;
                    case SLOT_ROLE_ID:
                    		__modified().__roleIdLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Dept\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "deptId":
                    		__modified().__deptIdLoaded = false;break;
                    case "deptName":
                    		__modified().__deptNameValue = null;break;
                    case "leaderId":
                    		__modified().__leaderIdLoaded = false;break;
                    case "roleId":
                    		__modified().__roleIdLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Dept\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
            type = Dept.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
        }

        public Builder deptId(Long deptId) {
            if (deptId != null) {
                __draft.setDeptId(deptId);
            }
            return this;
        }

        public Builder deptName(String deptName) {
            if (deptName != null) {
                __draft.setDeptName(deptName);
            }
            return this;
        }

        public Builder leaderId(Long leaderId) {
            __draft.setLeaderId(leaderId);
            return this;
        }

        public Builder roleId(Long roleId) {
            __draft.setRoleId(roleId);
            return this;
        }

        public Dept build() {
            return (Dept)__draft.__modified();
        }
    }
}
