package com.itheima5.myThread.anli3;

import java.util.*;

/*
    线程安全的类：
    StringBuffer
        1.线程安全，可变的字符序列
        2.从版本JDK5开始，被StringBuilder替代，通常应该使用StringBuilder类，因为它支持所有的操作。但他更快，因为不执行同步
    Vector
        1.从java2平台v1.2开始，该类改进了List接口，使其成为java Collections Framework的成员。于新的集合实现不同，Vector被同步。如果不需要线程安全的问题，建议使用ArrayList替代Vector
    Hashtable
        1.该类实现了一个哈希表，他将键映射到值。任何非null对象都可以作用键或者值
        2.从java2平台v1.2开始，该类进行改进，实现了Map接口，使其成为java Collections Framework的成员。与新的集合实现不同，Hashtable被同步，如果不需要线程安全的问题，建议使用HashMap代替Hashtable



 */
public class ThreadDemo {
    public static void main(String[] args) {
      StringBuffer sb=new StringBuffer();
      StringBuilder sb2=new StringBuilder();

        Vector<String> v=new Vector<>();
        ArrayList<String> array=new ArrayList<>();

        Hashtable<String, String> hb=new Hashtable<>();//安全类的方法前，加了 synchronized 关键字
        //public synchronized int size() {
        //        return count;
        //    }
        HashMap<String, String> hm=new HashMap<>();


        //static <T> List<T> synchronizedList(List <T> list):返回由指定列表支持的同步（线程安全）列表
        List<String> li = Collections.synchronizedList(new ArrayList<>());
    }
}
