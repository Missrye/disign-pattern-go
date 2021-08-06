package com.deepocean.designpattern.behaviormode.strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak!");
    }
}
