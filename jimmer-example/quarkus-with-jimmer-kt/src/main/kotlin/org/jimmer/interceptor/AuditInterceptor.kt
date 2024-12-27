package org.jimmer.interceptor

import jakarta.enterprise.context.ApplicationScoped
import org.babyfish.jimmer.kt.isLoaded
import org.babyfish.jimmer.sql.DraftInterceptor
import org.jimmer.domain.BaseEntity
import org.jimmer.domain.BaseEntityDraft
import java.time.LocalDateTime
import java.util.*

/**
 * 类似 JPA 的审计功能：自动添加创建、更新时间
 * @author jhlz
 * @version x.x.x
 */
@ApplicationScoped
class AuditInterceptor : DraftInterceptor<BaseEntity, BaseEntityDraft> {

    override fun beforeSave(draft: BaseEntityDraft, original: BaseEntity?) {
        if (!isLoaded(draft, BaseEntity::updateTime)) {
            draft.updateTime = LocalDateTime.now()
        }

        if (Objects.isNull(original)) {
            if (!isLoaded(draft, BaseEntity::createTime)) {
                draft.createTime = LocalDateTime.now()
            }

            if (!isLoaded(draft, BaseEntity::createBy)) {
                draft.createBy = "111"
            }
        }
    }
}