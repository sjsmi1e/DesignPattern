package com.smile.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author smi1e
 * Date 2019/8/21 10:04
 * Description
 */
public class ProxyFactory implements InvocationHandler {
    private ITarget target;

    public ProxyFactory(ITarget target) {
        this.target = target;
    }


    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始代理");
        Object val = method.invoke(target, args);
        System.out.println("结束代理");
        return val;
    }
}
