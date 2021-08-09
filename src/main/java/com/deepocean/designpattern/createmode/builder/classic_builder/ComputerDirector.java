package com.deepocean.designpattern.createmode.builder.classic_builder;

public class ComputerDirector {
    public void makeComputer(ComputerBuilder computerBuilder) {
        computerBuilder.setUsbCount();
        computerBuilder.setKeyboard();
        computerBuilder.setDisplay();
    }
}
