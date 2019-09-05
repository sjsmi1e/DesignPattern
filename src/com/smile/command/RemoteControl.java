package com.smile.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smi1e
 * Date 2019/8/26 13:34
 * Description
 */
public class RemoteControl {
    private List<Command> list;

    public RemoteControl() {
        list = new ArrayList<>();
    }

    public void addCtrl(Command command){
        list.add(command);
    }
    public void removeCtrl(Command command){
        if (list.contains(command)){
            list.remove(command);
        }else {
            System.out.println("不存在该按钮");
        }
    }
    public void excute(Command command){
        command.excute();
    }
    public void undo(Command command){
        command.undo();
    }
}
