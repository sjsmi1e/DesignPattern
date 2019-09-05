package com.smile.proxy.cglib;


/**
 * @author smi1e
 * Date 2019/8/21 10:57
 * Description
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Target());
        Target proxyInstance = (Target)proxyFactory.getProxyInstance();
        System.out.println(proxyInstance.operat("这是主方法"));
    }
}
