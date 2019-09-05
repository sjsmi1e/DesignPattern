package com.smile.decorate;

/**
 * @author smi1e
 * Date 2019/8/19 16:03
 * Description
 */
public class Soy extends Seasoning {
    private String desc = " Soy ";
    private float price = 0.5f;
    public Soy(Coffee coffee) {
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
