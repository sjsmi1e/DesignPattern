package com.smile.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smi1e
 * Date 2019/8/19 17:00
 * Description 专业(叶子节点)
 */
public class Major implements Component {
    private String desc;

    public Major(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void show() {
        System.out.print(getDesc());
        System.out.println();
    }
}
