package com.smile.responsibilityChain;

/**
 * @author smi1e
 * Date 2019/9/14 10:22
 * Description
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request("请求一", 500);
        Request request2 = new Request("请求二", 1500);
        Request request3 = new Request("请求三", 15000);
        Request request4 = new Request("请求四", 150000);
        Request request5 = new Request("请求五", 50000);
        Handler handler = new SchoolMaster();
        handler.processRequest(request);
        handler.processRequest(request2);
        handler.processRequest(request3);
        handler.processRequest(request4);
        handler.processRequest(request5);
    }
}
