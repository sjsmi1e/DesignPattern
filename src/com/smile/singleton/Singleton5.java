package com.smile.singleton;

/**
 * @author smi1e
 * Date 2019/8/15 10:08
 * Description
 */
public enum Singleton5 {
    INSTANCE;
    public static void main(String[] args) {
        System.out.println(Singleton5.INSTANCE.hashCode());
        System.out.println(Singleton5.INSTANCE.hashCode());
    }
}
