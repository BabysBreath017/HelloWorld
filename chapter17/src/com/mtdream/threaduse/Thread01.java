package com.mtdream.threaduse;

public class Thread01 {
    public static void main(String[] args) {
        // 5.创建Cat对象，可以当作线程使用
        Cat cat = new Cat();
        cat.start();// 启动线程
    }
}


// run方法是从哪来的 Thread 类实现了 Runnable接口的run方法
/*源码
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
 */
// 1.当一个类继承了Thread类，该类就可以当作线程使用
class Cat extends Thread{

    @Override
    public void run() {// 2.重写run方法，写上自己的业务代码

        int times = 0; // 7.定义一个变量，统计输出次数
        while (true) { // 6.无限循环，让它不停输出

            // 3.该线程每隔1秒在控制台输出"喵喵，我是小猫咪"
            System.out.println("喵喵，我是小猫咪" + (++times));

            // 4.让该线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 8){
                break; // 8.当times到8，退出while，这是线程也退出
            }
        }
    }
}