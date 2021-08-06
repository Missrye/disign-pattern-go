package com.deepocean.designpattern.behaviormode.observer;

public class StatisticsDisplay implements Observer {

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: " + temperature + " " + humidity + " " + pressure);
    }
}
