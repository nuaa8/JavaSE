package com.itheima1.myInnerClass1;

/*
    测试类
    按照内部类在类中的定义的位置不同，可以分为如下两种形式
        在类的成员位置:成员内部类
            格式:外部类名.内部类名 对象名=外部类对象.内部类对象
            范例:Outer.Inner oi=new Outer().new Inner()
        在类的局部位置:局部内部类
 */
public class InnerDemo {
    public static void main(String[] args) {
        //创建内部类对象，并调方法
      //  Inner i=new Inner();//报错
        Ouder.Inner oi=new Ouder().new Inner();
        oi.show();

//        Outer o=new Ouder();
//        o.method();
    }
}
