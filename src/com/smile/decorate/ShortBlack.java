package com.smile.decorate;

/**
 * @author smi1e
 * Date 2019/8/19 15:47
 * Description
 */
public class ShortBlack implements Coffee {
    private String desc;
    private float price;

    public ShortBlack() {
        this.desc = " ShortBlack ";
        this.price = 2.0f;
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
