package com.mtdream.tankgame_;

import javax.swing.*;

public class DTankGame01 extends JFrame {
    // 定义一个panel
    MyPanel mp = null;
    public static void main(String[] args) {
        DTankGame01 dTankGame01 = new DTankGame01();
    }
    private DTankGame01(){

        mp = new MyPanel();
        this.add(mp);//把面板放入到窗口（就是游戏的绘图区域）

        this.setSize(1000,750); //设置窗口
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
        this.setVisible(true);//可视
    }
}
