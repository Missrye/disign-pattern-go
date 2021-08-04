package com.deepocean.designpattern.createmode.factorymethod;

import com.deepocean.designpattern.createmode.simplefactory.ConcreteProduct3;
import com.deepocean.designpattern.createmode.simplefactory.Product;

public class ConcreteFactory3 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct3();
    }
}
