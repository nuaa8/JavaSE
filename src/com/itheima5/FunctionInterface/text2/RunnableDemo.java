package com.itheima5.FunctionInterface.text2;
/*
    1.2函数式接口作为方法的参数
    定义一个类(RunnableDemo)，在类中提供两个方法
        一个方法是，startThread(Runnable r)  方法参数Runnable是一个函数式接口
        一个方法是主方法，在主方法中调用startThread方法

    如果方法的参数是一个函数式接口，我们可以使用Lambda表达式作为参数传递
    startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));
 */
public class RunnableDemo {
    public static void main(String[] args) {
        //在主方法中调用startThread方法

        //匿名内部类的方式
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });

        //Lambda方式
        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));
    }
    private static void startThread(Runnable r){
//        Thread t=new Thread(r);
//        t.start();
        new Thread(r).start();//用法效果同上2行
    }
}
