package com.deepocean.designpattern.createmode.builder.classic_builder;

public class Client {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder builder = new MacComputerBuilder("I5处理器", "三星125");
        director.makeComputer(builder);
        Computer computer = builder.getComputer();
        System.out.println(computer);
    }
}
