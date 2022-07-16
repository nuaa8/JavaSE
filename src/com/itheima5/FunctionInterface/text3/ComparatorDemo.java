package com.itheima5.FunctionInterface.text3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
    1.3函数式接口作为方法的返回值
    定义一个类(ComparatorDemo),在类中提供两个方法
         一个方法是，Comparator<String > getComparator()  方法返回值Comparator是一个函数式接口
        一个方法是主方法，在主方法中调用getComparator方法
     如果方法的返回值是一个函数式接口，可以使用Lambda表达式作为结果返回
     private static Comparator<String> getComparator(){
        return (String s1,String s2)->s1.length()-s2.length();
     }
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        //定义集合，存储字符串元素
        ArrayList<String> array=new ArrayList<>();

        array.add("ccc");
        array.add("aa");
        array.add("b");
        array.add("ddd");

        System.out.println("排序前:"+array);
        //Collections.sort(array);
        Collections.sort(array,getComparator());//按照比较器排序，即字母数由小到大
        System.out.println("排序前:"+array);
    }
    private static Comparator<String > getComparator(){

//        Comparator<String> comp=new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length()-s2.length();
//            }
//        };
//        return comp;
        //匿名内部类的方式实现
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length()-s2.length();
//            }
//        };

        //Lambda表达式
        return (String s1,String s2)->{
            return s1.length()-s2.length();
        };

        //可以缩写成
//        return (s1,s2)->s1.length()-s2.length();
    }
}
