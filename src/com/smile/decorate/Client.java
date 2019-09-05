package com.smile.decorate;

/**
 * @author smi1e
 * Date 2019/8/19 16:08
 * Description
 */
public class Client {
    public static void main(String[] args) {
        //两巧克力+一牛奶+Decaf
        Coffee decaf = new Decaf();
        decaf = new Milk(decaf);
        decaf = new Chocolate(decaf);
        decaf = new Chocolate(decaf);
        System.out.println(decaf.getDesc());
        System.out.println(decaf.getCost());
    }
}
