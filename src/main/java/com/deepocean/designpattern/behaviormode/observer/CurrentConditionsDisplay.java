package com.deepocean.designpattern.behaviormode.observer;

public class CurrentConditionsDisplay implements Observer {

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay.update: " + temperature + " " + humidity + " " + pressure);
    }
}
