package com.mtdream.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        //1. 使用增强for, 在Collection集合
        //2. 增强for， 底层仍然是迭代器
        //3. 增强for可以理解成就是简化版本的 迭代器遍历
        //4. 快捷键方式:I/集合的名字+for(col.for+回车)

//        for (Object book : col) {
//            System.out.println("book=" + book);
//        }
        //o 其实就是一个第三方变量，记录在循环的过程中集合里的每一个数据
        for (Object o : col) {
            o = "qqq";//修改增强for中的变量，不会修改集合中的原本数据，只是修改了第三方里的数据
            System.out.println("book=" + o);
        }

        //增强for，也可以直接在数组使用
//        int[] nums = {1, 8, 10, 90};
//        for (int i : nums) {
//            System.out.println("i=" + i);
//        }

    }
}
