package com.itheima.String;

import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line=sc.nextLine();
        String s=reverse(line);
        System.out.println("原字符串:"+line);
        System.out.println("反转后的字符串:"+s);
    }
    //定义一个方法，实现字符串反转
    public static String reverse(String s){
        String ss="";
        //字符串反转
        for(int i=s.length()-1;i>=0;i--){
            ss+=s.charAt(i);
        }
        return ss;
    }
}
