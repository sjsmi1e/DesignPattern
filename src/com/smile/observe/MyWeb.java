package com.smile.observe;

/**
 * @author smi1e
 * Date 2019/9/5 11:17
 * Description
 */
public class MyWeb implements Observe {
    private String name;

    public MyWeb() {
        this.name = "MyWeb";
    }

    @Override
    public void update(float temperature, float humidity) {
        System.out.println("-----" + this.name + "更新-------");
        System.out.println("temperature:" + temperature + "\thumidity:" + humidity);
    }
}
