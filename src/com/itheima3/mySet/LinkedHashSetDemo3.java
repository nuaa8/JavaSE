package com.itheima3.mySet;

import java.util.LinkedHashSet;

/**
    LinkedHashSet集合特点
        1.哈希表和链表实现的Set接口，具有可预测的迭代次序
        2.由链表保证元素有序，即元素的存储和取出顺序一致
        3.由哈希表保证元素唯一，即没有重复的元素
 */
public class LinkedHashSetDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();

        //添加元素
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");

        linkedHashSet.add("hello");

        //遍历集合
        for(String s:linkedHashSet){
            System.out.println(s);
        }
    }
}
