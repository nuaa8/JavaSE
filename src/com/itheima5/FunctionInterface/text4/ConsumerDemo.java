package com.itheima5.FunctionInterface.text4;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;

/*
    Consumer<T>:包含两个方法
        void accept(T t):对给定的参数执行此操作
        default Consumer<T> andThen(Consumer after):返回一个组合的Consumer,依次执行此操作，然后
        执行after操作
        Consumer<T>接口也被称为消费型接口，它消费的数据类型由泛型指定
 */
public class ConsumerDemo {
    public static void main(String[] args) {
//        operatorString("林青霞",(String s)->{
//            System.out.println(s);
//        });
        operatorString("林青霞",s-> System.out.println(s));
//        operatorString("林青霞", System.out::println);//结果同上

        operatorString("林青霞",s->{
            System.out.println(new StringBuilder(s).reverse().toString());
        });
    }



    //定义一个方法，消费一个字符串数据
    private static void operatorString(String name, Consumer<String> con){
        con.accept(name);
    }
}
