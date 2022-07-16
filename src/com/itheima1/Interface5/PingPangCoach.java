package com.itheima1.Interface5;

public class PingPangCoach extends Coach implements SpeakEnglish {

    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃东西");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
