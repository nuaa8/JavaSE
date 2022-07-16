package com.itheima5.myThread.text4;
/*
    void join():等待这个死亡线程
 */
public class ThreadJoinDemo {
    public static void main(String[] args)  {
        ThreadJoin tj1=new ThreadJoin();
        ThreadJoin tj2=new ThreadJoin();
        ThreadJoin tj3=new ThreadJoin();

        tj1.setName("康熙");//康熙是四阿哥和八阿哥的爸爸，只有康熙死后，他们才能抢王位
        tj2.setName("四阿哥");
        tj3.setName("八阿哥");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
}
