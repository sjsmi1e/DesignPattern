package com.smile.factory.factory;

import com.smile.factory.shape.Circle;
import com.smile.factory.shape.Rectangle;
import com.smile.factory.shape.Shape;
import com.smile.factory.shape.Square;

/**
 * @author smi1e
 * Date 2019/8/15 10:21
 * Description
 */
public class ShapeFactory implements ABSFactory{

    public Shape getShape(String name){
        if ("circle".equals(name)){
            return new Circle();
        }else if ("rectangle".equals(name)){
            return new Rectangle();
        }else if ("Square".equals(name)){
            return new Square();
        }else {
            return null;
        }
    }

    @Override
    public ABSFactory getShapeFactory() {
        return this;
    }

    @Override
    public ABSFactory getColorFactory() {
        return null;
    }
}
