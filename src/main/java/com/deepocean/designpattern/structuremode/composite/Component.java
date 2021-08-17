package com.deepocean.designpattern.structuremode.composite;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void print() {
        print(0);
    }

    abstract void print(int level);

    public abstract void add(Component component);

    public abstract void remove(Component component);
}
