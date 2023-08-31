package com.mtdream.customgeneric_;

public class CustomGeneric {
    public static void main(String[] args) {

    }
}
//1. Tiger后面有泛型，所以把Tiger称为自定义泛型类
//2. T, R, M 是泛型的标识符，一般是单个大写字母
//3. 泛型的标识符可以有多个
//4. 普通成员可以使用泛型（属性，方法）
//5. 使用泛型的数组，不能初始化
//6. 静态方法不能使用泛型，
class Tiger<T, R, M>{

    String name;
    R r;//R表示泛型， r 表示属性，属性使用到泛型
    T t;
    M m;

    T[] ts;//可以定义一个数组，但不能初始化
    //因为数组在new的时候不能确定T的类型，就无法在内存开辟空间
    //T[] ts = new T[8];
    public Tiger(String name, R r, T t, M m) {//构造器使用泛型的
        this.name = name;
        this.r = r;
        this.t = t;
        this.m = m;
    }

    //静态方法不能使用泛型
    //因为静态是和类相关的，在类加载时，对象还没有创建，而泛型是在类创建/定义的时候才会指定的
    //所以，如果静态方法和静态属性使用了泛型，JVM就无法完成初始化，因为它不知道是什么类型
    //这是个顺序问题
    //static R r2;
    //public static void m1(M m);


    //方法使用到泛型
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {//方法使用到泛型
        this.r = r;
    }

    public T getT() {//返回类型可以使用到泛型
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
