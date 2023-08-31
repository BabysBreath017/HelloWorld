package com.mtdream.string_;

public class String02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b);//false ,基本数据类型比较的是数据值

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true ,基本数据类型比较的是数据值

        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);//false, 引用数据类型比较的是地址值

        String s5 = new String("abc");// 记录的是在 堆里面的地址值
        String s6 = "abc";// 记录的是在 常量池的地址值
        System.out.println(s5 == s6);//false

        String s7 = new String("abc");
        String s8 = "ABC";

        //如果要比较字符串对象中的内容是否相同，可以用equals
        boolean result1 = s7.equals(s8);
        System.out.println(result1);//false ,内容不一样

        //如果要比较字符串对象中的内容是否相同，忽略大小写可以用equals，可以用equalsIgnoreCase
        //忽略大小写只能是英文状态下的，中文的不行（1，一，壹）
        boolean result2 = s7.equalsIgnoreCase(s8);
        System.out.println(result2);//


    }
}
