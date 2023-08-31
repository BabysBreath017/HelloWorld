package com.mtdream.wrapper_;

public class Integer01 {
    public static void main(String[] args) {
        //基本数据类型 转换 引用类型-包装类
        // String --> int
        int i = Integer01.parseInt("100");
        System.out.println(i + 1);

        // int --> String
        String s = i + "";
        System.out.println(s + 1);

        // int --> Integer
        // 自动装箱
        Integer x  = 1000;

        // Integer --> int
        // 自动拆箱
        int y = x;

        // String --> Integer
        Integer k = Integer.valueOf("123");

        // Integer --> String
        String e = String.valueOf(k);
    }

    private static int parseInt(String number) {
        return 0;
    }
}
