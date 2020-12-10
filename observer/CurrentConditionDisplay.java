package com.coco.observer;

/**
 * @author #L
 * @date 2020/12/10
 */
public class CurrentConditionDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;


    @Override
    public void display() {
        System.out.println("-----Current conditions-----\n" + temperature + "F degrees\n" + humidity + "% humidity\n" + pressure + " pressure\n");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
