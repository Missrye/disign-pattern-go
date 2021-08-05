package com.deepocean.designpattern.behaviormode.iterator;

public interface Iterator<Item> {

    Item next();

    boolean hasNext();
}
