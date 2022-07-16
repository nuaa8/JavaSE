package com.itheima.ArrayList;

import java.util.ArrayList;

/*
    需求：
    创建一个存储字符串的集合，存储3个字符串，实用程序实现在控制台遍历该集合
    思路：
    1.创建集合对象
    2.往集合中添加字符串对象
    3.遍历集合，首先要能够获取到集合中的每一个元素，通过get（int index）方法实现，
    其次，要能够获取集合的长度，通过size（）方法实现
    4.遍历集合的通用格式
 */
public class text3 {
    public static void main(String[] args) {


        //创建集合对象
        ArrayList<String> arr=new ArrayList<>();
        arr.add("张帅");
        arr.add("吴斌");
        arr.add("曹恒");

       for(int i=0;i<arr.size();i++){
           System.out.println(arr.get(i));
       }
        System.out.println("-----------");

        //创建集合对象
        ArrayList<String> array=new ArrayList<String >();
        //在集合中添加字符串对象
        array.add("刘正风");
        array.add("左冷峰");
        array.add("风清扬");
        //遍历集合，首先要能够获取到集合中的每一个元素，通过get（int index）方法实现，
//        System.out.println(array.get(0));
//        System.out.println(array.get(1));
//        System.out.println(array.get(2));
        //遍历集合，其次，要能够获取集合的长度，通过size（）方法实现
//        System.out.println(array.size());
        //遍历集合的通用格式
//        for（int i=0;i<集合对象.size();i++）
//            集合对象.get（i） //就是获得指定索引处的元素
//        for(int i=0;i<array.size();i++) {
//            String s = array.get(i);
//            System.out.println(s);
//        }
//
        for(int j=0;j<array.size();j++){
            String s=array.get(j);
            System.out.println(s);
        }
    }
}
