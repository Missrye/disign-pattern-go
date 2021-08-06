package com.deepocean.designpattern.behaviormode.templatemethod;

public class Client {

    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
        System.out.println("--------------------");
        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
    }
}
