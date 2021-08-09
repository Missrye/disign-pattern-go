package com.deepocean.designpattern.createmode.builder.inner_class_oriented;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @Author: M.R.
 * @Date: 2021/08/09
 * @Desc:
 *      1)Definition: 将一个复杂对象的构建与其表示分离，使得同样的构建过程可以创建不同的表;
 *      2)Problems Resolved: 当一个类的构造函数参数个数超过4个，而且这些参数有些是可选的参数，考虑使用构造者模式。
 * @Implement:
 *      1)在Computer 中创建一个静态内部类 Builder，然后将Computer 中的参数都复制到Builder类中。
 *      2)在Computer中创建一个private的构造函数，参数为Builder类型
 *      3)在Builder中创建一个public的构造函数，参数为Computer中必填的那些参数，cpu 和ram。
 *      4)在Builder中创建设置函数，对Computer中那些可选参数进行赋值，返回值为Builder类型的实例
 *      5)在Builder中创建一个build()方法，在其中构建Computer的实例并返回
 */
public class Computer {
    private final String cpu;   // 必选
    private final String ram;   // 必选
    private final int usbCount; // 可选
    private final String keyboard;  // 可选
    private final String display;   // 可选

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }

    public static class Builder {
        private String cpu;   // 必选
        private String ram;   // 必选
        private int usbCount; // 可选
        private String keyboard;  // 可选
        private String display;   // 可选

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder usbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder display(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
