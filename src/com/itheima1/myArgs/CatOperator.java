package com.itheima1.myArgs;

public class CatOperator {
    public void useCat(Cat c){//Cat c=new Cat();
        c.eat();
    }
    public Cat getCat(){  //返回值是一个Cat类型
        Cat c=new Cat();
        return c;
    }
}
