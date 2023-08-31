package com.mtdream.strinngbuilder_;

public class StringBuilder01 {
    public static void main(String[] args) {

        // 1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        // 2.添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        // 3.反转
        sb.reverse();

        // 4.获取长度
        int len = sb.length();

        // 打印
        // 提示：因为StringBuilder是java已经写好的类，java底层对它做了一些特殊处理
        // 打印对象不是地址值而是 属性值
        System.out.println(sb);
    }
}
