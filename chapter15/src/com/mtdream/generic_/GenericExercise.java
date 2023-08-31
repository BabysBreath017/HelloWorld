package com.mtdream.generic_;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        // 使用范型方式给HashSet 添加3个学生对象
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack",25));
        students.add(new Student("tom",20));
        students.add(new Student("mary",34));

        // 遍历
        for (Student student : students) {
            System.out.println(student);
        }

        // 使用范型方式给HashSet 添加3个学生对象
        HashMap<String, Student> hm = new HashMap<>();
        hm.put("milan",new Student("milan",35));
        hm.put("smith",new Student("smith",48));
        hm.put("john",new Student("john",28));

        System.out.println("------------------------");
        //迭代器 EntrySet
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }

    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
