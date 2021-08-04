package com.deepocean.designpattern.createmode.factorymethod;

import com.deepocean.designpattern.createmode.simplefactory.ConcreteProduct2;
import com.deepocean.designpattern.createmode.simplefactory.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
