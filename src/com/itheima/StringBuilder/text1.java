/*
    1.StringBuilder是一个可变的字符串类，我们可以把它看成是一个容器，这里的可变
    指的是StingBuilder对象中的内容是可变的。
            String和StingBuilder的区别：
                1.String：内容是不可变的
                2.StringBuilder：内容是可变的
    2.StringBuilder构造方法：
        public StringBuilder():创建一个空白字符串对象，不含任何内容
        public StringBuilder(String str):根据字符串的内容，来创建可变字符串对象
 */
package com.itheima.StringBuilder;

public class text1 {
    public static void main(String[] args) {
        //创建一个空白可变字符串，不含任何内容
        StringBuilder sb=new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println("sb.length():"+sb.length());
        //根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2=new StringBuilder("Helo");
        System.out.println("sb2:"+sb2);
        System.out.println("sb2.length():"+sb2.length());
    }
}
