package com.smile.command;

/**
 * @author smi1e
 * Date 2019/8/26 13:42
 * Description
 */
public class TVOnCommand implements Command {
    private TV tv;

    @Override
    public void excute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }
}
