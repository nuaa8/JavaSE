package com.itheima1.myAbstract;
/*
    在Java中，  抽象类  表示的是一种继承关系，一个类只能继承一个  抽象类，而一个类可以实现  多个接口。
 */
public class AnimalDemo {
    public static void main(String[] args) {
//        Animal a=new Animal();  //抽象类不能实例化，如果要实现实例化，可以参照多态的方式。
//        通过子类对象实例化，这叫抽象多态类。
        Animal a=new Cat();
        a.eat();
        a.sleep();

    }
}
