package com.smile.decorate;

/**
 * @author smi1e
 * Date 2019/8/19 15:44
 * Description
 */
public class Espresso implements Coffee {
    private String desc;
    private float price;

    public Espresso() {
        this.desc = " Espresso ";
        this.price = 1.0f;
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
