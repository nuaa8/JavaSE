package com.itheima1.Interface1;
//测试类
public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp=new PingPangPlayer();
        ppp.setName("王皓");
        ppp.setAge(30);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("--------");

        BasketballPlayer bp=new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
    }
}
