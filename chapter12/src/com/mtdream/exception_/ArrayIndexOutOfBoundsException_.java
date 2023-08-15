package com.mtdream.exception_;

public class ArrayIndexOutOfBoundsException_ {//数组下标越界异常
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        for (int i = 0; i <= arr.length; i++) {//数组下标只有0，1，2，arr.length=3，遍历到3就会报错
            System.out.println(arr[i]);
        }
    }
}
