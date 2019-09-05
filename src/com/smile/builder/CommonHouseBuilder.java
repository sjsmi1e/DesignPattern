package com.smile.builder;

/**
 * @author smi1e
 * Date 2019/8/17 17:18
 * Description 普通房子建造者
 */
public class CommonHouseBuilder implements HouseBuilder {
    private House house = new House("CommonHouse");
    @Override
    public void buildBasic() {
        System.out.println("CommonHouseBuilder is building Basic...");
        house.setBase(true);
    }

    @Override
    public void buildBody() {
        System.out.println("CommonHouseBuilder is building body...");
        house.setBody(true);
    }

    @Override
    public void buildRoof() {
        System.out.println("CommonHouseBuilder is building roof...");
        house.setRoof(true);
    }

    @Override
    public House finish() {
        System.out.println("CommonHouseBuilder is finished");
        return house;

    }
}
