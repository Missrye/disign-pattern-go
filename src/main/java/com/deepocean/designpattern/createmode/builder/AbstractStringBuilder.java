package com.deepocean.designpattern.createmode.builder;

import java.util.Arrays;

public class AbstractStringBuilder {

    protected char[] value;

    protected int count;

    public AbstractStringBuilder(int capacity) {
        count = 0;
        value = new char[capacity];
    }

    private void ensureCapacityInternal(int minimumCapacity) {
        // overflow-conscious code
        if (minimumCapacity - value.length > 0) {
            expandCapacity(minimumCapacity);
        }
    }

    void expandCapacity(int minimumCapacity) {
        int newCapacity = value.length * 2 + 2;

        if (newCapacity - minimumCapacity < 0) {
            newCapacity = minimumCapacity;
        }

        if (newCapacity < 0) {
            if (minimumCapacity < 0)  // overflow
                throw new OutOfMemoryError();
            newCapacity = Integer.MAX_VALUE;
        }

        value = Arrays.copyOf(value, newCapacity);
    }
}

