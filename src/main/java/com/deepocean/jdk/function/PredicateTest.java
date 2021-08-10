package com.deepocean.jdk.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };

        List<String> list = getData(array,
                s1 -> s1.split(",")[1].equals("女"),
                s2 -> s2.split(",")[0].length() == 4);

        System.out.println(list);
    }

    public static List<String> getData(String[] arr, Predicate<String> p1, Predicate<String> p2) {
        List<String> list = new ArrayList<>();

        for (String s : arr) {
            boolean flag = p1.and(p2).test(s);
            if (flag) {
                list.add(s);
            }
        }

        return list;
    }
}
