package com.itheima1.myExtends1;
/*
    老师类
 */
public class Teacher {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //默认构造方法
    public Teacher(){

    }
    public Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void teach(){
        System.out.println("用爱成就每一个学员");
    }

}
