package com.smile.adapter;

/**
 * @author smi1e
 * Date 2019/8/17 17:45
 * Description
 */
public class PowerAdapter implements Adapter {
    @Override
    public Power adapter5V(Power power) {
        return () -> {
            int outPow = power.outPow() / 44;
            System.out.println("输出电压为：" + outPow);
            return outPow;
        };
    }

    @Override
    public Power adapter10V(Power power) {
        return () -> {
            int outPow = power.outPow() / 22;
            System.out.println("输出电压为：" + outPow);
            return outPow;
        };
    }

}
