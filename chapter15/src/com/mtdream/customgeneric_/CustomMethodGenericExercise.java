package com.mtdream.customgeneric_;

public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        //T->String, R->Integer, M->Double
        Apple<String, Integer, Double>apple =new Apple<>();
        apple.fly(10);//10 会被自动装箱 Integer10, 输出Integer
        apple.fly(new Dog());//Dog

    }
}
class Apple<T, R, M>{
    public <E> void fly(E e){
        System.out.println(e.getClass().getSimpleName());
    }
    //public void eat(U u){} // 报错，因为U没有声明
    public void run(M m){}
}
class Dog{
}
