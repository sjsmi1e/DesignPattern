package com.smile.bridge;

/**
 * @author smi1e
 * Date 2019/8/19 15:25
 * Description
 */
public abstract class AbsPhoneType {
    private Brand brand;
    private String desc;

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void on() {
        System.out.println(this.desc);
        brand.on();
    }

    public void off() {
        System.out.println(this.desc);
        brand.off();
    }

    public void call() {
        System.out.println(this.desc);
        brand.call();
    }
}
