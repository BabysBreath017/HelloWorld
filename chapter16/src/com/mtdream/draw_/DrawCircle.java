package com.mtdream.draw_;

import javax.swing.*;
import java.awt.*;

// 4.继承JFrame（Frame:框架），而JFrame就相当于一个画框，JFrame对应窗口
public class DrawCircle extends JFrame{
    // 5.定义一个面板（面板是要放在画框里的）
    private MyPanel mp = null;
    public static void main(String[] args) {
        // 7.创建一个对象实例
        new DrawCircle();
    }

    public DrawCircle(){ // 6.创建一个构造器
        // 初始化构造器（面板）
        mp = new MyPanel();
        // 把面板放入到窗口（JFrame画框）
        this.add(mp);
        // 设置窗口大小
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//当点击窗口的小X，程序就完全退出
        this.setVisible(true);//设置可以显示，可视
    }
}
// 1.定义一个MyPanel（Panel：就是画板的意思），继承JPanel类（java提供的一个类），后面画图形，就在画板上
class MyPanel extends JPanel{

    // 2.重写构造器
    // paint(Graphics g)绘制组件外观
    // paint:（油漆），代表绘图方法；
    // Graphics（绘图） g：把 g 理解成一支画笔
    // Graphics提供了很多绘图方法，比如drawOval(int x, int y, int width, int height)
    //(要绘制的椭圆形的左上角x坐标，左上角y坐标，要绘制的椭圆形宽度，高度)
    @Override
    public void paint(Graphics g) {
        super.paint(g); //调用父类的方法完成初始化
        System.out.println("paint方法被调用。。。");
        // 3.画一个圆形
        g.drawOval(10,10,100,100);
        /*
          paint的方法如何被调用
            1.当组件第一次在屏幕显示时候，程序会自动调用paint()方法来绘制组件
            2.窗口最小化，然后最大化的时候
            3.窗口大小发生变化时，paint方法会不停的被调用，重绘窗口大小
            4.repaint方法被调用
         */

        // 演示绘制不同的图形..
        // 1.画直线 drawLine(int x1,int y1,int x2,int y2)
        //g.drawLine(10, 100, 100, 100);

        // 2.画矩形边框 drawRect(int x, int y, int width, int height)
        //g.drawRect(10, 10, 100, 100);

        // 3.画椭圆边框 drawOval(int x, int y, int width, int height)

        // 4.填充矩形 fillRect(int x, int y, int width, int height)
        // 先设置画笔的颜色
        //g.setColor(Color.blue);
        //g.fillRect(10, 10, 100, 100);

        // 5.填充椭圆 fillOval(int x, int y, int width, int height)
        //g.setColor(Color.PINK);
        //g.fillOval(10, 10, 100, 100);

        // 6.画图片 drawImage(Image img, int x, int y, ..)
        // 获取图片资源:把图片复制，到根目录out->chapter16粘贴
        // Toolkit.getDefaultToolkit().getImage 是固定写法
        // 斜杠+图片名： /bg.png 表示在该项目的根目录去获取 bg.png 图片资源
        // 图片的宽度和高度最好按照图片实际来写，否则会变形

//        Image image = null;
//        try{
//            URL url = MyPanel.class.getResource("/bg.png");
//            System.out.println(url);
//            image = Toolkit.getDefaultToolkit().getImage(url);
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }

        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bg.png"));
        g.drawImage(image, 10, 10, 175, 221, this);

        // 7.画字符串 drawString(String str, int x, int y)//写字
        // a.给画笔设置颜色和字体
        //g.setColor(Color.red);
        //g.setFont(new Font("隶书", Font.BOLD, 50));
        // b.这里设置的 100， 100， 是 "北京你好"左下角
        //g.drawString("北京你好", 100, 100);

        // 设置画笔的字体 setFont(Font font)
        // 设置画笔的颜色 setColor(Color c)

    }
}