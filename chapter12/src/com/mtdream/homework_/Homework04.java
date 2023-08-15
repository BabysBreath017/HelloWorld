package com.mtdream.homework_;

public class Homework04 {
    public static void main(String[] args) {//main方法
    try {
        showExce();//1.抛出Exception，下面就不输出A了，直接去catch
        System.out.println("A");
    } catch (Exception e) {
        System.out.println("B");//2.输出B
    } finally {
        System.out.println("C");//3.finally是必须要执行的，输出C
    }
    System.out.println("D");//4.因为已处理过异常，程序不会退出，输出D
}

    public static void showExce() throws Exception {
        throw new Exception();
    }

}
