package com.smile.prototype;

import java.io.*;

/**
 * @author smi1e
 * Date 2019/8/17 16:23
 * Description
 */
public class People implements Cloneable, Serializable {
    private String name;
    private Address address;
    private int age;

    public People(String name, Address address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", address=" + address.hashCode() +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public People deepClone(){
        People people = null;


        try {
            //写出
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //写入
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            people = (People) ois.readObject();
            bos.close();
            oos.close();
            bis.close();
            bos.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return people;
    }
}
