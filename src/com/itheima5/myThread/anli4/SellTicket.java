package com.itheima5.myThread.anli4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    Lock中提供了获得锁和释放锁的方法
        void lock():获得锁
        void unlock():释放锁

    Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来实例化
        ReentrantLock():创建一个ReentrantLock实例

    一般用try...finally块,使用加锁和解锁。
 */
public class SellTicket implements Runnable {
    private int tickets = 100;
    private Lock lock = new ReentrantLock();//Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来实例化

    @Override
    public void run() {
        while (true) {     //  把多条语句操作共享数据的代码给锁起来
            lock.lock();//加锁
            if (tickets > 0) {
                try {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                } finally {
                    lock.unlock();//解锁，  在finally块中释放锁，即使在上面代码出问题了，也会释放锁。
                }
            }
        }


    }
}

