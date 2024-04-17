package org.jimmer.config

import com.fasterxml.jackson.databind.ObjectMapper
import io.quarkus.jackson.ObjectMapperCustomizer
import jakarta.enterprise.context.ApplicationScoped
import org.babyfish.jimmer.jackson.ImmutableModule

/**
 * 注册不可变模块，让 Jackson 序列化可以和 Jimmer 的 Draft 等对象使用
 *
 * https://babyfish-ct.github.io/jimmer-doc/zh/docs/object/jackson?_highlight=jackson
 *
 * @author jhlz
 * @since 2024/4/17 14:04
 * @version x.x.x
 */
@ApplicationScoped
class JacksonConfig: ObjectMapperCustomizer {
    override fun customize(objectMapper: ObjectMapper) {
        objectMapper.registerModule(ImmutableModule())
    }

}