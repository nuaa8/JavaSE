package com.itheima3.mySet.HashSet;

import java.util.HashSet;

/**
 * HashSet集合特点
 *         1.底层数据结构是哈希表
 *         2.对集合的迭代顺序不作任何保证，也就说不保证存储和取出的元素顺序一致
 *         3.没有带索引的方法，所以不能使用普通for循环遍历
 *         4.由于是Set集合，所以是不包含重复元素的集合
 *
 *     需求：
 *         创建一个存储学生对象的集合，存储3个学生对象，实用程序实现在控制台遍历该集合
 *         要求：学生对象的成员变量值相同，我们就认为是同一个对象(即使用HashSet集合)
 *     思路：
 *         1.定义学生类
 *         2.创建HashSet集合对象
 *         3.创建学生对象
 *         4.把学生添加到集合
 *         5.遍历集合（增强for）
 *
 *
 *         6.在类中重写2个方法（即HashCode()和equals()）
 */

public class HashSetDemo3 {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<Student> hs=new HashSet<>();

        //创建学生对象
        Student s1=new Student("林青霞",30);
        Student s2=new Student("张曼玉",35);
        Student s3=new Student("王祖贤",33);

        Student s4=new Student("王祖贤",33);//为了保证学生对象的唯一性，重写HashCode和equals(即Student类中最后几行代码)，不然，会出现2个重名

        //把学生添加到集合中
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        System.out.println(hs);

        //遍历集合（增强for）
        for (Student s:hs){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
