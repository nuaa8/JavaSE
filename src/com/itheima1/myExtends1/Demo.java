package com.itheima1.myExtends1;

public class Demo {
    public static void main(String[] args) {
        //创建老师对象类进行测试
        Teacher t1=new Teacher();
        t1.setName("林青霞");
        t1.setAge(30);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();
        System.out.println("-------");

        Teacher t2=new Teacher("风清扬",33);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();
        System.out.println("------");

        Teacher t3=new Teacher();
        t3.setName("张曼玉");
        t3.setAge(25);
        System.out.println(t3.getName()+","+t3.getAge());
        t3.teach();
        System.out.println("-------");

        Student t4=new Student();
        t4.setName("小红");
        t4.setAge(25);
        System.out.println(t4.getName()+","+t4.getAge());
        t4.study();

    }
}
