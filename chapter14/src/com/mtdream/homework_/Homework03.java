package com.mtdream.homework_;

import java.util.*;

public class Homework03 {
    public static void main(String[] args){
        Map m = new HashMap();
        m.put("jack", 650);//自动装箱，int-->Integer
        m.put("tom", 1200);//自动装箱，int-->Integer
        m.put("smith", 2900);//自动装箱，int-->Integer
        System.out.println(m);

        // 将jack的工资修改成2600元
        m.put("jack", 2600);//对Map而言，新添加的数据已经有的K值，V值不一样就相当于把V值替换一下
        System.out.println(m);

        // 为所有员工加薪100
        Set keySet = m.keySet();
        for (Object key :keySet) {
            m.put(key, (Integer)m.get(key) + 100);
        }
        System.out.println(m);

        System.out.println("---------遍历-----------");
        //遍历EntrySet
        Set entrySet = m.entrySet();
        //迭代器
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("-------遍历所有的工资-----------");
        Collection values = m.values();
        for (Object value : values) {
            System.out.println("工资" + value);
            
        }

    }
}
