package com.itheima.Class;

public class phoneDemo {
    public static void main(String[] args) {
//        //创建对象
//        phone p=new phone();
//        //使用成员变量
//        System.out.println(p.brand);
//        System.out.println(p.price);
//        p.call();

        phone p=new phone();
        p.setBrand("华为");
        p.setPrice(3999);
        System.out.println(p.getBrand()+","+p.getPrice());
        p.call();
        p.sendMessage();
    }

}
