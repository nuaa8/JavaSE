package com.itheima3.myGeneric.text3;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1=new Genericimpl<String >();
        g1.show("林青霞");

        Generic<Integer> g2=new Genericimpl<Integer>();
        g2.show(30);
    }
}
