package com.smile.observe;

/**
 * @author smi1e
 * Date 2019/9/5 11:34
 * Description
 */
public class BaiduWeb implements Observe {
    private String name;

    public BaiduWeb() {
        this.name = "BaiduWeb";
    }

    @Override
    public void update(float temperature, float humidity) {
        System.out.println("-----" + this.name + "更新-------");
        System.out.println("temperature:" + temperature + "\thumidity:" + humidity);
    }
}
