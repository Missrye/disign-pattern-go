package com.deepocean.designpattern.createmode.builder.classic_builder;

/**
 * @Author: M.R.
 * @Date: 2021/08/09
 * @Desc:
 *      1)Product: 最终要生成的对象，例如 Computer实例。
 *      2)Builder： 构建者的抽象基类（有时会使用接口代替）。其定义了构建Product的抽象步骤，其实体类需要实现这些步骤。其会包含一个用来返回最终产品的方法Product getProduct()。
 *      3)ConcreteBuilder: Builder的实现类。
 *      4)Director: 决定如何构建最终产品的算法. 其会包含一个负责组装的方法void Construct(Builder builder)， 在这个方法中通过调用builder的方法，就可以设置builder，等设置完成后，就可以通过builder的 getProduct() 方法获得最终的产品。
 */
public class Computer {
    private String cpu;   // 必选
    private String ram;   // 必选
    private int usbCount; // 可选
    private String keyboard;  // 可选
    private String display;   // 可选

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setDisplay(String display) {
        this.display = display;
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
}
