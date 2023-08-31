package com.mtdream.draw_;

import java.io.*;

public class IOTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(new FileInputStream("./myfile"));
        int len = 0;
        char[] arr = new char[1024];
        while((len = ir.read(arr)) != -1){
            System.out.println(new String(arr,0,len));
        }
        ir.close();
    }
}
