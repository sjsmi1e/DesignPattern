package com.smile.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smi1e
 * Date 2019/9/5 11:23
 * Description 具体被观察者
 */
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private List<Observe> observes;

    public WeatherData() {
        this.observes = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    @Override
    public void register(Observe observe) {
        observes.add(observe);
    }

    @Override
    public void remove(Observe observe) {
        observes.remove(observe);
    }

    public void change(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObserve();
    }

    @Override
    public void notifyObserve() {
        observes.forEach(x -> x.update(this.temperature, this.humidity));
    }
}
