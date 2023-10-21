package com.mtdream.threaduse;

public class  ThreadDemo02 {
    public static void main(String[] args) {
        /*
        多线程的第二种启动方式：
            1.自己定义一个类实现Runnable接口
            2.重写里面run方法
            3.创建自己的类的对象
            4.创建一个Thread类的对象，并开启线程
         */

        //创建MyRun的对象，表示多线程要执行的任务
        MyRun myRun = new MyRun();

        // 创建线程对象
        Thread t1 = new Thread(myRun);
        Thread t2 = new Thread(myRun);

        // 给线程设置名字
        t1.setName("线程1");
        t2.setName("线程2");

        // 开启线程
        t1.start();
        t2.start();


    }
}
class MyRun implements Runnable{

    @Override
    public void run() {
        // 书写线程要执行的代码
        for (int i = 0; i < 100; i++) {

            // 这里不能直接调用getName方法，因为这个方法是在Thread当中的
            // 而第二种启动方式中MyRun跟Thread没有继承关系
            // 可以先获取到当前线程的对象
            // 哪条线程执行到此方法，返回的就是谁的对象
            Thread t = Thread.currentThread();
            // 获取到返回的对象后，就可以用对象来调用getName方法
            System.out.println(t.getName() + "HelloWorld");
            // 上面两行代码，也可以合并成下面一条语句
            //System.out.println(Thread.currentThread().getName() + "HelloWorld");
        }
    }
}
