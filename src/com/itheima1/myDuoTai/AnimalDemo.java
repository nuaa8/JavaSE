package com.itheima1.myDuoTai;
/*
    多态：
        同一个对象，在不同时刻表现出来的不同形态
    举例：猫
        我们可以说猫是猫：猫 cat=new 猫（）；
        我们也可以说猫是动物：动物 animal=new 猫（）；
        这里的猫在不同时刻表现出来不同的形态，这就是多态
     多态的前提和体现：
        1.有继承/实现关系
        2.有方法重写
        3.有父类引用指向子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a=new Cat();
        a.eat();
    }
}
