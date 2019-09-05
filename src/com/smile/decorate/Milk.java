package com.smile.decorate;

/**
 * @author smi1e
 * Date 2019/8/19 15:58
 * Description
 */
public class Milk extends Seasoning {

    private String desc = " milk ";
    private float price = 1.5f;

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDesc() {
        return desc+super.getCoffee().getDesc();
    }


    @Override
    public float getCost() {
        return super.getCoffee().getCost()+price;
    }
}
