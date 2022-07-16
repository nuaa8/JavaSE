package com.itheima4.myioStream2.anli2;

import java.io.FileInputStream;
import java.io.IOException;

/*
    需求：把文件foc.txt中的内容读取出来在控制台输出

    使用字节输入流读取数据的步骤：
       1.创建字节输入流的对象
        2.调用字节输入流对象的读数据方法
        3.释放资源
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis=new FileInputStream("D:\\mycode\\itheima\\fos.txt");

        //调用字节输入流的对象的读数据方法
        //int read(byte[] b):从该输入流读取最多b.length个字节的数据到一个字节数组
//        byte[] bys=new  byte[5];
//
//        //第一次读数据
//        int len = fis.read(bys);
//        System.out.println(len);
//        //String (byte[] bytes)
//        System.out.println(new String(bys));
//
//        //第二次读数据
//        len = fis.read(bys);
//        System.out.println(len);
//        //String (byte[] bytes)
//        System.out.println(new String(bys));
//
//        //第三次读数据
//        len = fis.read(bys);
//        System.out.println(len);
//        //String (byte[] bytes)
//        System.out.println(new String(bys));

        /*
            hello\r\n
            world\r\n

            第一次：hello
            第二次：\r\n
            第三次：ld\r\nr
            wor

        */

        //String (byte[] bytes) ：把一个  字节数组  转换成   字符串
//        System.out.println(new String(bys));

        byte[] bys=new byte[1024];//1024及其整数倍
        int len;
        while((len= fis.read(bys))!=-1){
            System.out.println(new String(bys,0,len)); //String (byte[] bytes) ：把一个  字节数组  转换成   字符串
        }


        //释放资源
        fis.close();

    }
}
