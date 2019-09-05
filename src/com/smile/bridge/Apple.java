package com.smile.bridge;

/**
 * @author smi1e
 * Date 2019/8/19 15:23
 * Description
 */
public class Apple implements Brand {
    @Override
    public void on() {
        System.out.println("apple is on...");
    }

    @Override
    public void off() {
        System.out.println("apple is off...");
    }

    @Override
    public void call() {
        System.out.println("apple is calling...");

    }
}
