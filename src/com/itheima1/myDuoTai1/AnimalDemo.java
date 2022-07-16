package com.itheima1.myDuoTai1;
/*
    多态中成员访问的特点
        1.成员变量：编译看左边，执行看左边:即编译看父类，执行结果看父类
        2.成员方法：编译看左边，执行看右边:即编译看父类，执行结果看子类
    为什么成员变量和成员方法的访问不一样哪？
        因为成员方法有重写，而成员变量没有
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a=new Cat();
        System.out.println(a.age);
//        System.out.println(a.weight);//错误，因为父类对象不能直接调用子类成员变量

        System.out.println(((Cat)a).weight);//强制类型转换
        a.eat();
        a.palyGame();//错误，因为父类对象不能直接调用子类成员方法
        ((Cat) a).playGame();//强制类型转换

    }
}
