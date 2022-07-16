package com.itheima.ArrayList;
/*
    ArrayList构造方法：
        public ArrayList():创建一个空对象

    ArrayList添加方法：
        public boolean add(E e):将指定的元素追加到此集合的末尾
        public void add(int index,E element):在此集合中的指定位置插入指定的元素
 */

import java.util.ArrayList;

public class text1 {
    public static void main(String[] args) {
        // public ArrayList():创建一个空对象
        ArrayList<String> array=new ArrayList<String>();
//        ArrayList<String> array1=new ArrayList<>();
        //public boolean add(E e):将指定的元素追加到此集合的末尾
        System.out.println(array.add("hello"));
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println("array:"+array);
        System.out.println("--------");
        //  public void add(int index,E element):在此集合中的指定位置插入指定的元素
        array.add(1,"javase");
        System.out.println("array:"+array);
        System.out.println("--------");

        ArrayList<String> array1=new ArrayList<>();
        array1.add("javaweb");
        System.out.println(array1);
    }
}
