package com.smile.facade;

/**
 * @author smi1e
 * Date 2019/8/19 15:05
 * Description
 */
public class CPU implements Computer {
    @Override
    public void on() {
        System.out.println("cpu is on...");
    }

    @Override
    public void off() {

        System.out.println("cpu is off...");
    }
}
