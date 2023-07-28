package extend_.ExtendsExercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        C c = new C();
    }
}
class A {
    public A(){//第四步调用父类object，不返回东西
        System.out.println("我是A类");//第5步输出
    }
}
class B extends A{
    public B(){
        System.out.println("我是B类的无参构造");
    }
    public B(String name){
        //super();//第三步先调用默认super构造器，没有写super()或者this，都会有个默认的super构造器
        System.out.println(name + "我是B类的有参构造");//第6步返回来之后输出这句话
    }
}
class C extends B{
    public C(){
        this("hello");//第一步从这里开始，然后找到public C(String name)
        System.out.println("我是C类的无参构造");//第8步

    }
    public C(String name){
        super("hahaha");//第二步到达这后会去父类的有参构造
        System.out.println("我是C类的有参构造");//第7步
    }

}