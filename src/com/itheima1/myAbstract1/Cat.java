package com.itheima1.myAbstract1;
/*
    成员变量：
        可以是常量或者变量
    构造方法：
        有构造方法。但是不能实例化
        那么，构造方法的作用是什么？用于子类访问父类数据的初始化法
    成员方法:
        可以有抽象方法：限定子类必须完成某些动作
        也可以有非抽象方法：提高代码复用性
 */
public class Cat extends Animal{
    //继承抽象类的时候必须重写抽象方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
