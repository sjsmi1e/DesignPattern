package com.smile.responsibilityChain;

/**
 * @author smi1e
 * Date 2019/9/14 10:17
 * Description
 */
public class SchoolMaster extends Handler {
    private static Handler INSTANCE = new SchoolMaster();
    private String name = "校长";

    public SchoolMaster() {
        handler = Instructor.getINSTANCE();
    }

    public static Handler getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void processRequest(Request request) {
        if (request.getPrice() >= 50000) {
            System.out.println(this.name + "处理请求:" + request.getName());
        } else {
            handler.processRequest(request);
        }
    }
}
