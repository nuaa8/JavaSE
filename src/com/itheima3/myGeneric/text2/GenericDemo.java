package com.itheima3.myGeneric.text2;
/*
    泛型方法
        泛型方法定义格式：
            格式：修饰符<类型>返回值类型 方法名（类型 变量名）{}
            范例:public<T> void show(T t){}
 */
public class GenericDemo {
    public static void main(String[] args) {
//        Generic g=new Generic();
//        g.show("林青霞");
//        g.show(30);
//        g.show(true);
////        g.show(12.34);//非法

//        Generic<String> g1=new Generic<String>();
//        g1.show("林青霞");
//
//        Generic<Integer> g2=new Generic<Integer>();
//        g2.show(30);
//
//        Generic<Boolean> g3=new Generic<Boolean>();
//        g3.show(true);

        Generic g=new Generic();
        g.show("林青霞");
        g.show(30);
        g.show(true);

        g.show(12.34);
    }
}
