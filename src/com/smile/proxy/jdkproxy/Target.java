package com.smile.proxy.jdkproxy;

/**
 * @author smi1e
 * Date 2019/8/21 10:03
 * Description
 */
public class Target implements ITarget {
    @Override
    public int operat1(String args) {
        System.out.println("执行方法：" + args);
        return 1;
    }
}
