package com.mtdream.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //集合一般分两类：单列集合Collection 和 双列集合Map
        //单列集合：添加数据时，每次只能就添加一个元素，脉动/康师傅
        //双列集合：每次可以添加一对数据，脉动 5元/康师傅 3元

        //单列集合Collection（父类）:List系列集合（子类）和 Set系列集合（子类）（Collection/List/Set都是接口）
        //List系列：ArrayList/LinkedList/Vector（这三个都是List系列下面的实现类）
        //         添加的元素是有序，可重复，有索引
        //Set系列：HashSet/TreeSet，HashSet下面又有LinkedHashSet（Set系列下面的都是实现类）
        //         添加的元素是无序，不可重复，无索引


        //1.Collection是一个接口，不能直接创建对象，只能创建它的实现类的对象，比如：ArrayList
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.迭代器的3个方法
        // a.获取迭代器对象
        //迭代器就好比是一个箭头，默认指向集合的0索引处
        //迭代器在遍历集合时不依赖索引，它是通过创建指针并移动指针来获取元素
        Iterator<String> it = coll.iterator();

        //3.利用循环不断的去获取集合中的每一个元素
        while (it.hasNext()){//b.判断当前指向的位置是否有元素
            String str = it.next();//c.获取元素，并移动指针

            //迭代器遍历时，不能用集合的方法进行增加或者删除
            // 如果要删除，可以用迭代器的remove()方法，但是要添加暂时没有办法
            if("bbb".equals(str)){
                it.remove();
            }

            System.out.println(str);
        }

        //迭代器遍历完毕，指针不会复位，如果还想再遍历一次，就要重新获取一次迭代器对象
        Iterator<String> it2 = coll.iterator();





    }
}
