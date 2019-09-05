package com.smile.facade;

/**
 * @author smi1e
 * Date 2019/8/19 15:07
 * Description
 */
public class Disk implements Computer {
    @Override
    public void on() {
        System.out.println("disk is on...");
    }

    @Override
    public void off() {

        System.out.println("disk is off...");
    }
}
