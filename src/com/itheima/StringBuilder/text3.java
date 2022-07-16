package com.itheima.StringBuilder;
/*
       StringBuilder转换为String
            public String toString（）：通过toString（）把StringBuilder转换为String
       String转换为StringBuilder
            public StringBuilder(String s):通过构造方法实现把String转换为StringBuilder
 */
public class text3 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
//      1.StringBuilder转换为String
//      public String toString（）：通过toString（）把StringBuilder转换为String
        sb.append("hello");
        //String s=sb; //这是一个错误的做法
        String  s=sb.toString();
        System.out.println("s:"+s);

//      public StringBuilder(String s):通过构造方法实现把String转换为StringBuilder
        String s1="hello world";
        StringBuilder sb1=new StringBuilder(s1);
        System.out.println("sb1:"+sb1);
    }
}
