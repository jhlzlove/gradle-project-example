package org.springboot.boot4.config;

import org.springboot.boot4.config.api.HitokotoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

/**
 * @author jhlz
 * @version x.x.x
 */
@Configuration
public class HttpApiConfig {

    @Bean
    public HitokotoClient testAPi(RestClient.Builder builder) {
        return buildClient(
                builder.baseUrl("https://v1.hitokoto.cn/").build()
        ).createClient(HitokotoClient.class);
    }

    private HttpServiceProxyFactory buildClient(RestClient client) {
        return HttpServiceProxyFactory
                .builderFor(RestClientAdapter.create(client))
                .build();
    }
}
