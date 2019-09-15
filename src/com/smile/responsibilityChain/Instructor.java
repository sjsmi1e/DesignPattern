package com.smile.responsibilityChain;

/**
 * @author smi1e
 * Date 2019/9/14 10:07
 * Description
 */
public class Instructor extends Handler {
    private static Handler INSTANCE = new Instructor();
    private String name = "辅导员";

    public static Handler getINSTANCE() {
        return INSTANCE;
    }

    public Instructor() {
        super.handler = President.getINSTANCE();
    }

    @Override
    public void processRequest(Request request) {
        if (request.getPrice() < 5000) {
            System.out.println(this.name + "处理请求:" + request.getName());
        } else {
            handler.processRequest(request);
        }
    }
}
