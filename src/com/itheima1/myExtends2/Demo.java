package com.itheima1.myExtends2;

import com.itheima1.myExtends1.Teacher;

/*
    测试类
 */
public class Demo {
    public static void main(String[] args) {
        //创建老师类对象并进行测试
       // Teacher t1=new Teacher("张曼玉",18);//也可以直接赋值，也可以用下面的方式
        Teacher t1=new Teacher();
        t1.setName("林青霞");
        t1.setAge(30);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();
    }
}
