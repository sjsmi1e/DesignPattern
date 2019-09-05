package com.smile.decorate;

/**
 * @author smi1e
 * Date 2019/8/19 15:49
 * Description
 */
public class Decaf implements Coffee {
    private String desc;
    private float price;

    public Decaf() {
        this.desc = " Decaf ";
        this.price = 3.0f;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public float getCost() {
        return price;
    }
}
