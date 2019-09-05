package com.smile.decorate;

/**
 * @author smi1e
 * Date 2019/8/19 16:04
 * Description
 */
public class Chocolate extends Seasoning {
    private String desc = " Chocolate ";
    private float price = 3.5f;

    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDesc() {
        return desc+super.getCoffee().getDesc();
    }

    @Override
    public float getCost() {
        return super.getCoffee().getCost() + price;
    }
}
