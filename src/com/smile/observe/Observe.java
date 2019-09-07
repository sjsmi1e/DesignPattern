package com.smile.observe;

/**
 * @author smi1e
 * Date 2019/9/5 11:16
 * Description 观察类接口
 */
public interface Observe {
    void update(float temperature,float humidity);
}
