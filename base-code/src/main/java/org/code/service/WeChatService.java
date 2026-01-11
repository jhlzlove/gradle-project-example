package org.code.service;

/**
 * @author jhlz
 * @version x.x.x
 */
public final class WeChatService implements PayService{
    @Override
    public void pay() {
        IO.println("wechat pay server...");
    }
}
