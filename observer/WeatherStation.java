package com.coco.observer;


public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.measurementsChanged();

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(85, 70, 35.5f);
        weatherData.measurementsChanged();
    }
}
