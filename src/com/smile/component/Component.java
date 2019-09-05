package com.smile.component;

/**
 * @author smi1e
 * Date 2019/8/19 16:54
 * Description
 */
public interface Component {
    void add(Component component);
    void remove(Component component);
    void show();
}
