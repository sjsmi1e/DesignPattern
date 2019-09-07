package com.smile.mediator;

/**
 * @author smi1e
 * Date 2019/9/5 12:10
 * Description
 */
public abstract class Carder {
    private double money;
    private String name;

    public Carder(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
