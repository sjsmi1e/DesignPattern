package com.smile.responsibilityChain;

/**
 * @author smi1e
 * Date 2019/9/14 10:08
 * Description
 */
public class President extends Handler {
    private static Handler INSTANCE = new President();
    private String name = "院长";

    public President() {
        handler = Director.getINSTANCE();
    }

    public static Handler getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void processRequest(Request request) {
        if (request.getPrice() < 10000) {
            System.out.println(this.name + "处理请求:" + request.getName());
        } else {
            handler.processRequest(request);
        }
    }
}
