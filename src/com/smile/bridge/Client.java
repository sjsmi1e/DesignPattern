package com.smile.bridge;

/**
 * @author smi1e
 * Date 2019/8/19 15:34
 * Description
 */
public class Client {
    public static void main(String[] args) {
        AbsPhoneType absPhoneType = new Fold();
        absPhoneType.setBrand(new Apple());
        absPhoneType.on();
        absPhoneType.call();
        absPhoneType.off();
        System.out.println("--------------------------------------");
        absPhoneType.setBrand(new Vivo());
        absPhoneType.on();
        absPhoneType.call();
        absPhoneType.off();
    }
}
