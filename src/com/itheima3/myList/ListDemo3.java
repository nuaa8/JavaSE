package com.itheima3.myList;

import java.util.ArrayList;
import java.util.LinkedList;

/*
    List集合常用子类：ArrayList,LinkedList
        ArrayList:底层数据结构是数组，查询快，增删慢
        LinkedList:底层数据结构是链表，查询慢，增删快
    练习：
        分别使用ArrayList和LinkedList完成存储字符串并遍历

 */
public class ListDemo3 {
    public static void main(String[] args) {
        //ArrayList，创建集合对象
        ArrayList<String> array=new ArrayList<String >();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历（一共三种遍历，这只是其中一种）
        for(String s:array){
            System.out.println(s);
        }
        System.out.println("-------");

        //遍历方式2
        for (int i=0;i<array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("--------");


        //LinkedList,创建集合对象
        LinkedList<String> linkedList=new LinkedList<String>();
        //添加元素
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        //遍历
        for(String s1:linkedList){
            System.out.println(s1);
        }
    }
}
