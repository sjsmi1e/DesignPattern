package com.smile.state;

/**
 * @author smi1e
 * Date 2019/9/10 9:39
 * Description
 */
public class DistributionPrizes implements State {
    private Context context;

    public DistributionPrizes(Context context) {
        this.context = context;
    }

    @Override
    public void deductionIntegral() {
        System.out.println("正在发访奖品哦，请注意查收！");
    }

    @Override
    public boolean luckDraw() {
        System.out.println("正在发访奖品哦，请注意查收！");
        return false;
    }

    @Override
    public void distributionPrizes() {
        if (context.getCount() > 0) {
            System.out.println("发放奖品");
            context.setState(context.getNoDraw());
        } else {
            System.out.println("奖品发访完毕");
            context.setState(context.getOver());
        }
    }
}
