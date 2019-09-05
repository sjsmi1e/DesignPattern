package com.smile.builder;


/**
 * @author smi1e
 * Date 2019/8/17 17:39
 * Description 客户端
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("构建普通房子");
        Director director = new Director(new CommonHouseBuilder());
        House construct = director.construct();
        System.out.println(construct.toString());
        System.out.println("构建豪华房子");
        Director director2 = new Director(new LuxuryHouseBuilder());
        House construct2 = director2.construct();
        System.out.println(construct2.toString());
    }
}
