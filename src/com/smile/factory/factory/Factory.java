package com.smile.factory.factory;

/**
 * @author smi1e
 * Date 2019/8/15 10:27
 * Description
 */
public class Factory {
    private Factory() {
    }

    public static ABSFactory getFactory(String name) {
        if ("shape".equals(name)) {
            return new ShapeFactory();
        } else if ("color".equals(name)) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
