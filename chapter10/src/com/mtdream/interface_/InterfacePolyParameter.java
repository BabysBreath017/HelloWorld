package com.mtdream.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {

        // *接口的多态体现*
        //接口类型的变量 if01 可以指向 实现了IF接口类的对象实例
        IF if01 = new Monster();//Monster这个实例是可以传递给IF这个接口的
        if01 = new Car();

        // *继承体现的多态*
        //父类类型的变量 a 可以指向 继承AAA的子类的对象实例
        AAA a = new BBB();//向上转型
        a = new CCC();
    }
}

interface IF {}
class Monster implements IF{}
class Car implements  IF{}


//对比前面学习的多态继承
class AAA {

}
class BBB extends AAA {}
class CCC extends AAA {}

