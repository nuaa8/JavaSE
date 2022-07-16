package com.itheima5.myThread.text3;
/*
    Thread类设置和获取线程优先级的方法
        public final void setPriority(int newPriority):更改线程的优先级
        public final int grtPriority():返回此线程的优先级
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1=new ThreadPriority();
        ThreadPriority tp2=new ThreadPriority();
        ThreadPriority tp3=new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

        //public final int grtPriority():返回此线程的优先级
//        System.out.println(tp1.getPriority());//优先级默认都是5，MIN=1,MAX=10
//        System.out.println(tp2.getPriority());//5
//        System.out.println(tp3.getPriority());//5

        //public final void setPriority(int newPriority):更改线程的优先级
//        tp1.setPriority(10000);//IllegalArgumentException
        System.out.println(Thread.MAX_PRIORITY);//10
        System.out.println(Thread.MIN_PRIORITY);//1
        System.out.println(Thread.NORM_PRIORITY);//5

        //设置正确的的优先级
        tp1.setPriority(5);
        tp2.setPriority(10);//线程优先级高，只是说它获取CPU时间片的几率高，并不是每一次都运行在最前面
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();//多线程执行的随机性
    }
}
