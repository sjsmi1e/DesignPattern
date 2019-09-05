package com.smile.proxy.cglib;

/**
 * @author smi1e
 * Date 2019/8/21 10:28
 * Description
 */
public class Target {
    public int operat(String args) {
        System.out.println("执行方法：" + args);
        return 1;
    }
}
