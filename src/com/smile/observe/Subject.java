package com.smile.observe;

/**
 * @author smi1e
 * Date 2019/9/5 11:20
 * Description 被观察者接口
 */
public interface Subject {
    void register(Observe observe);
    void remove(Observe observe);
    void notifyObserve();
}
