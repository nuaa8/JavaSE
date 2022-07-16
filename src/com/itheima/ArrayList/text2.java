package com.itheima.ArrayList;

import java.util.ArrayList;

/*
    ArrayList常用方法:
        public boolean remove(Object o):删除指定的元素，返回删除是否成功
        public E remove(int index):删除指定索引处的元素
        public E set(int index,E element):修改指定索引处的元素
        public E get(int index):返回指定索引处的元素
        public int size():返回集合中的元素的个数
 */
public class text2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array=new ArrayList<String>();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        //1.public boolean remove(Object o):删除指定的元素，返回删除是否成功
//        System.out.println(array.remove("world"));
//        System.out.println(array.remove("javase"));//集合中没有该字符串，删除失败，原集和元素不变

        //2.public E remove(int index):删除指定索引处的元素
//        System.out.println(array.remove(1));
        //3.public E set(int index,E element):修改指定索引处的元素
//        System.out.println(array.set(1,"javaee"));
        //4.public E get(int index):返回指定索引处的元素
//        System.out.println(array.get(0));
        //5.public int size():返回集合中的元素的个数
        System.out.println(array.size());
        System.out.println("array:"+array);
    }
}
