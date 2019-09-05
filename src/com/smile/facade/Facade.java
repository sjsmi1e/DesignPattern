package com.smile.facade;

/**
 * @author smi1e
 * Date 2019/8/19 15:07
 * Description
 */
public class Facade implements Computer {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private Disk disk = new Disk();
    @Override
    public void on() {
        cpu.on();
        memory.on();
        disk.on();
    }

    @Override
    public void off() {
        memory.off();
        disk.off();
        cpu.off();
    }
}
