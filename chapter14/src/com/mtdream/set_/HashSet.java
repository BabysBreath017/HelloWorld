package com.mtdream.set_;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {

        //1. 构造器走的源码
        /*
            public HashSet() {
                map = new HashMap<>();
            }
         2. HashSet 可以存放null ,但是只能有一个null,即元素不能重复
         */
        Set hashSet = new java.util.HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet=" + hashSet);
    }
}
