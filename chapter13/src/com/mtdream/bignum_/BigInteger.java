package com.mtdream.bignum_;

public class BigInteger {
    public static void main(String[] args) {

        //当我们编程中，需要处理很大的整数，long 不够用
        //可以使用BigInteger的类来搞定
//        long l = 23788888899999999999999999999l;
//        System.out.println("l=" + l);

        java.math.BigInteger bigInteger = new java.math.BigInteger("23788888899999999999999999999");
        java.math.BigInteger bigInteger2 = new java.math.BigInteger("10099999999999999999999999999999999999999999999999999999999999999999999999999999999");
        System.out.println(bigInteger);
        //1. 在对 BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接进行 + - * /
        //2. 可以创建一个 要操作的 BigInteger 然后进行相应操作
        java.math.BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);//
        java.math.BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);//减
        java.math.BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply);//乘
        java.math.BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);//除


    }
}
