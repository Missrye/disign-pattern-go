package com.deepocean.designpattern.behaviormode.mediator;

public class Client {

    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();
        Calendar calendar = new Calendar();
        Sprinkler sprinkler = new Sprinkler();
        Mediator mediator = new ConcreteMediator(alarm, coffeePot, calendar, sprinkler);
        // Clock alarm
        alarm.onEvent(mediator);
    }
}
