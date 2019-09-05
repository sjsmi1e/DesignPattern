package com.smile.template;

/**
 * @author smi1e
 * Date 2019/8/26 10:50
 * Description
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("--------------取钱-------------------");
        ABSBank absBank = new WithdrawMoney();
        absBank.action();
        System.out.println("--------------存钱-------------------");
        ABSBank absBank2 = new SaveMoney();
        absBank2.action();
    }
}
