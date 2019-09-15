package com.smile.state;

/**
 * @author smi1e
 * Date 2019/9/10 9:20
 * Description
 */
public interface State {
    void deductionIntegral();
    boolean luckDraw();
    void distributionPrizes();
}
