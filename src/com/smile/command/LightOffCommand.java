package com.smile.command;

import jdk.jfr.FlightRecorderListener;

/**
 * @author smi1e
 * Date 2019/8/26 13:32
 * Description
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
