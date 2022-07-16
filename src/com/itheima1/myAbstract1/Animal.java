package com.itheima1.myAbstract1;

public abstract class Animal {
    private int age=20;
    private final String city="北京";

    public Animal(){}

    public void show(){
        age=40;
        System.out.println(age);
//        city="北京"

        System.out.println(city);

    }

    public abstract void eat();

}
