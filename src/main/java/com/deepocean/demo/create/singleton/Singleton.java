package com.deepocean.demo.create.singleton;

import java.util.Objects;

public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (Objects.isNull(singleton)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(singleton)) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
