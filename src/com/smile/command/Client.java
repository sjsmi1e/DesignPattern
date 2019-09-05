package com.smile.command;

/**
 * @author smi1e
 * Date 2019/8/26 13:44
 * Description
 */
public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        System.out.println("-------------add light command------------");
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.addCtrl(lightOffCommand);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.addCtrl(lightOnCommand);
        System.out.println("-------------add tv command------------");
        TV tv = new TV();
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        remoteControl.addCtrl(tvOffCommand);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        remoteControl.addCtrl(tvOnCommand);
        System.out.println("----------begin-------------");
        remoteControl.excute(lightOnCommand);
        remoteControl.excute(tvOnCommand);
        System.out.println("准备睡觉了");
        remoteControl.excute(tvOffCommand);
        remoteControl.excute(lightOffCommand);
    }
}
