package com.itheima1.Interface5;

public class BasketballCoach extends Coach{
    @Override
    public void teach() {
        System.out.println("教打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃的东西");
    }
}
