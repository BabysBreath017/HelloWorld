package com.mtdream;

public class CpuNum {
    public static void main(String[] args) {

        // 1.并发：同一时刻有多个指令在单个cpu上交替执行
        // 2.并行：同一时刻有多个指令在多个CPU上同时执行
        Runtime runtime = Runtime.getRuntime();
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前cpu个数=" + cpuNums);
    }
}
