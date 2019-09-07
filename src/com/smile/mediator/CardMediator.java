package com.smile.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smi1e
 * Date 2019/9/5 12:09
 * Description
 */
public class CardMediator implements Mediator {
    private List<Carder> carders;

    public CardMediator() {
        this.carders = new ArrayList<>();
    }

    @Override
    public void showAns() {
        carders.forEach(x -> {
            System.out.println(x.getName() + "钱数：" + x.getMoney());
        });
    }

    @Override
    public void register(int index,Carder carder) {
        carders.add(index,carder);
    }

    @Override
    public void situation(List<Integer> winners, List<Integer> loosers) {
        double tmoney = loosers.size();
        double addMoney = (double) tmoney / winners.size();
        //扣钱
        loosers.forEach(x -> {
            Carder t = carders.get(x);
            t.setMoney(t.getMoney() - 1);
        });
        //加钱
        winners.forEach(x -> {
            Carder t = carders.get(x);
            t.setMoney(t.getMoney() + addMoney);
        });
    }


}
