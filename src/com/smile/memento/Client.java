package com.smile.memento;

/**
 * @author smi1e
 * Date 2019/9/5 18:35
 * Description
 */
public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        System.out.println("-------新建人物-------");
        People people = new People();
        System.out.println(people.toString());
        System.out.println("-------受到攻击，减少40HP,30MP---------");
        people.setHP(people.getHP() - 40);
        people.setMP(people.getMP() - 30);
        System.out.println("-------------当前状态------------");
        System.out.println(people.toString());
        System.out.println("---------存储当前状态-----------");
        caretaker.addMemento(people.saveToMemento());
        System.out.println("-------受到攻击，死亡---------");
        people.setHP(0);
        people.setMP(0);
        System.out.println("------------当前状态--------");
        System.out.println(people.toString());
        System.out.println("------------回复上一状态--------");
        people.setMemento(caretaker.getMemento(0));
        people.getFromMemento();
        System.out.println(people.toString());
    }
}
