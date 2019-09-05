package com.smile.facade;

/**
 * @author smi1e
 * Date 2019/8/19 15:06
 * Description
 */
public class Memory implements Computer{
    @Override
    public void on() {
        System.out.println("memory is on...");
    }

    @Override
    public void off() {
        System.out.println("memory is off");
    }
}
