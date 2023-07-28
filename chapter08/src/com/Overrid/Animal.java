package com.Overrid;

public class Animal {
    //Dog的 cry方法和 Animal的 cry定义形式一样 （名称，返回类型，参数 ）
    //Dog的cry方法，重写了Animal 的cry方法
    public void cry(){
        System.out.println("动物叫唤");
    }
    public Object m1(){
        return null;
    }
    //Object 不是String的子类，编译报错
//    public String m2(){
//        return null;
//    }
    public AAA m3(){
        return null;
    }
    public void eat(){

    }
}
class AAA{

}
class BBB extends AAA{

}