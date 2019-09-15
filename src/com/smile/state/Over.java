package com.smile.state;

/**
 * @author smi1e
 * Date 2019/9/10 9:39
 * Description
 */
public class Over implements State {
    @Override
    public void deductionIntegral() {
        System.out.println("活动结束，谢谢你的参与！");
    }

    @Override
    public boolean luckDraw() {
        System.out.println("活动结束，谢谢你的参与！");
        return false;
    }

    @Override
    public void distributionPrizes() {
        System.out.println("活动结束，谢谢你的参与！");
    }
}
