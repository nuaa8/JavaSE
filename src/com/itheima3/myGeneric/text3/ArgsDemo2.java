package com.itheima3.myGeneric.text3;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*
    Arrays工具类中有一个静态方法：
        public static <T> List<T> asList(T...a):返回由指定数组支持的固定大小的列表
        返回的集合不能做增删操作，可以做修改操作
    List接口中有一个静态方法：
        public static <E> List<E> of (E... elements）：返回包含任意数量元素的不可变列表
        返回的集合不能做增删改操作
    Set接口中有一个静态方法：
        public static <E> Set<E> of (E... elements):返回一个包含任意数量元素的不可变集合
        再给元素的时候，不能给重复的元素
        返回的集合不能做增删改操作，没有修改的方法

 */
public class ArgsDemo2 {
    public static void main(String[] args) {
        //public static <T> List<T> asList(T...a):返回由指定数组支持的固定大小的列表
//        List<String> list = Arrays.asList("hello", "world", "java");
////        list.add("javaee");//UnsupportedOperationException
////        list.remove("world");////UnsupportedOperationException
//        //以上两个操作都不支持，因为改变了数组的大小
//
//        list.set(1,"javaee");//允许操作
//        System.out.println(list);



        // public static <E> List<E> of (E... elements）：返回包含任意数量元素的不可变列表
//        List<String> list = List.of("hello", "world", "java");
//        list.add("javaee");//UnsupportedOperationException
//        list.remove("world");//UnsupportedOperationException
//        list.set(1,"javaee");//UnsupportedOperationException
//
//        System.out.println(list);


        //public static <E> Set<E> of (E... elements):返回一个包含任意数量元素的不可变集合
//        Set<String> list = Set.of("hello", "world", "java","world");//IllegalArgumentException,Set集合中不能有重复元素
        Set<String> set = Set.of("hello", "world", "java");
//        set.add("javaee");//UnsupportedOperationException
//        set.remove("world");//UnsupportedOperationException


        System.out.println(set);
    }
}