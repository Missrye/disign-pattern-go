package com.deepocean.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        // 验证Map
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 1);
//        map.put(1, 2);
//        map.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
//
//        Map<Integer, Integer> mapIdentity = new IdentityHashMap<>();
//        mapIdentity.put(1, 1);
//        mapIdentity.put(1, 2);
//        mapIdentity.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));

        Map<Integer, Integer> map = new HashMap<>();
        int[] source = new int[] {3, 3, 6};
        for (int i = 0; i < source.length; i++) {
            map.put(source[i], i);
        }
        map.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
    }
}
