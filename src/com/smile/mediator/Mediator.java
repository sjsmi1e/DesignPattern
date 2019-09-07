package com.smile.mediator;

import java.util.List;

/**
 * @author smi1e
 * Date 2019/9/5 12:04
 * Description
 */
public interface Mediator {
    void showAns();
    void register(int index,Carder carder);

    /**
     * winners为赢的人的下标，loosers为输的人的下标
     * @param winners
     * @param loosers
     */
    void situation(List<Integer>winners,List<Integer>loosers);
}
