package com.itheima3.myList.LinkedList;

import java.util.LinkedList;

/*

    LinkedList集合的特有功能：
        public void addFirst(E e):在该列表开头插入指定的元素
        public void addLast(E e):将指定的元素追加到此列表的末尾

        public E getFirst():返回此列表的第一个元素
        public E getLast():返回此列表的最后一个元素

        public E removeFirst():从列表中删除并返回第一个元素
        public E removeLast():从列表中删除并返回最后一个元素
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建集合对象
        LinkedList<String> likedList=new LinkedList<String>();

        likedList.add("hello");
        likedList.add("world");
        likedList.add("java");

//        public void addFirst(E e):在该列表开头插入指定的元素
//        public void addLast(E e):将指定的元素追加到此列表的末尾
        likedList.addFirst("javase");
        likedList.addLast("javaee");

//        public E getFirst():返回此列表的第一个元素
//        public E getLast():返回此列表的最后一个元素
        System.out.println(likedList.getFirst());
        System.out.println(likedList.getLast());


//        public E removeFirst():从列表中删除并返回第一个元素
//        public E removeLast():从列表中删除并返回最后一个元素
        System.out.println(likedList.removeFirst());//javase
        System.out.println(likedList.removeLast());//javaee


        System.out.println(likedList);

    }
}
