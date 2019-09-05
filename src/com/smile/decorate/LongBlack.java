package com.smile.decorate;

/**
 * @author smi1e
 * Date 2019/8/19 15:48
 * Description
 */
public class LongBlack implements Coffee {
    private String desc;
    private float price;
    public LongBlack() {
        this.desc = " LongBlack ";
        this.price = 2.5f;
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
