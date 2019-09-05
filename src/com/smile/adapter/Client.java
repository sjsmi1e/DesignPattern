package com.smile.adapter;

/**
 * @author smi1e
 * Date 2019/8/17 17:02
 * Description 使用人
 */
public class Client {
    public static void main(String[] args) {
        //获取手机
        Phone phone = new ApplePhone();
        //获取电源
        Power power220 = new Power220();
        //获取接口转换
        Adapter adapter = new PowerAdapter();
        //充电
        phone.charge(adapter.adapter10V(power220));
        phone.charge(adapter.adapter5V(power220));
    }
}
