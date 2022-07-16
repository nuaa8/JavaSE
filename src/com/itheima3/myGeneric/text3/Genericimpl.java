package com.itheima3.myGeneric.text3;

public class Genericimpl <T> implements Generic<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
