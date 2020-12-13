package com.coco.Observer;

/**
 * @author #L
 * @date 2020/12/10
 */
public class ForecastDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;


    @Override
    public void display() {
        System.out.println("-----Forecast-----\n" + temperature + "F degrees\n" + humidity + "% humidity\n" + pressure + " pressure\n");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
