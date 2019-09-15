package com.smile.responsibilityChain;

/**
 * @author smi1e
 * Date 2019/9/14 10:15
 * Description
 */
public class Director extends Handler {
    private static Handler INSTANCE = new Director();
    private String name = "主任";

    public Director() {
        handler = SchoolMaster.getINSTANCE();
    }

    public static Handler getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void processRequest(Request request) {
        if (request.getPrice() < 50000) {
            System.out.println(this.name + "处理请求:" + request.getName());
        } else {
            handler.processRequest(request);
        }
    }
}
