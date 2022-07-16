package com.itheima5.FunctionInterface.text1;
/*
    函数是接口概述
    函数式接口:有且仅有一个抽象方法的接口
        java中的函数式变成体现就是Lambda表达式，所以函数式接口就是可以适用于Lambda使用的接口。只有确保
        接口中有且仅有一个抽象方法，java中的Lambda才能顺利地进行推导
    如何检测一个接口是不是函数式接口哪？
        1.@FunctionaIInterface
        2.放在接口定义的地方：如果接口是函数式接口，编译通过；如果不是，编译失败

    注意
        我们自己定义函数式接口的时候，@FunctionIInterface是可选的，就算我不写这个注解，只要保证满足函数式接口定义的条件，也照样是函数式接口。
        但是    建议加上   该注解.

 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my=()-> System.out.println("函数式接口");
        my.show();
    }
}
