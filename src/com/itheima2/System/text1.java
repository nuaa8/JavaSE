package com.itheima2.System;

import java.util.stream.StreamSupport;

/*
    System类的常用方法
 */
public class text1 {
    public static void main(String[] args) {
//        System.out.println("开始");
//        //public static void exit(int status):终止当前运行的Java虚拟机，非零表示异常
//        System.exit(0);
//        System.out.println("结束·");

//        public static long currentTimeMillis(): 返回当前时间（以毫秒为单位）
//        System.out.println(System.currentTimeMillis());
//        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365+"年");
//

        long start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            System.out.println(i);
        }
        long end= System.currentTimeMillis();
        System.out.println("共耗时:"+(end-start)+"毫秒");
    }
}
