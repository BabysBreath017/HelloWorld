package com.mtdream.abstract_.template;

import com.mtdream.abstract_.template.AA;
import com.mtdream.abstract_.template.BB;

public class TestTemplate {
    public static void main(String[] args) {

        AA aa = new AA();
        aa.calculateTime(); //这里还是需要有良好的OOP基础，对多态

        BB bb = new BB();
        bb.calculateTime();
    }
}