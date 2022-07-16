package com.itheima5.myThread.text5;
/*
    方式2:实现Runnable接口
        1.定义一个MyRunnable类实现Runnable接口
        2.在MyRunnable类中重写run()方法
        3.创建MyRunnable类的对象
        4.创建Thread类的对象，把MyRunnable对象作为构造方法的参数
        5.启动线程


   多线程的实现方案有两种：
   1.继承Thread类
   2.实现Runnable接口

   相比继承Thread类，实现Runnable接口的好处
   1.避免了java单继承的局限性
   2.适合多个相同程序的代码去处理同一个资源的情况，把线程和程序的代码、数据有效的分离，较好地体现了面向对象的设计思想
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        //创建MyRunnable类的对象
        MyRunnable my=new MyRunnable();

        //创建Thread类的对象，把MyRunnable对象作为构造方法的参数

        //Thread (Runnable target)
//        Thread t1=new Thread(my);
//        Thread t2=new Thread(my);

        //Thread(Runnable target,String name):target - 启动此线程时调用其run方法的对象。 如果是null ，这个线程的run方法被调用。
        //name - 新线程的名称
        Thread t1=new Thread(my,"高铁");
        Thread t2=new Thread(my,"飞机");

        //启动线程
        t1.start();
        t2.start();


    }
}
