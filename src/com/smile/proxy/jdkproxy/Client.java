package com.smile.proxy.jdkproxy;

/**
 * @author smi1e
 * Date 2019/8/21 10:17
 * Description
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Target());
        ITarget proxyInstance = (ITarget) proxyFactory.getProxyInstance();
        System.out.println(proxyInstance.operat1("这是主方法"));
    }
}
