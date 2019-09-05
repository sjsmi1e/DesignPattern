package com.smile.factory.factory;

import com.smile.factory.color.Black;
import com.smile.factory.color.Color;
import com.smile.factory.color.Green;
import com.smile.factory.color.Red;
import com.smile.factory.shape.Circle;
import com.smile.factory.shape.Square;

/**
 * @author smi1e
 * Date 2019/8/15 10:25
 * Description
 */
public class ColorFactory implements ABSFactory {
    public Color getShape(String name) {
        if ("red".equals(name)) {
            return new Red();
        } else if ("green".equals(name)) {
            return new Green();
        } else if ("black".equals(name)) {
            return new Black();
        } else {
            return null;
        }
    }

    @Override
    public ABSFactory getShapeFactory() {
        return null;
    }

    @Override
    public ABSFactory getColorFactory() {
        return this;
    }
}
