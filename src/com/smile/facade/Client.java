package com.smile.facade;

/**
 * @author smi1e
 * Date 2019/8/19 15:09
 * Description
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.on();
        facade.off();
    }
}
