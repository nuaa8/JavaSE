package com.itheima1.Interface5;
/*
    测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        PingPangPlayer pp=new PingPangPlayer();
        pp.setName("张继科");
        pp.setAge(30);
        System.out.println(pp.getName()+","+pp.getAge());
        pp.eat();
        pp.speak();
        pp.study();
        System.out.println("--------");


        BasketballPlayer bp=new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
    }
}
