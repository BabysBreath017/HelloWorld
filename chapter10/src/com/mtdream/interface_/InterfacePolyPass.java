package com.mtdream.interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        // 接口类型的变量 ig 可以指向实现了该接口的类 Teacher的对象实例
        IG ig = new Teacher();
        // 二号接口继承了一号接口，那实现了二号接口的实例也实现了一号接口
        //如果IG 继承了 IH 接口，而Teacher 类实现了 IG接口
        //实际上就相当于 Teacher 类也实现了 IH接口.
        //这就是所谓的 接口多态传递现象.
        IH ih = new Teacher();
    }
}
interface IH{
    void hi();
}
interface IG extends IH{}

class Teacher implements IG{

    @Override
    public void hi() {
        System.out.println("hi~");
    }
}
