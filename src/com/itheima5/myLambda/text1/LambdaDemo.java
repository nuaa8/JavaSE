package com.itheima5.myLambda.text1;
/*
    需求:启动一个线程，在控制台输出一句话:“多线程程序启动”

    方式1:
        1.定义一个MyRunnable实现接口，重写run（）方法
        2.创建MyRunnable类的对象
        3.创建Thread类的对象，把MyRunnable的对象作为构造参数传递
        4.启动线程

    方式2：
        匿名内部类
    方式3：
        Lambda表达式的方法改进

    Lambda表达式的标准格式:
        格式：(形式参数)->{代码块}
        形式参数:如果有多个参数，参数之间用逗号隔开;如果没有参数，留空即可
        ->:固定写法，代表指向动作，即和后面要做的事情
        代码块:具体要做的事情，也就是以前我们写的方法体的内容
    Lambda表达式的三要素：形式参数、箭头、代码块
 */
public class LambdaDemo {
    public static void main(String[] args) {
//        //实现类的方式实现需求
//        MyRunnable my=new MyRunnable();
//        Thread t=new Thread(my);
//        t.start();

//        //匿名内部类的方式改进
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程程序启动");
//            }
//        }).start();

        //Lambda表达式的方式改进
        new Thread(()->{
            System.out.println("多线程程序启动");
        }).start();

    }
}
