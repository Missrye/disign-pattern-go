package com.deepocean.designpattern.behaviormode.mediator;

public class ConcreteMediator extends Mediator {

    private Alarm alarm;

    private CoffeePot coffeePot;

    private Calendar calendar;

    private Sprinkler sprinkler;


    public ConcreteMediator(Alarm alarm, CoffeePot coffeePot, Calendar calendar, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.coffeePot = coffeePot;
        this.calendar = calendar;
        this.sprinkler = sprinkler;
    }

    @Override
    public void doEvent(String eventType) {
        switch (eventType) {
            case "alarm":
                doAlarmEvent();
                break;
            case "coffeePot":
                doCoffeePotEvent();
                break;
            case "calender":
                doCalenderEvent();
                break;
            default:
                doSprinklerEvent();
        }
    }


    public void doAlarmEvent() {
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calendar.doCalendar();
        sprinkler.doSprinkler();
    }


    public void doCoffeePotEvent() {
        // do something
    }


    public void doCalenderEvent() {
        // do something
    }


    public void doSprinklerEvent() {
        // do something
    }
}
