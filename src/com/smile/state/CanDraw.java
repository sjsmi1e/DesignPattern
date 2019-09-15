package com.smile.state;

/**
 * @author smi1e
 * Date 2019/9/10 9:25
 * Description
 */
public class CanDraw implements State {
    private Context context;

    public CanDraw(Context context) {
        this.context = context;
    }

    @Override
    public void deductionIntegral() {
        System.out.println("当前处于抽奖环节，请先抽奖!");
    }

    @Override
    public boolean luckDraw() {
        System.out.println("正在抽奖，请稍后...");
        if (Math.random() >= 0.9) {
            context.setState(context.getDistributionPrizes());
            return true;
        } else {
            System.out.println("很遗憾，抽奖失败！下次再接再厉！");
            context.setState(context.getNoDraw());
            return false;
        }
    }

    @Override
    public void distributionPrizes() {
        System.out.println("当前处于抽奖环节，请先抽奖!");
    }
}
