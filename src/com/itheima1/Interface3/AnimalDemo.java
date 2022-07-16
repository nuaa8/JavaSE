/*
`   需求：对猫和狗进行训练，他们可以跳高，这里加入跳高功能。请采用抽象类和接口实现猫狗案例，
并在测试类中进行测试。
 */
package com.itheima1.Interface3;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法。先用接口来做
        Jumpping j=new Cat();
        j.jump();
        System.out.println("--------");

        Animal a=new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        a=new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        //真正应用接口的时候，用实现类，因为它拥有最多的方法
        Cat c=new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();
    }
}
