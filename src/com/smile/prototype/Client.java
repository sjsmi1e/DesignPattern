package com.smile.prototype;

/**
 * @author smi1e
 * Date 2019/8/17 16:33
 * Description
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        People p1 = new People("Tom",new Address(),20);
        People p2 =(People) p1.clone();
        System.out.println("------------浅拷贝------------------");
        System.out.println("p1:"+p1.toString());
        System.out.println("p2:"+p2.toString());
        System.out.println("------------深拷贝------------------");
        People p3 = p1.deepClone();
        System.out.println("p1:"+p1.toString());
        System.out.println("p3:"+p3.toString());
    }
}
