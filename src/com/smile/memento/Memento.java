package com.smile.memento;

/**
 * @author smi1e
 * Date 2019/9/5 18:25
 * Description 存储对象
 */
public class Memento {
    private int HP;
    private int MP;

    public Memento(int HP, int MP) {
        this.HP = HP;
        this.MP = MP;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }
}
