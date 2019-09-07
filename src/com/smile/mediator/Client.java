package com.smile.mediator;

import java.util.ArrayList;

/**
 * @author smi1e
 * Date 2019/9/5 16:09
 * Description
 */
public class Client {
    public static void main(String[] args) {
        Carder student = new Student("学生");
        Carder worker = new Worker("工人");
        Carder teacher = new Teacher("老师");
        Mediator mediator = new CardMediator();
        mediator.register(0, student);
        mediator.register(1, worker);
        mediator.register(2, teacher);
        System.out.println("-------初始状态----------");
        mediator.showAns();
        System.out.println("学生赢，其他输了。。。");
        ArrayList<Integer> winners = new ArrayList<>();
        winners.add(0);
        ArrayList<Integer> loosers = new ArrayList<>();
        loosers.add(1);
        loosers.add(2);
        mediator.situation(winners, loosers);
        mediator.showAns();
    }
}
