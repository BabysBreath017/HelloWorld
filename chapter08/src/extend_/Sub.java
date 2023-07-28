package extend_;

import extend_.Base;

public class Sub extends Base {

    public Sub(String name, int age){
        super("yyds");
        System.out.println("子类Sub(String name, int age )构造器被调用……");

    }
    public Sub() {
        //super();//默认调用父类的无参构造器
        super("smith",10);
        System.out.println("子类Sub()构造器被调用……");
    }
    public Sub(String name){
        super("Tom", 30);
        System.out.println("子类的Sub(String name)构造器被调用……");
    }


    public void sayok() {
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
//      test400();私有
        System.out.println("n4=" + getN4());
    }
}
