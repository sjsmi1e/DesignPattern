package com.smile.responsibilityChain;

/**
 * @author smi1e
 * Date 2019/9/14 10:03
 * Description
 */
public abstract class Handler {
    Handler handler;

    public abstract void processRequest(Request request);
}
