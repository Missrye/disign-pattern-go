package com.deepocean.designpattern.createmode.builder.inner_class_oriented;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("因特尔", "三星")
                .keyboard("罗技")
                .usbCount(2)
                .display("三星24寸")
                .build();
        System.out.println(computer);
    }
}
