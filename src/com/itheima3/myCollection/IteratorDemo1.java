package com.itheima3.myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    Iterator:迭代器，集合专用的遍历方式
        Iterator<E> iterator():返回此集合中元素的迭代器，通过  集合的iterator()方法  得到
        迭代器是通过  集合的iterator()方法  得到，所以我们说他是依赖于集合而存在的

    Iterator中的常用方法
        E next():返回迭代中的下一个元素
        boolean hasNext(）:如果迭代具有更多的元素，则返回true

    集合的使用步骤
        步骤1：创建集合对象
        步骤2：添加元素
            2.1：创建元素
            2.2：添加元素到集合
            合并：添加元素到集合
        步骤3：遍历集合
            3.1：通过集合对象获取迭代器对象
            3.2：通过迭代器对象的hasNext()方法判断是否还有元素
            3.3:通过迭代器对象的next（）方法获取下一个元素
 */
public class IteratorDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c=new ArrayList<String>();
        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        //Iterator<E> iterator():返回此集合中元素的迭代器，通过集合的iterator()方法得到
//        Iterator<String> it=c.iterator();//通过多态的方式的得到Iterator的对象
//        Iterator<String> it = c.iterator();
        Iterator<String> it = c.iterator();  //通过集合对象获取迭代器对象
//        Iterator<String> it1 = c.iterator();

        /*
                public Iterator<E> iterator() {
                       return new Itr();
                 }

                 private class Itr implements Iterator<E> {
                ----
                }
         */


        //E next():返回迭代中的下一个元素
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());//NoSuchElementException:表示被请求的元素不存在


        // boolean hasNext(）:如果迭代具有更多的元素，则返回true
//
        //while循环改进
        while(it.hasNext()){
//            System.out.println(it.next());
            String s=it.next();//便于进一步对字符串做操作
            System.out.println(s);
        }
    }
}
