package com.itheima4.myioStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据加入异常处理

    finally：在异常处理时提供finally快来执行所有清楚操作。比如说IO流中的释放资源
    特点：被finally控制的语句一定会执行，除非JVM退出
    try{
        可能出现异常的代码
    }catch（异常类名 变量名）{
        异常的处理代码
    }finally{
        执行所有清除操作
    }
 */
public class FileOutputStreamDemo4 {
    public static void main(String[] args) {
//        try {
//            FileOutputStream fos=new FileOutputStream("day04\\fos.txt");
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        //加入finally来实现释放资源
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("day04\\fos.txt");
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fos!=null)   //只有fos,不是null时，才需要对其释放资源
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
