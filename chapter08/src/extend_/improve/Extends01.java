package extend_.improve;

import extend_.Graduate;
import extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 14;
        pupil.testing();
        pupil.setScore(100);
        pupil.showInfo();
        System.out.println("-----------------------------");
        extend_.Graduate graduate = new Graduate();
        graduate.name = "张三";
        graduate.age = 25;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
