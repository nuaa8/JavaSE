package com.itheima5.myThread.text2;

public class MyThread extends Thread{
    //通过构造方法也可以设置线程名称
    public MyThread(){};

    //通过构造方法也可以设置线程名称
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
