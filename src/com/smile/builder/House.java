package com.smile.builder;

/**
 * @author smi1e
 * Date 2019/8/17 17:32
 * Description 房子产品
 */
public class House {
    private String type;
    private boolean base;
    private boolean body;
    private boolean roof;

    public House(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBase(boolean base) {
        this.base = base;
    }

    public void setBody(boolean body) {
        this.body = body;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public String getType() {
        return type;
    }

    public boolean isBase() {
        return base;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", base=" + base +
                ", body=" + body +
                ", roof=" + roof +
                '}';
    }

    public boolean isBody() {
        return body;
    }

    public boolean isRoof() {
        return roof;
    }
}
