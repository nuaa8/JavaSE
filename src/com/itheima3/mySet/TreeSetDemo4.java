package com.itheima3.mySet;

import java.util.TreeSet;

/*
    TreeSet集合练习
        存储整数遍历（用整数类）
    TreeSet集合特点
        1.元素有序，这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序，具体
        排序取决于构造函数
            TreeSet():根据其元素的自然排序进行排序
            TreeSet(Comparator comparator):根据指定的元素进行排序
        2.没有带索引的方法，所以不支持普通for循环遍历
        3.Set集合，不包含重复元素
 */
public class TreeSetDemo4 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> ts=new TreeSet<Integer>();
        TreeSet<String> ts1=new TreeSet<>();

        //添加元素
        ts.add(10);//自动装箱
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);

        ts1.add("hello");
        ts1.add("world");
        ts1.add("java");
        ts1.add("welcome anhui university");
        ts1.add("anhui");


        //遍历集合
        for(Integer i:ts){
            System.out.println(i);//自然排序即从小到大
        }
        System.out.println("--------");

        for (String s:ts1){
            System.out.println(s);
        }
    }
}
