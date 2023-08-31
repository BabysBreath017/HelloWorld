package com.mtdream.enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season1.AUTUMN);
        System.out.println(Season1.SPRING);
    }
}

//演示自定义枚举实现
class Season1 {//类
    private String name;
    private String desc;//描述

    //定义了四个对象, 固定.
    public static final Season1 SPRING = new Season1("春天", "温暖");
    public static final Season1 WINTER = new Season1("冬天", "寒冷");
    public static final Season1 AUTUMN = new Season1("秋天", "凉爽");
    public static final Season1 SUMMER = new Season1("夏天", "炎热");


    //1. 将构造器私有化,目的防止 直接 new
    //2. 去掉setXxx方法, 防止属性被修改
    //3. 在Season1 内部，直接创建固定的对象
    //4. 优化，可以加入 final 修饰符
    private Season1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
