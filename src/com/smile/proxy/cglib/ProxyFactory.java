package com.smile.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author smi1e
 * Date 2019/8/21 10:29
 * Description
 */
public class ProxyFactory implements MethodInterceptor {
    private Target target;

    public ProxyFactory(Target target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(target.getClass());
        // 设置enhancer的回调对象
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始代理");
        Object val = methodProxy.invokeSuper(o,objects);
        System.out.println("结束代理");
        return val;
    }
}
