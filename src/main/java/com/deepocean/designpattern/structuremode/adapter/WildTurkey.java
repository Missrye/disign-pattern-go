package com.deepocean.designpattern.structuremode.adapter;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("gobble!");
    }
}
