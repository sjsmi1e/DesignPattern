package com.smile.state;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author smi1e
 * Date 2019/9/10 9:21
 * Description
 */
public class NoDraw implements State {
    private Context context;

    public NoDraw(Context context) {
        this.context = context;
    }

    @Override
    public void deductionIntegral() {
        System.out.println("正在扣除积分...");
        //数据库扣除积分
        System.out.println("扣除成功!");
        context.setState(context.getCanDraw());
    }

    @Override
    public boolean luckDraw() {
        System.out.println("当前不能抽奖，请先扣除积分");
        return false;
    }

    @Override
    public void distributionPrizes() {
        System.out.println("当前不能抽奖，请先扣除积分");
    }
}
