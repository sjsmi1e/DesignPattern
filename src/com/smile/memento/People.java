package com.smile.memento;

import com.smile.mediator.Mediator;

/**
 * @author smi1e
 * Date 2019/9/5 18:24
 * Description 展示对象（原始存在对象）
 */
public class People {
    private int HP;
    private int MP;
    private Memento memento;

    @Override
    public String toString() {
        return "People{" +
                "HP=" + HP +
                ", MP=" + MP +
                '}';
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public People() {
        this.HP = 100;
        this.MP = 100;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public Memento saveToMemento() {
        return new Memento(HP, MP);
    }

    public void getFromMemento() {
        this.HP = memento.getHP();
        this.MP = memento.getMP();
    }


}
