package com.itheima1.myAbstract;
/*
    抽象类的成员特点：

 */
public abstract class Animal {
    //抽象方法
    public abstract void eat();
    //非抽象方法
    public void sleep(){
        System.out.println("睡觉");
    }
}
