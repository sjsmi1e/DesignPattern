package com.smile.command;

/**
 * @author smi1e
 * Date 2019/8/26 13:31
 * Description
 */
public class LightOnCommand implements Command {

    public LightOnCommand(Light light) {
        this.light = light;
    }

    private Light light;

    @Override
    public void excute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
