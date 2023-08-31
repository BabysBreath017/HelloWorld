package com.mtdream.set_;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);// 第二个456没有添加成功，因为它是不重复的
        set.add(new Customer("劉", 1001));
        set.add(123);
        set.add("dream");

        System.out.println("set =" + set);
        // 1.LinkedHashSet是有序，输出元素/数据的顺序和 添加的是一样的
        // 2.LinkedHashSet 底层维护的是一个LinkedHashMap（是HashMap的子类）
        // 3.LinkedHashSet 底层结构（数组table+ 双向链表）
        // 4.第一次添加时，直接将数组table 扩容到16，存放结点的类型不再是Node，而是LinkedHash$Entry
        // 5.数组HashMap$Node[]存放的元素/数据是LinkedHash$Entry类型
        /*
                // Entry继承了Node，继承关系是在内部类完成. Entry类型能实现双向链表功能
                static class Entry<K,V> extends HashMap.Node<K,V> {
                    Entry<K,V> before, after;
                    Entry(int hash, K key, V value, Node<K,V> next) {
                        super(hash, key, value, next);
                    }
                }

         */
        //set =[AA, 456, com.mtdream.set_.Customer@a09ee92, 123, dream]
        // 其中Customer没有重写toString方法，所以默认打印的是它的Hashcode值
    }
}
class Customer{
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }
}