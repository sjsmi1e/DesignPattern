package com.smile.builder;

/**
 * @author smi1e
 * Date 2019/8/17 17:16
 * Description
 */
public interface HouseBuilder {
    void buildBasic();
    void buildBody();
    void buildRoof();
    House finish();
}
