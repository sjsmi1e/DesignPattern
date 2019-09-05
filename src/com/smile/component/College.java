package com.smile.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smi1e
 * Date 2019/8/19 16:54
 * Description 学院
 */
public class College implements Component {
    private String desc;

    public College(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    private List<Component> components = new ArrayList<>();
    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void show() {
        System.out.println("-------------"+this.getDesc()+":"+"--------------------");
        components.forEach(component -> component.show());

    }
}
