package com.itheima1.myArgs2;
/*
    3.接口名作为形参和返回值
        3.1方法的形参是接口名，其实需要的是该接口的实现类对象
        3.2方法的返回值是接口名，其实返回的是该接口的实现类对象
 */
public class JumppingDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        JumppingOperator jo=new JumppingOperator();
        Jumpping j=new Cat();
        jo.useJumpping(j);

        Jumpping j2=jo.getJumpping();//new Cat()
        j2.jump();
    }
}
