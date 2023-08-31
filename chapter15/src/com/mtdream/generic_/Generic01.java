package com.mtdream.generic_;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
        /*
        请编写程序，在ArrayList 中，添加3个Dog对象
        Dog对象含有name 和 age, 并输出name 和 age (要求使用getXxx())
        */
            //使用传统的方法来解决
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Dog("旺财", 10));
            arrayList.add(new Dog("发财", 1));
            arrayList.add(new Dog("小黄", 5));

            //假如我们的程序员，不小心，添加了一只猫，编译也不会报错
            arrayList.add(new Cat("招财猫", 8));

            //遍历
            for (Object o : arrayList) {
                // 不使用泛型，Dog在加入时是Object类型，在取出时，要转成Dog，效率比较低
                // 向下转型Object ->Dog
                Dog dog = (Dog) o;
                System.out.println(dog.getName() + "-" + dog.getAge());
            }

        }
    }

    class Dog {
        private String name;
        private int age;
        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    class Cat { //Cat类
        private String name;
        private int age;
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
