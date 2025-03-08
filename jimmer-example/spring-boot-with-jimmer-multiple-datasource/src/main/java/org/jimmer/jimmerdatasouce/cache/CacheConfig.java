package org.jimmer.jimmerdatasouce.cache;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.sql.cache.Cache;
import org.babyfish.jimmer.sql.cache.CacheFactory;
import org.babyfish.jimmer.sql.cache.chain.ChainCacheBuilder;
import org.babyfish.jimmer.sql.cache.redis.spring.RedisValueBinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;

/**
 * @author jhlz
 * @version x.x.x
 */
@Configuration
public class CacheConfig {

    @Bean
    public CacheFactory cacheFactory(RedisConnectionFactory redisConnectionFactory,
                                     ObjectMapper objectMapper) {

        return new CacheFactory() {
            @Override
            public Cache<?, ?> createAssociatedIdCache(ImmutableProp prop) {
                return new ChainCacheBuilder<>()
                        .add(
                                RedisValueBinder
                                        .forProp(prop)
                                        .redis(redisConnectionFactory)
                                        .objectMapper(objectMapper)
                                        .duration(Duration.ofMinutes(3))
                                        .build()
                        )
                        .build();
            }


            @Override
            public Cache<?, ?> createObjectCache(ImmutableType type) {
                return new ChainCacheBuilder<>()
                        .add(
                                RedisValueBinder
                                        .forObject(type)
                                        .redis(redisConnectionFactory)
                                        .objectMapper(objectMapper)
                                        .duration(Duration.ofMinutes(3))
                                        .build()
                        )
                        .build();
            }
        };
    }



}
