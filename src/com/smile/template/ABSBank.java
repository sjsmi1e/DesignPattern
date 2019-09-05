package com.smile.template;

/**
 * @author smi1e
 * Date 2019/8/26 10:42
 * Description
 */
public abstract class ABSBank {
    public final void action() {

        takeTheNumber();
        lineUp();
        handlingBusiness();
        evaluate();
    }

    public void takeTheNumber() {
        System.out.println("正在取号。。。");
    }

    public void lineUp() {
        System.out.println("正在排队。。。");
    }

    /**
     * 处理业务
     */
    public abstract void handlingBusiness();

    /**
     * 评价，钩子方法
     */
    public void evaluate() {
    }
}
