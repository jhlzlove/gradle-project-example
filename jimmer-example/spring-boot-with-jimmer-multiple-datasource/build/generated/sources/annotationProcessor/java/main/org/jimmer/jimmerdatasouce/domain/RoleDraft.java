package org.jimmer.jimmerdatasouce.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.time.LocalDateTime;
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

@GeneratedBy(
        type = Role.class
)
public interface RoleDraft extends Role, Draft {
    RoleDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    RoleDraft setRoleId(long roleId);

    @OldChain
    RoleDraft setRoleCode(String roleCode);

    @OldChain
    RoleDraft setRoleName(String roleName);

    @OldChain
    RoleDraft setCreateDatetime(LocalDateTime createDatetime);

    @OldChain
    RoleDraft setUpdateDatetime(LocalDateTime updateDatetime);

    @OldChain
    RoleDraft setRemark(String remark);

    @OldChain
    RoleDraft setStatus(int status);

    @GeneratedBy(
            type = Role.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ROLE_ID = 0;

        public static final int SLOT_ROLE_CODE = 1;

        public static final int SLOT_ROLE_NAME = 2;

        public static final int SLOT_CREATE_DATETIME = 3;

        public static final int SLOT_UPDATE_DATETIME = 4;

        public static final int SLOT_REMARK = 5;

        public static final int SLOT_STATUS = 6;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.130",
                Role.class,
                Collections.emptyList(),
                (ctx, base) -> new DraftImpl(ctx, (Role)base)
            )
            .id(SLOT_ROLE_ID, "roleId", long.class)
            .add(SLOT_ROLE_CODE, "roleCode", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_ROLE_NAME, "roleName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_CREATE_DATETIME, "createDatetime", ImmutablePropCategory.SCALAR, LocalDateTime.class, false)
            .add(SLOT_UPDATE_DATETIME, "updateDatetime", ImmutablePropCategory.SCALAR, LocalDateTime.class, false)
            .add(SLOT_REMARK, "remark", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_STATUS, "status", ImmutablePropCategory.SCALAR, int.class, false)
            .build();

        private Producer() {
        }

        public Role produce(DraftConsumer<RoleDraft> block) {
            return produce(null, block);
        }

        public Role produce(Role base, DraftConsumer<RoleDraft> block) {
            return (Role)Internal.produce(TYPE, base, block);
        }

        @GeneratedBy(
                type = Role.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "roleId", "roleCode", "roleName", "createDatetime", "updateDatetime", "remark", "status"})
        public abstract interface Implementor extends Role, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ROLE_ID:
                    		return (Long)roleId();
                    case SLOT_ROLE_CODE:
                    		return roleCode();
                    case SLOT_ROLE_NAME:
                    		return roleName();
                    case SLOT_CREATE_DATETIME:
                    		return createDatetime();
                    case SLOT_UPDATE_DATETIME:
                    		return updateDatetime();
                    case SLOT_REMARK:
                    		return remark();
                    case SLOT_STATUS:
                    		return (Integer)status();
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Role\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "roleId":
                    		return (Long)roleId();
                    case "roleCode":
                    		return roleCode();
                    case "roleName":
                    		return roleName();
                    case "createDatetime":
                    		return createDatetime();
                    case "updateDatetime":
                    		return updateDatetime();
                    case "remark":
                    		return remark();
                    case "status":
                    		return (Integer)status();
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Role\": \"" + prop + "\"");
                }
            }

            default long getRoleId() {
                return roleId();
            }

            default String getRoleCode() {
                return roleCode();
            }

            default String getRoleName() {
                return roleName();
            }

            default LocalDateTime getCreateDatetime() {
                return createDatetime();
            }

            default LocalDateTime getUpdateDatetime() {
                return updateDatetime();
            }

            default String getRemark() {
                return remark();
            }

            default int getStatus() {
                return status();
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
                type = Role.class
        )
        private static class Impl implements Implementor, Cloneable, Serializable {
            private Visibility __visibility;

            long __roleIdValue;

            boolean __roleIdLoaded = false;

            String __roleCodeValue;

            String __roleNameValue;

            LocalDateTime __createDatetimeValue;

            LocalDateTime __updateDatetimeValue;

            String __remarkValue;

            int __statusValue;

            boolean __statusLoaded = false;

            @Override
            @JsonIgnore
            public long roleId() {
                if (!__roleIdLoaded) {
                    throw new UnloadedException(Role.class, "roleId");
                }
                return __roleIdValue;
            }

            @Override
            @JsonIgnore
            public String roleCode() {
                if (__roleCodeValue == null) {
                    throw new UnloadedException(Role.class, "roleCode");
                }
                return __roleCodeValue;
            }

            @Override
            @JsonIgnore
            public String roleName() {
                if (__roleNameValue == null) {
                    throw new UnloadedException(Role.class, "roleName");
                }
                return __roleNameValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime createDatetime() {
                if (__createDatetimeValue == null) {
                    throw new UnloadedException(Role.class, "createDatetime");
                }
                return __createDatetimeValue;
            }

            @Override
            @JsonIgnore
            public LocalDateTime updateDatetime() {
                if (__updateDatetimeValue == null) {
                    throw new UnloadedException(Role.class, "updateDatetime");
                }
                return __updateDatetimeValue;
            }

            @Override
            @JsonIgnore
            public String remark() {
                if (__remarkValue == null) {
                    throw new UnloadedException(Role.class, "remark");
                }
                return __remarkValue;
            }

            @Override
            @JsonIgnore
            public int status() {
                if (!__statusLoaded) {
                    throw new UnloadedException(Role.class, "status");
                }
                return __statusValue;
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
                    case SLOT_ROLE_ID:
                    		return __roleIdLoaded;
                    case SLOT_ROLE_CODE:
                    		return __roleCodeValue != null;
                    case SLOT_ROLE_NAME:
                    		return __roleNameValue != null;
                    case SLOT_CREATE_DATETIME:
                    		return __createDatetimeValue != null;
                    case SLOT_UPDATE_DATETIME:
                    		return __updateDatetimeValue != null;
                    case SLOT_REMARK:
                    		return __remarkValue != null;
                    case SLOT_STATUS:
                    		return __statusLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Role\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "roleId":
                    		return __roleIdLoaded;
                    case "roleCode":
                    		return __roleCodeValue != null;
                    case "roleName":
                    		return __roleNameValue != null;
                    case "createDatetime":
                    		return __createDatetimeValue != null;
                    case "updateDatetime":
                    		return __updateDatetimeValue != null;
                    case "remark":
                    		return __remarkValue != null;
                    case "status":
                    		return __statusLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Role\": \"" + prop + "\"");
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
                    case SLOT_ROLE_ID:
                    		return __visibility.visible(SLOT_ROLE_ID);
                    case SLOT_ROLE_CODE:
                    		return __visibility.visible(SLOT_ROLE_CODE);
                    case SLOT_ROLE_NAME:
                    		return __visibility.visible(SLOT_ROLE_NAME);
                    case SLOT_CREATE_DATETIME:
                    		return __visibility.visible(SLOT_CREATE_DATETIME);
                    case SLOT_UPDATE_DATETIME:
                    		return __visibility.visible(SLOT_UPDATE_DATETIME);
                    case SLOT_REMARK:
                    		return __visibility.visible(SLOT_REMARK);
                    case SLOT_STATUS:
                    		return __visibility.visible(SLOT_STATUS);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "roleId":
                    		return __visibility.visible(SLOT_ROLE_ID);
                    case "roleCode":
                    		return __visibility.visible(SLOT_ROLE_CODE);
                    case "roleName":
                    		return __visibility.visible(SLOT_ROLE_NAME);
                    case "createDatetime":
                    		return __visibility.visible(SLOT_CREATE_DATETIME);
                    case "updateDatetime":
                    		return __visibility.visible(SLOT_UPDATE_DATETIME);
                    case "remark":
                    		return __visibility.visible(SLOT_REMARK);
                    case "status":
                    		return __visibility.visible(SLOT_STATUS);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__roleIdLoaded) {
                    hash = 31 * hash + Long.hashCode(__roleIdValue);
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (__roleCodeValue != null) {
                    hash = 31 * hash + __roleCodeValue.hashCode();
                }
                if (__roleNameValue != null) {
                    hash = 31 * hash + __roleNameValue.hashCode();
                }
                if (__createDatetimeValue != null) {
                    hash = 31 * hash + __createDatetimeValue.hashCode();
                }
                if (__updateDatetimeValue != null) {
                    hash = 31 * hash + __updateDatetimeValue.hashCode();
                }
                if (__remarkValue != null) {
                    hash = 31 * hash + __remarkValue.hashCode();
                }
                if (__statusLoaded) {
                    hash = 31 * hash + Integer.hashCode(__statusValue);
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__roleIdLoaded) {
                    hash = 31 * hash + Long.hashCode(__roleIdValue);
                }
                if (__roleCodeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__roleCodeValue);
                }
                if (__roleNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__roleNameValue);
                }
                if (__createDatetimeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createDatetimeValue);
                }
                if (__updateDatetimeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__updateDatetimeValue);
                }
                if (__remarkValue != null) {
                    hash = 31 * hash + System.identityHashCode(__remarkValue);
                }
                if (__statusLoaded) {
                    hash = 31 * hash + Integer.hashCode(__statusValue);
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
                if (__isVisible(PropId.byIndex(SLOT_ROLE_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_ID))) {
                    return false;
                }
                boolean __roleIdLoaded = this.__roleIdLoaded;
                if (__roleIdLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_ID))) {
                    return false;
                }
                if (__roleIdLoaded) {
                    // If entity-id is loaded, return directly
                    return __roleIdValue == __other.roleId();
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_CODE))) {
                    return false;
                }
                boolean __roleCodeLoaded = __roleCodeValue != null;
                if (__roleCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_CODE))) {
                    return false;
                }
                if (__roleCodeLoaded && !Objects.equals(__roleCodeValue, __other.roleCode())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_NAME))) {
                    return false;
                }
                boolean __roleNameLoaded = __roleNameValue != null;
                if (__roleNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_NAME))) {
                    return false;
                }
                if (__roleNameLoaded && !Objects.equals(__roleNameValue, __other.roleName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_DATETIME)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_DATETIME))) {
                    return false;
                }
                boolean __createDatetimeLoaded = __createDatetimeValue != null;
                if (__createDatetimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_DATETIME))) {
                    return false;
                }
                if (__createDatetimeLoaded && !Objects.equals(__createDatetimeValue, __other.createDatetime())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_DATETIME)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_DATETIME))) {
                    return false;
                }
                boolean __updateDatetimeLoaded = __updateDatetimeValue != null;
                if (__updateDatetimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_DATETIME))) {
                    return false;
                }
                if (__updateDatetimeLoaded && !Objects.equals(__updateDatetimeValue, __other.updateDatetime())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARK)) != __other.__isVisible(PropId.byIndex(SLOT_REMARK))) {
                    return false;
                }
                boolean __remarkLoaded = __remarkValue != null;
                if (__remarkLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARK))) {
                    return false;
                }
                if (__remarkLoaded && !Objects.equals(__remarkValue, __other.remark())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = this.__statusLoaded;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && __statusValue != __other.status()) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
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
                if (__isVisible(PropId.byIndex(SLOT_ROLE_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_CODE))) {
                    return false;
                }
                boolean __roleCodeLoaded = __roleCodeValue != null;
                if (__roleCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_CODE))) {
                    return false;
                }
                if (__roleCodeLoaded && __roleCodeValue != __other.roleCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_ROLE_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_ROLE_NAME))) {
                    return false;
                }
                boolean __roleNameLoaded = __roleNameValue != null;
                if (__roleNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ROLE_NAME))) {
                    return false;
                }
                if (__roleNameLoaded && __roleNameValue != __other.roleName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_DATETIME)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_DATETIME))) {
                    return false;
                }
                boolean __createDatetimeLoaded = __createDatetimeValue != null;
                if (__createDatetimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_DATETIME))) {
                    return false;
                }
                if (__createDatetimeLoaded && __createDatetimeValue != __other.createDatetime()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_DATETIME)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_DATETIME))) {
                    return false;
                }
                boolean __updateDatetimeLoaded = __updateDatetimeValue != null;
                if (__updateDatetimeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_DATETIME))) {
                    return false;
                }
                if (__updateDatetimeLoaded && __updateDatetimeValue != __other.updateDatetime()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARK)) != __other.__isVisible(PropId.byIndex(SLOT_REMARK))) {
                    return false;
                }
                boolean __remarkLoaded = __remarkValue != null;
                if (__remarkLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARK))) {
                    return false;
                }
                if (__remarkLoaded && __remarkValue != __other.remark()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = this.__statusLoaded;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && __statusValue != __other.status()) {
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
                type = Role.class
        )
        private static class DraftImpl implements Implementor, DraftSpi, RoleDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, Role base) {
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
            public long roleId() {
                return (__modified!= null ? __modified : __base).roleId();
            }

            @Override
            public RoleDraft setRoleId(long roleId) {
                Impl __tmpModified = __modified();
                __tmpModified.__roleIdValue = roleId;
                __tmpModified.__roleIdLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String roleCode() {
                return (__modified!= null ? __modified : __base).roleCode();
            }

            @Override
            public RoleDraft setRoleCode(String roleCode) {
                if (roleCode == null) {
                    throw new IllegalArgumentException(
                        "'roleCode' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__roleCodeValue = roleCode;
                return this;
            }

            @Override
            @JsonIgnore
            public String roleName() {
                return (__modified!= null ? __modified : __base).roleName();
            }

            @Override
            public RoleDraft setRoleName(String roleName) {
                if (roleName == null) {
                    throw new IllegalArgumentException(
                        "'roleName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__roleNameValue = roleName;
                return this;
            }

            @Override
            @JsonIgnore
            public LocalDateTime createDatetime() {
                return (__modified!= null ? __modified : __base).createDatetime();
            }

            @Override
            public RoleDraft setCreateDatetime(LocalDateTime createDatetime) {
                if (createDatetime == null) {
                    throw new IllegalArgumentException(
                        "'createDatetime' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__createDatetimeValue = createDatetime;
                return this;
            }

            @Override
            @JsonIgnore
            public LocalDateTime updateDatetime() {
                return (__modified!= null ? __modified : __base).updateDatetime();
            }

            @Override
            public RoleDraft setUpdateDatetime(LocalDateTime updateDatetime) {
                if (updateDatetime == null) {
                    throw new IllegalArgumentException(
                        "'updateDatetime' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__updateDatetimeValue = updateDatetime;
                return this;
            }

            @Override
            @JsonIgnore
            public String remark() {
                return (__modified!= null ? __modified : __base).remark();
            }

            @Override
            public RoleDraft setRemark(String remark) {
                if (remark == null) {
                    throw new IllegalArgumentException(
                        "'remark' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__remarkValue = remark;
                return this;
            }

            @Override
            @JsonIgnore
            public int status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public RoleDraft setStatus(int status) {
                Impl __tmpModified = __modified();
                __tmpModified.__statusValue = status;
                __tmpModified.__statusLoaded = true;
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
                    case SLOT_ROLE_ID:
                    		if (value == null) throw new IllegalArgumentException("'roleId' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setRoleId((Long)value);
                            break;
                    case SLOT_ROLE_CODE:
                    		setRoleCode((String)value);break;
                    case SLOT_ROLE_NAME:
                    		setRoleName((String)value);break;
                    case SLOT_CREATE_DATETIME:
                    		setCreateDatetime((LocalDateTime)value);break;
                    case SLOT_UPDATE_DATETIME:
                    		setUpdateDatetime((LocalDateTime)value);break;
                    case SLOT_REMARK:
                    		setRemark((String)value);break;
                    case SLOT_STATUS:
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setStatus((Integer)value);
                            break;
                    default: throw new IllegalArgumentException("Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Role\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "roleId":
                    		if (value == null) throw new IllegalArgumentException("'roleId' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setRoleId((Long)value);
                            break;
                    case "roleCode":
                    		setRoleCode((String)value);break;
                    case "roleName":
                    		setRoleName((String)value);break;
                    case "createDatetime":
                    		setCreateDatetime((LocalDateTime)value);break;
                    case "updateDatetime":
                    		setUpdateDatetime((LocalDateTime)value);break;
                    case "remark":
                    		setRemark((String)value);break;
                    case "status":
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setStatus((Integer)value);
                            break;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Role\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(7);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ROLE_ID:
                    		__visibility.show(SLOT_ROLE_ID, visible);break;
                    case SLOT_ROLE_CODE:
                    		__visibility.show(SLOT_ROLE_CODE, visible);break;
                    case SLOT_ROLE_NAME:
                    		__visibility.show(SLOT_ROLE_NAME, visible);break;
                    case SLOT_CREATE_DATETIME:
                    		__visibility.show(SLOT_CREATE_DATETIME, visible);break;
                    case SLOT_UPDATE_DATETIME:
                    		__visibility.show(SLOT_UPDATE_DATETIME, visible);break;
                    case SLOT_REMARK:
                    		__visibility.show(SLOT_REMARK, visible);break;
                    case SLOT_STATUS:
                    		__visibility.show(SLOT_STATUS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Role\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(7);
                }
                switch (prop) {
                    case "roleId":
                    		__visibility.show(SLOT_ROLE_ID, visible);break;
                    case "roleCode":
                    		__visibility.show(SLOT_ROLE_CODE, visible);break;
                    case "roleName":
                    		__visibility.show(SLOT_ROLE_NAME, visible);break;
                    case "createDatetime":
                    		__visibility.show(SLOT_CREATE_DATETIME, visible);break;
                    case "updateDatetime":
                    		__visibility.show(SLOT_UPDATE_DATETIME, visible);break;
                    case "remark":
                    		__visibility.show(SLOT_REMARK, visible);break;
                    case "status":
                    		__visibility.show(SLOT_STATUS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Role\": \"" + 
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
                    case SLOT_ROLE_ID:
                    		__modified().__roleIdLoaded = false;break;
                    case SLOT_ROLE_CODE:
                    		__modified().__roleCodeValue = null;break;
                    case SLOT_ROLE_NAME:
                    		__modified().__roleNameValue = null;break;
                    case SLOT_CREATE_DATETIME:
                    		__modified().__createDatetimeValue = null;break;
                    case SLOT_UPDATE_DATETIME:
                    		__modified().__updateDatetimeValue = null;break;
                    case SLOT_REMARK:
                    		__modified().__remarkValue = null;break;
                    case SLOT_STATUS:
                    		__modified().__statusLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"org.jimmer.jimmerdatasouce.domain.Role\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "roleId":
                    		__modified().__roleIdLoaded = false;break;
                    case "roleCode":
                    		__modified().__roleCodeValue = null;break;
                    case "roleName":
                    		__modified().__roleNameValue = null;break;
                    case "createDatetime":
                    		__modified().__createDatetimeValue = null;break;
                    case "updateDatetime":
                    		__modified().__updateDatetimeValue = null;break;
                    case "remark":
                    		__modified().__remarkValue = null;break;
                    case "status":
                    		__modified().__statusLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"org.jimmer.jimmerdatasouce.domain.Role\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
            type = Role.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
        }

        public Builder roleId(Long roleId) {
            if (roleId != null) {
                __draft.setRoleId(roleId);
            }
            return this;
        }

        public Builder roleCode(String roleCode) {
            if (roleCode != null) {
                __draft.setRoleCode(roleCode);
            }
            return this;
        }

        public Builder roleName(String roleName) {
            if (roleName != null) {
                __draft.setRoleName(roleName);
            }
            return this;
        }

        public Builder createDatetime(LocalDateTime createDatetime) {
            if (createDatetime != null) {
                __draft.setCreateDatetime(createDatetime);
            }
            return this;
        }

        public Builder updateDatetime(LocalDateTime updateDatetime) {
            if (updateDatetime != null) {
                __draft.setUpdateDatetime(updateDatetime);
            }
            return this;
        }

        public Builder remark(String remark) {
            if (remark != null) {
                __draft.setRemark(remark);
            }
            return this;
        }

        public Builder status(Integer status) {
            if (status != null) {
                __draft.setStatus(status);
            }
            return this;
        }

        public Role build() {
            return (Role)__draft.__modified();
        }
    }
}
