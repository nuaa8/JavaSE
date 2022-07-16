package com.itheima4.myioStream3;

import java.io.*;

/*
    需求：
        把E:\\itcast\\字节流复制图片.avi复制到模块目下的  字节流复制图片.avi

    思路：
        1.根据数据源创建字节流对象
        2.根据目的地创建字节输出流对象
        3.读数据，复制图片（一次读取一个字节数据，一次写入一个字节数组）
        4.释放资源

    四种方式实现复制视频，并记录每种方式复制视频的时间
        1.基本字节流一次读取一个字节                 //共耗时：398毫秒
        2.基本字节流一次读取一个字节数组             //共耗时：48毫秒
        3.字节缓冲流一次读取一个字节                //共耗时：6毫秒
        4.字节缓冲流一次读取一个字节数组             //共耗时：14毫秒
 */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();

        //复制视频
//        method1();
//        method2();
//        methods3();
        methods4();

        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时："+(endTime-startTime)+"毫秒");


    }
    //1.基本字节流一次读取一个  字节
    public static void method1() throws IOException {
        //E:\\itcast\\字节流复制图片.avi
        //复制到模块目下的  字节流复制图片.avi
        FileInputStream fis=new FileInputStream("E:\\itcast\\字节流复制图片.avi");
        FileOutputStream fos=new FileOutputStream("D:\\mycode\\itheima\\字节流复制图片.avi");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
    //2.基本字节流一次读取一个  字节数组
    public static void method2() throws IOException {
        //E:\\itcast\\字节流复制图片.avi
        //复制到模块目下的  字节流复制图片.avi
        FileInputStream fis=new FileInputStream("E:\\itcast\\字节流复制图片.avi");
        FileOutputStream fos=new FileOutputStream("D:\\mycode\\itheima\\字节流复制图片.avi");

        byte[] bys=new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }

    //3.字节缓冲流一次读取一个字节
    public static void methods3() throws IOException {

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\itcast\\字节流复制图片.avi"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\mycode\\itheima\\字节流复制图片.avi"));

        int by;
        while((by=bis.read())!=-1){
            bos.write(by);
        }
        bos.close();
        bis.close();
    }

        //4.字节缓冲流一次读取一个字节数组

    public static void methods4() throws IOException {

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\itcast\\字节流复制图片.avi"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\mycode\\itheima\\字节流复制图片.avi"));

        byte[] bys=new byte[1024];
        int len;
        while((len=bis.read())!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}

