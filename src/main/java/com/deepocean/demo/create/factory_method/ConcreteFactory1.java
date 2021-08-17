package com.deepocean.demo.create.factory_method;

public class ConcreteFactory1 extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
