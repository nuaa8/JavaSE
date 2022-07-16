package com.itheima1.myArgs1;
/*
    测试类
    2.抽象类名作为形参和返回值
        2.1方法的形参是抽象类名，其实需要的是该抽象类的子类对象
        2.2方法的返回值是抽象类名，其实返回的是该抽象类的子类对象
 */
public class AnimalDemo1 {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        AnimalOperator1 ao=new AnimalOperator1();
        //然而，抽象类不能直接进行实例化，需要引用多态的方式进行实例化，所以需要创建一个Cat类
        Animal1 a=new Cat();
        ao.useAnimal1(a);

        Animal1 a2=ao.getAnimal1();//new Cat()
        a2.eat();

    }
}
