package com.itheima3.mySet;

import java.util.HashSet;
import java.util.SplittableRandom;

/*
    HashSet练习：
        存储字符串并遍历
    HashSet集合特点
        1.底层数据结构是哈希表
        2.对集合的迭代顺序不作任何保证，即存储顺序和取出顺序不一致
        3.没有带索引的方法，所以不支持普通的for循环遍历
        4.由于是Set集合，所以不包含重复的集合元素

    HashSet集合存储元素：
        要保证元素的唯一性，需要重写HashCodeJ()和equals()
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs=new HashSet<String>();

        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");

        hs.add("hello");

        //遍历
        for(String s:hs){
            System.out.println(s);//存储顺序和取出顺序不一致
        }
    }
}
