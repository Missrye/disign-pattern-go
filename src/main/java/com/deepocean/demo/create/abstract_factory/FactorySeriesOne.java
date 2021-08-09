package com.deepocean.demo.create.abstract_factory;

public class FactorySeriesOne extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
