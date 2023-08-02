package com.mtdream.interface_.interface01;

public class Camera implements UsbInterface {//实现接口,就是把接口方法实现
//Camera 接入了UsbInterface，实现了UsbInterface的方法，即start()和stop(）方法
    @Override
    public void start() {
        System.out.println("相机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作....");
    }
}

