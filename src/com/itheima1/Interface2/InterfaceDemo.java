package com.itheima1.Interface2;
/*
    接口成员变量的特点：
        成员变量:只能是常量，默认修饰符 public static final
        构造方法：
        接口没有构造方法，因为接口主要是对行为进行抽象的
        成员方法：
        只能是抽象方法，默认修饰符 public abstract

 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i=new InterImpl();
//        i.num=39;
        System.out.println(i.num);
//        i.num=40;
        System.out.println(i.num2);
    }
}
