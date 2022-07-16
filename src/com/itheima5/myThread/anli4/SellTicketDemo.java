package com.itheima5.myThread.anli4;
/*
   虽然我们可以理解同步代码块和同步方法的锁对象问题，但是我们没有直接看到在哪里加上了锁，在哪里释放了锁，为了更清晰的表达如何枷锁和解锁，JDK5以后提供了一个新的锁对象Lock。Lock实现了提供比使用synchronized方法和语句可以获得更广泛
   的锁定操作。
   Lock中提供了获得锁和释放锁的方法
        void lock():获得锁
        void unlock():释放锁

    Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来实例化
    ReentrantLock的构造方法
        ReentrantLock():创建一个ReentrantLock实例



    同步方法：就是把synchronized关键字加到方法上
    格式：
        修饰符 synchronized 返回值类型 方法名(方法参数){}

 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st=new SellTicket();

        Thread t1=new Thread(st,"窗口1");
        Thread t2=new Thread(st,"窗口2");
        Thread t3=new Thread(st,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
