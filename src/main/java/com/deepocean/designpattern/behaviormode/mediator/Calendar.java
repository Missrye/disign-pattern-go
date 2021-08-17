package com.deepocean.designpattern.behaviormode.mediator;

public class Calendar extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calendar");
    }


    public void doCalendar() {
        System.out.println("doCalendar()");
    }
}
