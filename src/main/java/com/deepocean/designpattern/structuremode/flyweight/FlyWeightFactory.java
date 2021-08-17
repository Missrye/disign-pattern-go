package com.deepocean.designpattern.structuremode.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {

    private HashMap<String, FlyWeight> flyWeights = new HashMap<>();

    FlyWeight getFlyWeight(String intrinsicState) {
        if (!flyWeights.containsKey(intrinsicState)) {
            FlyWeight flyWeight = new ConcreteFlyWeight(intrinsicState);
            flyWeights.put(intrinsicState, flyWeight);
        }

        return flyWeights.get(intrinsicState);
    }
}
