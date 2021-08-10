package com.deepocean.jdk.function;

import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = x -> (int) Math.pow(x, 2);
        Function<Integer, Integer> function2 = x -> x * 2;
        // (5 * 2)^2 = 100
        System.out.println(function1.compose(function2).apply(5));
        // 5^2 * 2 = 50
        System.out.println(function1.andThen(function2).apply(5));
        // 5^2 = 25
        System.out.println(function1.apply(5));
        // 5 = 5
        System.out.println(Function.identity().apply(5));


        IntFunction<String> intFunction = String::valueOf;
        String s = intFunction.apply(5);
        System.out.println(s);


        String str = "赵丽颖,20";
        int number = getData(str, str1 -> str1.split(",")[1], str2 -> Integer.parseInt(str2), num1 -> num1 + 100);
        // 20 + 100 = 120
        System.out.println("number = " + number);
    }

    public static int getData(String str, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(str);
    }
}
