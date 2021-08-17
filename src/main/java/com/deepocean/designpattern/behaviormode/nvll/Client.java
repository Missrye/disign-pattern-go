package com.deepocean.designpattern.behaviormode.nvll;

public class Client {

    public static void main(String[] args) {
        AbstractOperation abstractOperation = func(-1);
        abstractOperation.request();
    }

    public static AbstractOperation func(int param) {
        if (param < 0)
            return new NullOperation();

        return new RealOperation();
    }
}
