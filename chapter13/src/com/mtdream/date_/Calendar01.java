package com.mtdream.date_;

public class Calendar01 {
    public static void main(String[] args) {

        //1. Calendar是一个抽象类， 并且构造器是private
        //2. 可以通过 getInstance() 来获取实例
        //3. 提供大量的方法和字段提供给程序员
        //4. Calendar没有提供对应的格式化的类，因此需要程序员自己组合来输出(灵活)
        //5. 如果我们需要按照 24小时进制来获取时间， Calendar.HOUR ==改成=> Calendar.HOUR_OF_DAY
        java.util.Calendar c = java.util.Calendar.getInstance(); //创建日历类对象//比较简单，自由
        System.out.println("c=" + c);
        //2.获取日历对象的某个日历字段
        System.out.println("年：" + c.get(java.util.Calendar.YEAR));
        // 这里为什么要 + 1, 因为Calendar 返回月时候，是按照 0 开始编号
        System.out.println("月：" + (c.get(java.util.Calendar.MONTH) + 1));
        System.out.println("日：" + c.get(java.util.Calendar.DAY_OF_MONTH));
        System.out.println("小时：" + c.get(java.util.Calendar.HOUR));
        System.out.println("分钟：" + c.get(java.util.Calendar.MINUTE));
        System.out.println("秒：" + c.get(java.util.Calendar.SECOND));
        //Calender 没有专门的格式化方法，所以需要程序员自己来组合显示
        System.out.println(c.get(java.util.Calendar.YEAR) + "-" + (c.get(java.util.Calendar.MONTH) + 1) + "-" + c.get(java.util.Calendar.DAY_OF_MONTH) +
                " " + c.get(java.util.Calendar.HOUR_OF_DAY) + ":" + c.get(java.util.Calendar.MINUTE) + ":" + c.get(java.util.Calendar.SECOND) );

    }
}
