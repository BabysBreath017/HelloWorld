package com.mtdream.customexception_;

public class CustomException {
    public static void main(String[] args) /*throws AgeException*/ {

        // throws和throw的区别
        // throws是异常处理的一种方式，它在方法声明处，后面跟异常类型
        // throw是手动生成异常对象的关键字，在方法体中，后面跟异常对象

        int age = 180;
        //要求范围在 18 – 120 之间，否则抛出一个自定义异常
        if(!(age >= 18 && age <= 120)) {
            //这里我们可以通过构造器，设置信息
            throw new AgeException("年龄需要在 18~120之间");
        }
        System.out.println("你的年龄范围正确.");
    }
}
//自定义一个异常
//1. 一般情况下，我们自定义异常是继承 RuntimeException
//2. 即把自定义异常做成 运行时异常，好处时，我们可以使用默认的处理机制
//3. 即比较方便
class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}
