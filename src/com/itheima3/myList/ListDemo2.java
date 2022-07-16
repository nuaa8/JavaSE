package com.itheima3.myList;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

/*
    List集合特有的方法(ArrayList也有该方法)：
        void add(int index,E element):在此集合中指定的位置插入指定的元素
        E remove(int index):删除指定索引处的元素，返回被修改的元素
        E set（int index,E element）:修改指定索引处的元素，返回被修改的元素
        E get(int index):返回指定索引出的元素
 */
public class ListDemo2 {
    public static void main(String[] args) {
        //创建集合对象
       List<String> list=new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //void add(int index,E element):在此集合中指定的位置插入指定的元素
//      list.add("javaee");
        list.add(1,"javaee");

        //E remove(int index):删除指定索引处的元素，返回被修改的元素
        System.out.println(list.remove(1));//返回javaee
        System.out.println(list);

        //E set（int index,E element）:修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(2,"zhang"));
        //输出集合对象
        System.out.println(list);

        //for()循环遍历,也可以用集合特有的遍历方式进行遍历
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            System.out.println(s);
        }
    }
}
