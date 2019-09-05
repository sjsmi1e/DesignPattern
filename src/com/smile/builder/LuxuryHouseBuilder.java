package com.smile.builder;

/**
 * @author smi1e
 * Date 2019/8/17 17:20
 * Description 豪华房子建造者
 */
public class LuxuryHouseBuilder implements HouseBuilder {
    private House house = new House("LuxuryHouse");
    @Override
    public void buildBasic() {
        System.out.println("LuxuryHouseBuilder is building Basic...");
        house.setBase(true);
    }

    @Override
    public void buildBody() {
        System.out.println("LuxuryHouseBuilder is building body...");
        house.setBody(true);
    }

    @Override
    public void buildRoof() {
        System.out.println("LuxuryHouseBuilder is building roof...");
        house.setRoof(true);
    }

    @Override
    public House finish() {
        System.out.println("LuxuryHouseBuilder is finished");
        return house;
    }
}
