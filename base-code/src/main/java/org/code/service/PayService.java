package org.code.service;


/**
 * @author jhlz
 * @version x.x.x
 */
public sealed interface PayService
        permits AliPayService, WeChatService {

    public void pay();
}
