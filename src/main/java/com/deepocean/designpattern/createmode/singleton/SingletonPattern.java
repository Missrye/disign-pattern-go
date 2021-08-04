package com.deepocean.designpattern.createmode.singleton;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author: M.R.
 * @Date: 2021/08/02
 * @Desc: 单例模式
 */
public class SingletonPattern {

}

/**
 * 懒汉式 --- 线程不安全
 */
class SingletonPatternV1 {

    private static SingletonPatternV1 uniqueInstance;

    private SingletonPatternV1() {

    }

    public static SingletonPatternV1 getUniqueInstance() {
        if (Objects.isNull(uniqueInstance)) {
            uniqueInstance = new SingletonPatternV1();
        }

        return uniqueInstance;
    }
}


/**
 * 饿汉式 --- 线程安全，不节约资源
 */
class SingletonPatternV2 {

    private static SingletonPatternV2 uniqueInstance = new SingletonPatternV2();

    private SingletonPatternV2() {

    }

    public static SingletonPatternV2 getUniqueInstance() {
        return uniqueInstance;
    }
}


/**
 * 懒汉式 --- 线程安全，线程阻塞，性能问题
 */
class SingletonPatternV3 {

    private static SingletonPatternV3 uniqueInstance;

    private SingletonPatternV3() {

    }

    public static synchronized SingletonPatternV3 getUniqueInstance() {
        if (Objects.isNull(uniqueInstance)) {
            uniqueInstance = new SingletonPatternV3();
        }

        return uniqueInstance;
    }
}


/**
 * 双重校验锁 --- 线程安全
 */
class SingletonPatternV4 {

    private volatile static SingletonPatternV4 uniqueInstance;

    private SingletonPatternV4() {

    }

    public static SingletonPatternV4 getUniqueInstance() {
        if (Objects.isNull(uniqueInstance)) {
            synchronized (SingletonPatternV4.class) {
                if (Objects.isNull(uniqueInstance)) {
                    uniqueInstance = new SingletonPatternV4();
                }
            }
        }

        return uniqueInstance;
    }
}


/**
 * 静态内部类实现
 */
class SingletonPatternV5 {

    private SingletonPatternV5() {

    }

    private static class SingletonHolder {
        private static final SingletonPatternV5 INSTANCE = new SingletonPatternV5();
    }

    public static SingletonPatternV5 getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }
}


/**
 * 枚举实现 --- 阻止反射攻击
 */
enum SingletonPatternV6 {
    INSTANCE;

    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public static void main(String[] args) {
        // 单例测试
        SingletonPatternV6 firstSingleton = SingletonPatternV6.INSTANCE;
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());

        SingletonPatternV6 secondSingleton = SingletonPatternV6.INSTANCE;
        secondSingleton.setObjName("secondName");
        System.out.println(firstSingleton.getObjName());
        System.out.println(secondSingleton.getObjName());

        // 反射获取实例测试
        try {
            SingletonPatternV6[] enumConstants = SingletonPatternV6.class.getEnumConstants();
            Arrays.stream(enumConstants).forEach(x -> System.out.println(x.getObjName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





