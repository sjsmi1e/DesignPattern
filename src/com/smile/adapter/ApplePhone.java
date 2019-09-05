package com.smile.adapter;

/**
 * @author smi1e
 * Date 2019/8/17 16:51
 * Description 手机实例：苹果手机
 */
public class ApplePhone implements Phone {
    private int CHARGE_POWER = 5;

    @Override
    public void charge(Power power) {
        if (power.outPow() == CHARGE_POWER) {
            System.out.println("电压符合，手机正在充电。。。");
        } else if (power.outPow() > CHARGE_POWER) {
            System.out.println("电压太大，手机不能充电。。。");
        } else {
            System.out.println("电压太小，手机不能充电。。。");
        }
    }
}
