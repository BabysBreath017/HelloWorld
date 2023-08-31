package com.mtdream.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
        // 使用默认的构造器创建TreeMap，还是无序的（也没有排序）
        //TreeMap treeMap = new TreeMap();

        // TreeMap除了无参构造器外，
        // 还有一个有参构造器，传入了实现了Comparator接口的一个匿名内部类TreeMap(Comparator<?super k>)
        //在这个匿名内部类中可以指定添加键值对的排序规则
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //要求：按照传入的k（string）的大小进行排序
                //return((String) o1).compareTo((String) o2);
                //要求：按照传入的k（string）的长度进行排序
                return((String) o1).length() - ((String) o2).length();

            }
        });
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯提诺");
        treeMap.put("smith", "斯密斯");
        treeMap.put("john", "约翰");//长度跟 jack一样，john是加入不了

        System.out.println("treeMap =" + treeMap);
    }
}
