package com.itheima5.myThread.text4;

public class ThreadJoin extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
