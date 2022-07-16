/*
    需求：键盘录入一个字符串，统计字符串中大写字符个数、小写
    字符个数、数字字符个数（不考虑其他字符）
    思路;
        1.键盘录入一个字符串，用Scanner实现
        2.要统计三种类型的字符串个数，需要定义三个统计变量，初始值都为0
        3.遍历字符串，得到每一个字符
        4.判断该字符串属于哪种类型，然后对应类型的统计量+1
 */
package com.itheima.String;

import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.nextLine();
        int i=0;
        int j=0;
        int k=0;
        for(int m=0;m<str.length();m++){
            //可以这样写
            //char ch=str.charAt(m)
            //if(ch>='A'&&ch<='Z')
            //         i++;
            if(str.charAt(m)>='A'&&str.charAt(m)<='Z'){
                i++;
            }
            if(str.charAt(m)>='a'&&str.charAt(m)<='z'){
                j++;
            }
            if(str.charAt(m)>='0'&&str.charAt(m)<='9'){
                k++;
            }
        }
        System.out.println("字符串中大写字母个数:"+i);
        System.out.println("字符串中小写字母个数:"+j);
        System.out.println("字符串中数字字符个数:"+k);
    }
}

