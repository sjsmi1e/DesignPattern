package com.smile.responsibilityChain;

/**
 * @author smi1e
 * Date 2019/9/14 10:02
 * Description
 */
public class Request {
    private String name;
    private float price;

    public Request(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
