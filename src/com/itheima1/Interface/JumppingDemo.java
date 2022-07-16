package com.itheima1.Interface;
/*
    测试类
    接口，在JAVA编程语言中是一个抽象类型，是抽象方法的集合。一个类通过继承接口的方式，从而来继承接口的抽象方法。接口无法被实例化，但是可以被  实现，
    一个实现的接口，必须实现接口内的所以方法，否则就必须声明为抽象类。（非常重要，非常重要，非常重要）
    接口的特性：
        1.
 */
public class JumppingDemo {
    public static void main(String[] args) {
//        Jumpping j=new Jumpping();  //接口不能被实例化，可以参照多态的
//        方式，通过实现类对象进行实例化
        //接口的实例化，多态的方式
        Jumpping j=new Cat();
        j.jump();


    }
}
