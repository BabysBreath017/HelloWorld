package com.mtdream.generic_;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {
        // 1.给泛型指向数据类型时，要求是引用类型，不能是基本数据类型
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<int> list2 = new ArrayList<int>(); //错误

        // 2.因为E指定了A类型，构造器传入了 new A()
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        // 指定类型为A，传入B类型就会报错，如果class B extends A就可以
        // 在给泛型指定具体类型后，可以传入该类型或者其子类类型
        Pig<A> aPig2 = new Pig<A>(new B());
        aPig2.f();

        // 3.泛型的使用形式
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>();
        //在实际开发中更常用，简写
        //编译器会进行类型推断
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        List<Integer> list4 = new ArrayList<>();

        //4. 如果是这样写 泛型默认是 Object
        ArrayList arrayList = new ArrayList();//等价 ArrayList<Object> arrayList = new ArrayList<Object>();

        /*
            public boolean add(Object e) {
                ensureCapacityInternal(size + 1);  // Increments modCount!!
                elementData[size++] = e;
                return true;
            }
         */
        Tiger tiger = new Tiger();
        /*

            class Tiger {//类
                Object e;

                public Tiger() {}

                public Tiger(Object e) {
                    this.e = e;
                }
            }

         */

    }
}
class Tiger<E> {//类
    E e;

    public Tiger() {}

    public Tiger(E e) {
        this.e = e;
    }
}

class A {}
class B extends A {}

class Pig<E> {//
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass()); //运行类型
    }
}