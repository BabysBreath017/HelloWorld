package com.mtdream.strinngbuilder_;

public class StringBuilder02 {
    public static void main(String[] args){

        // 1.创建对象
        StringBuilder sb = new StringBuilder();

        // 2.添加字符串
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        System.out.println(sb);

        // 3.再把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
