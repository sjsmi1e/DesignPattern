package com.smile.adapter;

/**
 * @author smi1e
 * Date 2019/8/17 16:43
 * Description 电压适配器
 */
public interface Adapter {
    Power adapter5V(Power power);
    Power adapter10V(Power power);
}
