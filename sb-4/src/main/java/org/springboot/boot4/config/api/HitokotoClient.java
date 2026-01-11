package org.springboot.boot4.config.api;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

/**
 * @author jhlz
 * @version x.x.x
 */
@HttpExchange("/")
public interface HitokotoClient {

    @GetExchange
    String test();
}
