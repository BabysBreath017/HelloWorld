package com.mtdream.try_;

public class TryCatchExercise01 {
}
class Exception01 {
    public static int method() {
        try {
            String[] names = new String[3];//String[]数组 没有赋值，相当于names 是 null
            if (names[1].equals("tom")) {//NullPointerException 空指针异常
                System.out.println(names[1]);
            } else {
                names[3] = "dream";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {//所以在这里会被捕获到 空指针异常
            return 3;//虽然有return 3，但是它有个finally，finally是必须要执行的
        } finally { //必须执行
            return 4; //所以最后 返回4
        }
    }

    public static void main(String[] args) {
        System.out.println(method()); //4
    }
}

