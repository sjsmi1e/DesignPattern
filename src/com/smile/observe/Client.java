package com.smile.observe;

/**
 * @author smi1e
 * Date 2019/9/5 11:34
 * Description
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observe t = null;
        weatherData.register(t = new MyWeb());
        weatherData.register(new BaiduWeb());
        weatherData.change(20.0f, 10.0f);
        weatherData.remove(t);
        System.out.println("--------温度改变------------");
        weatherData.change(20.1f, 10.1f);
    }
}
