package com.itheima5.myThread.anli1extend;
/*

    买票出现了问题
    1.相同的票出现了多次
    2.出现了负数的票

    问题原因：
    线程执行的随机性导致的

    卖票案例数据安全问题的解决
        为什么出现问题？（这也是我们判断多线程程序是否会有数据安全问题的标准）
        1.是否是多线程环境（必须的）
        2.是否有共享数据（必须的）
        3.是否有多条语句操作共享数据（可以改变）

    如何解决多线程安全问题？
        基本思想：让程序没有安全问题的环境

    怎么实现？
        1.把多条语句操作共享数据的代码给锁起来，让任意时刻只能有一个线程执行即可
        2.java提供了同步代码块的方式解决


    买票案例的思考
        同步代码块解决数据安全
    同步代码块
        锁定多条语句操作共享数数据，可以使用同步代码块实现
        格式:
            synchronized(任意对象){
                多条语句操作共享数据的代码
            }
         synchronized(任意对象):相当于给代码加锁，任意对象可以看成是一把锁

     同步的好处和弊端：
        1.好处：解决了多线程数据安全问题
        2.弊端：当线程很多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st=new SellTicket();

        Thread t1=new Thread(st,"窗口1");
        Thread t2=new Thread(st,"窗口1");
        Thread t3=new Thread(st,"窗口1");

        t1.start();
        t2.start();
        t3.start();
    }
}

