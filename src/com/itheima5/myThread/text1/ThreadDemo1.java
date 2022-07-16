package com.itheima5.myThread.text1;
/*
    方式1:继承Thread类
        1.定义一个类MyThread继承Thread
        2.在MyThread类中重写run()方法
        3.创建MyThread类的对象
        4.启动线程
    两个小问题:
        1.为什么要重新run（）方法？
            因为run()方法是用来封装被线程执行的代码
        2.run()方法和start()方法的区别？
            run():封装线程执行的代码，直接调用，相当于普通方法的调用
            start():启动线程;然后由JVM调用此线程的run()方法
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread my1=new MyThread();
        MyThread my2=new MyThread();

//        my1.run();//并没有执行多线程
//        my2.run();

        //void start():导致此线程开始执行，Java虚拟机调用此线程的run方法
        my1.start();
        my2.start();
    }
}
