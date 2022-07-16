package com.itheima1.myArgs1;

public class AnimalOperator1 {
    public void useAnimal1(Animal1 a){//相当于 Animal1 a=new Cat();
        a.eat();
    }
    public Animal1 getAnimal1(){
        Animal1 a=new Cat();
        return a;
    }
}
