package com.smile.factory.factory;

/**
 * @author smi1e
 * Date 2019/8/15 10:20
 * Description
 */
public interface ABSFactory {

    public ABSFactory getShapeFactory();
    public ABSFactory getColorFactory();

}
