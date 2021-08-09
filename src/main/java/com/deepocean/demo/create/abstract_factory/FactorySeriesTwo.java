package com.deepocean.demo.create.abstract_factory;

public class FactorySeriesTwo extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
