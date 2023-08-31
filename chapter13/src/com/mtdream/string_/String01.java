package com.mtdream.string_;

public class String01 {
    public static void main(String[] args) {
        // 1.使用直接赋值的方式取得一个字符串对象
        String s1 = "abc";
        String s6 = "abc";// 当使用双引号直接赋值时，系统会检查该字符串在常量池是否存在
        //不存在：创建一个新的字符串。存在：复用之前的字符串，并把它的引用地址复制一份给新的变量
        System.out.println(s1);

        // 2.使用new的方式获取一个字符串对象
        // 空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        // 传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        // 掌握：传递一个字符数组，根据字符数组的内容在创建一个新的字符串对象
        // 需求：要求能修改字符串的内容 abc qbc
        // abc --> {'a','b','c'} --> {'q','b','c'} -->"qbc"
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        //只要是new出来的，就会在堆内存开辟一个新的空间，将“abc”保存在空间里，并把它的地址赋给s4
        String s7 = new String(chs);
        //这个也会开辟一个新的空间，保存“abc”，它的地址和s4不是同一个
        System.out.println(s4);

        // 掌握：传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        // 应用场景：以后在网络当中传输的数据其实都是字节信息
        // 我们一般要把字节信息进行转换，转成字符串，此时就要用到这个构造了。
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
