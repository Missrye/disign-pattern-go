package com.deepocean.demo.create.simple_factory;

public class SimpleFactory {
    public Product createProduct(int type) {
        switch (type) {
            case 1:
                return new ConcreteProduct1();
            case 2:
                return new ConcreteProduct2();
            default:
                throw new RuntimeException("type类型不正确");
        }

    }

}
