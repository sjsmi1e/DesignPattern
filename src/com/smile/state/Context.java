package com.smile.state;

/**
 * @author smi1e
 * Date 2019/9/10 9:23
 * Description
 */
public class Context {
    private State state;
    private int count = 5;
    private NoDraw noDraw;
    private CanDraw canDraw;
    private DistributionPrizes distributionPrizes;
    private Over over;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public NoDraw getNoDraw() {
        return noDraw;
    }

    public void setNoDraw(NoDraw noDraw) {
        this.noDraw = noDraw;
    }

    public CanDraw getCanDraw() {
        return canDraw;
    }

    public void setCanDraw(CanDraw canDraw) {
        this.canDraw = canDraw;
    }

    public DistributionPrizes getDistributionPrizes() {
        return distributionPrizes;
    }

    public void setDistributionPrizes(DistributionPrizes distributionPrizes) {
        this.distributionPrizes = distributionPrizes;
    }

    public Over getOver() {
        return over;
    }

    public void setOver(Over over) {
        this.over = over;
    }

    public Context() {
        this.state = new NoDraw(this);
        noDraw = new NoDraw(this);
        canDraw = new CanDraw(this);
        distributionPrizes = new DistributionPrizes(this);
        over = new Over();
    }

    public int getCount() {
        return count--;
    }
}
