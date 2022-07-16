package com.itheima3.myGeneric.text1;
/*
    泛型类
        1.泛型类定义格式：
            格式:修饰符 class 类名<类型>{}
            范例:public class Generic<T>{}
                此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
 */
public class GenericDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("林青霞");
        System.out.println(s.getName());

        Teacher t=new Teacher();
        t.setAge(30);
        System.out.println(t.getAge());
        System.out.println("-------");

        Generic<String> g1=new Generic<String>();
        g1.setT("林青霞");
        System.out.println(g1.getT());

        Generic<Integer> g2=new Generic<Integer>();
        g2.setT(30);
        System.out.println(g2.getT());

        Generic<Boolean> g3=new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());
    }
}
