package com.itheima3.myCollection;
/*
   1.Collection集合概述
        1.1是单例集合的顶层设计，它表示一组对象，这些对象也称为collection的元素
        1.2JDK不提供此接口的任何直接实现，它提供更具体的子接口（如Set和List）实现（非常重要）
   2. 创建collection集合的对象
        1.多态的方式
        2.具体的实现类ArrayList()
 */
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c=new ArrayList<String>();//多态的方式
        Collection<String> c1=new ArrayList<>();

        //添加元素：boolean add(E e)
        c.add("hello");
        c.add("world");
        c.add("java");
        c.remove("java");

        c1.add("hello world");
        System.out.println(c.contains("java"));
        //输出集合对象
        System.out.println(c);
        System.out.println(c1);
    }
}
