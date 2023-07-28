public class MethodDetail02 {
    public static void main(String[] args) {
        A a = new A();
       // a.sayok();
        a.m1();
    }
}

class A {
    public void print(int n) {
        System.out.println("print()方法被调用 n=" + n);
    }

    public void sayok() {
        print(10);
        System.out.println("继续执行say0k()");
    }

    public void m1() {
        System.out.println("m1()方法被调用");
        B b = new B();
        b.hi();
        System.out.println("m1() 继续执行");
    }
}

class B {
    public void hi() {
        System.out.println("B类中的hi()被执行");
    }
}