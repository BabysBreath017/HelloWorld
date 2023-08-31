package com.mtdream.tankgame2_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

// 为了监听 键盘事件，实现KeyListener
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;
    //定义敌人的坦克，放入vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    public MyPanel(){
        hero = new Hero(100, 100); // 初始化自己的坦克
        hero.setSpeed(10);
        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            // 创建一个敌人的坦克
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            //设置方向
            enemyTank.setDirect(2);
            // 加入
            enemyTanks.add(enemyTank);

        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认黑色

        // 画出坦克，利用封装方法
        drawTank(hero.getX(),hero.getY(),g, hero.getDirect(),1);//方向不再写死，可以更改
        // 画出敌人的坦克，遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g , enemyTank.getDirect(), 0);
            
        }
    }


    // 编写方法，画出坦克
    /**
     * x 坦克的左上角x坐标
     * y 坦克的左上角y坐标
     * direct 坦克方向（上下左右）
     * type 坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type){
        switch (type){
            case 0:// 敌人的坦克
                g.setColor(Color.green);
                break;
            case 1://我们的坦克
                g.setColor(Color.pink);
                break;

        }
        // 根据坦克的方向，来绘制对应形状坦克
        // direct 表示方向（0:向上 1:向右 2:向下 3:向左）
        switch (direct){
            case 0:// 向上
                g.fill3DRect(x, y, 10,60,false);//画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10,60,false);//画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20,40,false);//画出坦克身体
                g.fillOval(x + 10, y + 20, 20,20);//画出坦克圆盖子
                g.drawLine(x + 20, y + 30, x + 20, y); // 画出坦克的炮筒
                break;
            case 1:// 向右
                g.fill3DRect(x, y, 60,10,false);//画出坦克左边的轮子
                g.fill3DRect(x, y + 30, 60,10,false);//画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 40,20,false);//画出坦克身体
                g.fillOval(x + 20, y + 10, 20,20);//画出坦克圆盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20); // 画出坦克的炮筒
                break;
            case 2:// 向下
                g.fill3DRect(x, y, 10,60,false);//画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10,60,false);//画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20,40,false);//画出坦克身体
                g.fillOval(x + 10, y + 20, 20,20);//画出坦克圆盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60); // 画出坦克的炮筒
                break;
            case 3:// 向左
                g.fill3DRect(x, y, 60,10,false);//画出坦克左边的轮子
                g.fill3DRect(x, y + 30, 60,10,false);//画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 40,20,false);//画出坦克身体
                g.fillOval(x + 20, y + 10, 20,20);//画出坦克圆盖子
                g.drawLine(x + 30, y + 20, x, y + 20); // 画出坦克的炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    // 处理wsad键盘按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){
            //改变坦克的方向
            hero.setDirect(0);
            // 修改坦克的坐标
            hero.moveUp();

        }else if(e.getKeyCode() == KeyEvent.VK_D){
            hero.setDirect(1);
            hero.moveRight();

        }else if(e.getKeyCode() == KeyEvent.VK_S){
            hero.setDirect(2);
            hero.moveDown();

        }else if(e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
        // 让面板重绘
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
