package com.smile.adapter;

/**
 * @author smi1e
 * Date 2019/8/17 16:41
 * Description 输出电压为220V的电源
 */
public class Power220 implements Power {
    private int voltage;

    public Power220() {
        this.voltage = 220;
    }

    @Override
    public int outPow() {
        System.out.println("输出电压为："+voltage);
        return voltage;
    }
}
