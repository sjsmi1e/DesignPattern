package com.smile.factory.client;

import com.smile.factory.factory.ABSFactory;
import com.smile.factory.factory.Factory;
import com.smile.factory.factory.ShapeFactory;
import com.smile.factory.shape.Shape;

/**
 * @author smi1e
 * Date 2019/8/15 10:34
 * Description
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shape =(ShapeFactory) Factory.getFactory("shape");
        Shape circle = shape.getShape("circle");
        circle.draw();

    }
}
