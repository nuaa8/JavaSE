package com.itheima2.Base2;
/*
    将基本数据类型封装成 对象 的好处是在于可以在对象中定义更多的功能方法操作该数据，常用的操作之一是:用于基本数据类型与字符串之间的转换
   Integer:包装一个对象中的原始类型int的值
    构造方法：
        public Integer(int value):根据int值创建Integer对象（过时了）
        public Integer(String s):根据String值创建Integer对象（过时了）
    静态方法获取对象：
        public static Integer valueOf(int i):返回表示指定的int值得Integer实例
        public static Integer valueOf(String s):返回一个保存指定值的Integer对象String
 */
public class IntegerDemo {
    public static void main(String[] args) {

        /*
//        public Integer(int value):根据int值创建Integer对象（过时了）
        Integer i1=new Integer(100);
        System.out.println(i1);

//        public Integer(String s):根据String值创建Integer对象（过时了）
        Integer i2=new Integer("100");

//        Integer i2=new Integer("abc");//NumberFormatException
        System.out.println(i2);
    */

//        public static Integer valueOf(int i):返回表示指定的int值得Integer实例
        Integer i1=Integer.valueOf(100);
        System.out.println(i1);

//        public static Integer valueOf(String s):返回一个保存指定值的Integer对象String
        Integer i2=Integer.valueOf("100");
        System.out.println(i2);
    }
}
