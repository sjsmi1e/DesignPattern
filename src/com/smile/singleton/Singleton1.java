package com.smile.singleton;

/**
 * @author smi1e
 * Date 2019/8/15 9:34
 * Description 饿汉式单例模式1(易造成资源浪费)
 */
public class Singleton1 {
    private final static Singleton1 INSTANCCE = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return INSTANCCE;
    }

    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance==instance2);
    }
}
