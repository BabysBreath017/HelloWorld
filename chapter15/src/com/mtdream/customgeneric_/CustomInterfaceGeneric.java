package com.mtdream.customgeneric_;

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
/**
 *  泛型接口使用的说明
 *  1. 接口中，静态成员也不能使用泛型
 *  2. 泛型接口的类型, 在继承接口或者实现接口时确定
 *  3. 没有指定类型，默认为Object
 */

// 1.IA在继承IUsb接口的同时，指定泛型接口的类型
// interface IUsb<U, R>
interface IA extends IUsb<String, Double> {

}

class AA implements IA { //class AA 去实现IA接口

    //当我们去实现IA接口时，因为IA在继承IUsb 接口时，指定了U 为String R为Double
    //在实现IUsb接口的方法时，使用String替换U, 是Double替换R
    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

// 2.实现接口时，直接指定泛型接口的类型
// 给U 指定Integer 给 R 指定了 Float
// 所以，当我们实现IUsb方法时，会使用Integer替换U, 使用Float替换R

//interface IUsb<U, R>
class BB implements IUsb<Integer, Float> {

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
// 3.没有指定类型，默认为Object
class CC implements IUsb { //建议直接写成 IUsb<Object,Object>
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    } //等价 class CC implements IUsb<Object,Object> {
}


interface IUsb<U, R> {

    int n = 10;
    //U name; 接口中，它的成员都是静态性质的，静态成员不能使用泛型

    //普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);//抽象方法也可以使用泛型

    //在jdk8 中，可以在接口中，使用默认方法, 也是可以使用泛型
    default R method(U u) {
        return null;
    }
}
