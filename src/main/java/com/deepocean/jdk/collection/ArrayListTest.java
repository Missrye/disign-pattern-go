package com.deepocean.jdk.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> arrays = new ArrayList<>();
    }

    // External annotation --> 通过 annotations.xml 配置
    public void externalAnnotation(Collection<? extends String> c) {
        System.out.println("=== 外部注解代替常用注解 ===");
    }

}
