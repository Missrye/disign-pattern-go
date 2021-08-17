package com.deepocean.algorithm.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    // ArrayList - toArray()
    public static void useToArray() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Integer[] intArray = (Integer[])list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intArray));
    }

    // fail-fast机制
    // fast-fail事件产生的条件：当多个线程对Collection进行操作时，若其中某一个线程通过iterator去遍历集合时，该集合的内容被其他线程所改变；则会抛出ConcurrentModificationException异常。
    // fast-fail解决办法：通过util.concurrent集合包下的相应类去处理，则不会产生fast-fail事件。


    public static void main(String[] args) {
        useToArray();
    }
}
