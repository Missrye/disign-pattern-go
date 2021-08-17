package com.deepocean.jdk.function;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        int[] arr = {22, 54, 12, 7, 88};

        int min = getMin(() -> {
            int minValue = arr[0];
            for (int num : arr) {
                if (num < minValue) {
                    minValue = num;
                }
            }
            return minValue;
        });

        System.out.println(min);
    }

    public static int getMin(Supplier<Integer> sup) {
        return sup.get();
    }
}
