package com.itheima1.Interface5;

public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员学英语");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃东西");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习");
    }
}
