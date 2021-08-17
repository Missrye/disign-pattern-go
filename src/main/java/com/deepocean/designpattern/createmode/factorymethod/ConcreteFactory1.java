package com.deepocean.designpattern.createmode.factorymethod;

import com.deepocean.designpattern.createmode.simplefactory.ConcreteProduct1;
import com.deepocean.designpattern.createmode.simplefactory.Product;

public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
