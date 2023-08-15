package com.mtdream.try_;

public class TryCatchExercise03 {
}
class ExceptionExe01 {
    public static int method() {
        int i = 1;//i = 1
        try {
            i++;// i=2
            String[] names = new String[3];//String[]数组 没有赋值，相当于names 是 null
            if (names[1].equals("tom")) { //空指针
                System.out.println(names[1]);
            } else {
                names[3] = "dream";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;  // i = 3 => 保存临时变量 temp = 3；然后执行finally后，再return 刚刚保存的临时变量
        } finally {
            ++i; //i = 4 虽然最后执行finally，但是这里没有return
            System.out.println("i=" + i);// i = 4
        }
    }

    public static void main(String[] args) {
        System.out.println(method());// 3
    }
}