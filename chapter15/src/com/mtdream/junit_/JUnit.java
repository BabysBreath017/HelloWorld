package com.mtdream.junit_;

import org.junit.jupiter.api.Test;

public class JUnit {
    public static void main(String[] args) {

        // 传统方式，测试/运行一个方法，需要new一个对象才能调用不方便效率低
        new JUnit().m1();
        // 要调用m2方法，也还要再new一个对象
        new JUnit().m2();
    }

    // 在方法上面加个@Test，然后引入一个JUnit5.4 to classpath
    // 直接点击旁边绿色小箭头就可以测试，不需要new一个对象
    // JUnit是一个Java语言的单元测试框架
    // 多数Java的开发环境都已经集成了JUnit作为单元测试的工具

    @Test
    public void m1() {
        System.out.println("m1方法被调用");
    }
    @Test
    public void m2() {
        System.out.println("m2方法被调用");
    }
}
