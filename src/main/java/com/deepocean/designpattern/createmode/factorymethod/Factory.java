package com.deepocean.designpattern.createmode.factorymethod;


import com.deepocean.designpattern.createmode.simplefactory.Product;

public abstract class Factory {

    public abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}
