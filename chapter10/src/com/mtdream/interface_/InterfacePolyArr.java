package com.mtdream.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {

        // 多态数组--> 接口类型数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();//Phone_和Camera_实现了接口

        /*
        1，给Usb数组中，存放 Phone  和  相机对象，Phone类还有一个特有的方法call（），
        2，请遍历Usb数组，如果是Phone对象，除了调用Usb 接口定义的方法外，
        3，还需要调用Phone 特有方法 call
         */
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();//动态 绑定
            //调用Phone_ 特有方法 call()
            //如果用 usbs[i].call() 这种方法调用有危险
            //调用第一个对象Phone_的时候确实有call方法，调用第二个Camera的时候它没有call方法；
            //所以要一个类型判断，类型向下转型
            if(usbs[i] instanceof Phone_){//判断它的运行类型是 Phone_
                ((Phone_) usbs[i]).call();//快捷键：usbs[i]. 选择call()，即usbs[i]调用call()
            }
        }
    }
}

interface Usb {
    void work();
}

class Phone_ implements Usb {
    public void call() {
        System.out.println("手机可以打电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作中。。。");
    }
}

class Camera_ implements Usb {
    @Override
    public void work() {
        System.out.println("相机工作中。。。");
    }
}