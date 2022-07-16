package com.itheima2.Base1;

import java.util.Scanner;

/*
    基本类型包装类
        基本类型直接使用类名进行引用，即静态方法
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //需求：我要判断一个数据是否在int范围内？
//        public static final int MAX_VALUE：   持有最大值的常数为 int可以为2 31 -1。
//        public static final int MIN_VALUE： 持有最小值的常数为 int可以为-2 31 。
        System.out.println(Integer.MIN_VALUE);//静态方法
        System.out.println(Integer.MAX_VALUE);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数：");
        long line = sc.nextInt();
        if(line>=Integer.MIN_VALUE&&line<=Integer.MAX_VALUE)
            System.out.println(line+"在范围内");
        else
            System.out.println(line+"不再范围内");
    }
}
