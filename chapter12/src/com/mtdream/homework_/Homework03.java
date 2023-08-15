package com.mtdream.homework_;

public class Homework03 {

    public static void func() {//静态方法
        try {
            throw new RuntimeException();//1.抛出一个运行异常
        } finally {
            System.out.println("B");//2.输出B
        }
    }

    public static void main(String[] args) {//main方法
        try {
            func();
            System.out.println("A");
        } catch (Exception e) {//捕获异常，然后输出C
            System.out.println("C");
        }
        System.out.println("D");//因为有处理异常，程序不会退出，继续运行，输出D
    }
}

