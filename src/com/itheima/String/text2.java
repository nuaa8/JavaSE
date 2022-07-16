/*
    需求:键盘录入一个字符串，使用程序实现在控制台遍历该字符串
    思路:
        1.键盘录入一个字符串，用Scanner实现
        2.遍历字符串，首先要能够获取到字符串中的每一个字符
            public char charAt(int index):返回指定索引处的char值，字符串的索引也是从0开始
            其次要获取字符串的长度，用public int length():返回字符串的长度
            数组的长度：数组名.length
            字符串的长度:字符串对象.length（）


 */
package com.itheima.String;

import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line=sc.nextLine();
        //遍历字符串，首先要能够获取到字符串中的每一个字符
//        System.out.println(line.charAt(0));
//        System.out.println(line.charAt(1));
//        System.out.println(line.charAt(2));
          //不够好
//        for(int i=0;i<3;i++){
//            System.out.println(line.charAt(i));
//        }
          //其次要获取字符串的长度
//        System.out.println(line.length());
        for (int i=0;i<line.length();i++){
            System.out.println(line.charAt(i));
        }
    }
}


