package com.smile.command;

/**
 * @author smi1e
 * Date 2019/8/26 13:28
 * Description
 */
public interface Command {
    /**
     * 执行
     */
    void excute();

    /**
     * 撤销
     */
    void undo();
}
