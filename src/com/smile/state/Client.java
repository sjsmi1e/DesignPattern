package com.smile.state;

/**
 * @author smi1e
 * Date 2019/9/10 9:50
 * Description
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        int count = 100;
        for (int i = 0; i < count; i++) {
            System.out.println("-------------------第" + i + "次----------------");
            context.getState().deductionIntegral();
            if (context.getState().luckDraw()) {
                context.getState().distributionPrizes();
            }
        }


    }
}
