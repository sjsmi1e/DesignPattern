package com.smile.command;

/**
 * @author smi1e
 * Date 2019/8/26 13:43
 * Description
 */
public class TVOffCommand implements Command {
    private TV tv;

    @Override
    public void excute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }
}
