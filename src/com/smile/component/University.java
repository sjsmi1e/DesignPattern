package com.smile.component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author smi1e
 * Date 2019/8/19 16:53
 * Description 大学
 */
public class University implements Component {
    private String desc;

    public University(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private List<Component> colleges = new ArrayList<>();


    @Override
    public void add(Component component) {
        colleges.add(component);
    }

    @Override
    public void remove(Component component) {
        colleges.remove(component);
    }

    @Override
    public void show() {
        System.out.println("-------大学名称："+this.getDesc()+"--------------------");
        colleges.forEach(component -> component.show());
    }
}
