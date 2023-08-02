package com.mtdream.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wuKong = new LittleMonkey("悟空");
        wuKong.climbing();
        wuKong.swimming();
        wuKong.flying();
    }
}

//猴子
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + " 会爬树...");
    }

    public String getName() {
        return name;
    }
}

//接口
//接口和继承解决的问题不同
//接口比继承更加灵活，继承是要满足 is-a的关系，接口只需满足like-a的关系
interface Fishable {
    void swimming();
}

interface Birdable {
    void flying();
}

//继承
//小结:  当子类继承了父类，就自动的拥有父类的功能
//      如果子类需要扩展功能，可以通过实现接口的方式扩展.
//      可以理解 实现接口 是 对java 单继承机制的一种补充.
class LittleMonkey extends Monkey implements Fishable, Birdable {
    //要实现多个接口可以这样的形式  implements接口XX,接口XX

    public LittleMonkey(String name) {

        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " 通过学习，可以像鱼儿一样游泳...");
    }

    @Override
    public void flying() {
        System.out.println(getName() + " 通过学习，可以像鸟儿一样飞翔...");
    }
}
