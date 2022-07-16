package com.itheima3.myCollection;

import java.util.ArrayList;
import java.util.Collection;

/*
    Collection集合常用方法:
        boolean add(E e):添加元素
        boolean remove(Object o):从集合中移除指定的元素
        void clear():清楚集合中的元素
        boolean contains(Object o):判断集合中是否存在指定的元素
        boolean isEmpty():判断集合是否为空
        int size():集合的长度，也就是集合中元素的个数

        ALt+7,打开一个窗口，能看到类的所有信息
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c=new ArrayList<String>();
        //boolean add(E e):添加元素
        //System.out.println(c.add("hello"));//添加元素，并返回true
        c.add("hello");
        c.add("world");
        c.add("java");
        //输出集合元素
        System.out.println(c);//[hello, world, java]

        //boolean remove(Object o):从集合中移除指定的元素
        System.out.println(c.remove("hello"));//true
        //输出集合元素
        System.out.println(c);

        //void clear():清楚集合中的元素
//        c.clear();

        //boolean contains(Object o):判断集合中是否存在指定的元素
        System.out.println(c.contains("world"));//true
        //输出集合元素
        System.out.println(c);

        //boolean isEmpty():判断集合是否为空
        System.out.println(c.isEmpty());
        //输出集合元素
        System.out.println(c);

        //int size():集合的长度，也就是集合中元素的个数
        System.out.println(c.size());
        //输出集合元素
        System.out.println(c);

    }
}
