package com.mtdream.exception_;

public class NumberFormatException_ {//数字格式不正确异常
    public static void main(String[] args) {
        String name = "dream";
        //将String 转成 int
        int num = Integer.parseInt(name);//抛出NumberFormatException
        System.out.println(num);//1234
    }
}
