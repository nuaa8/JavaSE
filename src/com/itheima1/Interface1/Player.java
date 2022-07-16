package com.itheima1.Interface1;
//抽象运动员类
public abstract  class Player extends Person{
    public Player(){

    }
    public Player(String name,int age){
        super(name,age);
        //抽象学习方法
    }
    public abstract  void study();
}
