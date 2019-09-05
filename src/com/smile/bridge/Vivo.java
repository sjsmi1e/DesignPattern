package com.smile.bridge;

/**
 * @author smi1e
 * Date 2019/8/19 15:24
 * Description
 */
public class Vivo implements Brand {
    @Override
    public void on() {
        System.out.println("vivo is on...");
    }

    @Override
    public void off() {
        System.out.println("vivo is off...");
    }

    @Override
    public void call() {
        System.out.println("vivo is calling...");
    }
}
