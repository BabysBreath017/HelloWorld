package com.objectPoly_;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.cry(); //运行时，执行到此时，animal运行类型是Dog，所以cry就是Dog的cry
        animal = new Cat();
        animal.cry();
    }
}
