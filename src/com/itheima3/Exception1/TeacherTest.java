package com.itheima3.Exception1;
/*
    自定义异常
        格式：
        public class 异常类名 extends Exception{
            无参构造方法
            带参构造方法
        }

    throws和throw的区别
    throws
    1.用在方法声明后面，跟的是异常类名
    2.表示抛出异常，由该方法的调用者来处理
    3.表示出现异常的一种可能，并不一定会发生异常

    throw
    1.用在方法体内，跟的是异常对象名
    2.表示抛出异常，有方法体内的语句处理
    3.执行throw一定抛出某种异常
 */

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) throws ScoreException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入分数：");
        int score=sc.nextInt();

        Teacher t=new Teacher();
        t.checkScore(score);

        //异常的两种处理方法：try...catch和throws
//        try {
//            t.checkScore(score);//编译时异常，显示处理
//        }catch (ScoreException e){
//            e.printStackTrace();
//        }

    }
}
