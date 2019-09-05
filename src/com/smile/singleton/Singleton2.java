package com.smile.singleton;

/**
 * @author smi1e
 * Date 2019/8/15 9:37
 * Description 饿汉式2
 */
public class Singleton2 {
    private static Singleton2 INSTANCE;
    static {
        INSTANCE = new Singleton2();
    }
    public static Singleton2 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance==instance2);
    }
}
