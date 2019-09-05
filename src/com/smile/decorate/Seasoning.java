package com.smile.decorate;

/**
 * @author smi1e
 * Date 2019/8/19 15:56
 * Description
 */
public abstract class Seasoning implements Coffee {
    private Coffee coffee;

    public Seasoning(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
