package com.itheima3.mySet;

import java.util.HashSet;
import java.util.Set;

/*
    Set集合特点
        不包括重复元素的集合
        没有带索引的方法，所以不能使用普通的for循环遍历（使用增强的for）
    HashSet:该类实现了Set接口由哈希表（实际为HashMap）支持，对集合的迭代顺序不作任何保证
 */
public class SetDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set=new HashSet<String>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        //不包括重复元素的集合
        set.add("hello");

        //遍历
        for(String s:set){
            System.out.println(s);
        }
    }
}
