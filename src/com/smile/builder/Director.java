package com.smile.builder;

/**
 * @author smi1e
 * Date 2019/8/17 17:37
 * Description 执行者
 */
public class Director {
    HouseBuilder houseBuilder = null;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House construct(){
        houseBuilder.buildBasic();
        houseBuilder.buildBody();
        houseBuilder.buildRoof();
        House house = houseBuilder.finish();
        return house;
    }
}
