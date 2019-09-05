package com.smile.component;

/**
 * @author smi1e
 * Date 2019/8/19 17:08
 * Description
 */
public class Client {
    public static void main(String[] args) {
        University university = new University(" sust ");
        College college =null;
        university.add(college = new College(" 电智学院 "));
        college.add(new Major(" 计算机 "));
        college.add(new Major(" 网络 "));
        college.add(new Major(" 物联网 "));
        university.add(college = new College(" 电信学院 "));
        college.add(new Major(" 电信 "));
        college.add(new Major(" 电气 "));
        university.add(college = new College(" 经管学院 "));
        college.add(new Major(" 会计 "));
        college.add(new Major(" 物流 "));
        university.add(college = new College(" 机电学院 "));
        college.add(new Major(" 能动 "));
        college.add(new Major(" 机械 "));

        university.show();




    }
}
