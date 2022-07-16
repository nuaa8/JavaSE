package com.itheima3.mySet.TreeSet;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
//        return 0;//默认重复元素，不添加
//        return 1;//默认升序
//        return -1;//默认降序，即倒着输出

        //按照年龄从小到大排序
        int num=this.age-s.age;//升序
//        int num=s.age-this.age;//降序

        int num2=num==0?this.name.compareTo(s.name):num;

        return  num2;

    }
}
