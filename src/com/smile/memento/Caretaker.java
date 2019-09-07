package com.smile.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smi1e
 * Date 2019/9/5 18:32
 * Description
 */
public class Caretaker {
    private List<Memento> mementos;

    public Caretaker() {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public void removeMemento(Memento memento) {
        mementos.remove(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
