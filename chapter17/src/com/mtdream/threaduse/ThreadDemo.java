package com.mtdream.threaduse;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        多线程的第一种启动方式：
            1.自己定义一个类继承Thread
            2.重写run方法
            3.创建子类的对象，并启动线程
         */
        MyThread t1 = new MyThread();//创建子类的对象
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();//启动一个线程
        t2.start();//再启动第二个线程



    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        //
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "HelloWorld");
        }
    }
}