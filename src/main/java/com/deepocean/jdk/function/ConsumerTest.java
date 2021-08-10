package com.deepocean.jdk.function;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};

        printData(arr,
                s1 -> System.out.print("姓名: " + s1.split(",")[0]),
                s2 -> System.out.println(", 性别: " + s2.split(",")[1]));
    }

    public static void printData(String[] array, Consumer<String> con1, Consumer<String> con2) {
        for (String s : array) {
            con1.andThen(con2).accept(s);
        }
    }
}
