package com.mtdream.tankgame2_;

import javax.swing.*;

public class DTankGame02 extends JFrame {
    // 定义一个panel
    MyPanel mp = null;
    public static void main(String[] args) {
        DTankGame02 dTankGame01 = new DTankGame02();
    }
    private DTankGame02(){

        mp = new MyPanel();
        this.add(mp);//把面板放入到窗口（就是游戏的绘图区域）

        this.setSize(1000,750); //设置窗口
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
        this.setVisible(true);//可视
    }
}
