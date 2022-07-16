package com.itheima4.myioStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    构造方法;
        FileOutputStream(String name):创建文件输出流以指定的名称写入文件
        FileOutputStream(File file):创建文件输出流以写入有指定的File对象表示的文件
    字节流写数据的三种方式:
        一次写一个字节数据
        void write(int b):将指定的字节写入此文件输出流
        一次写一个字节  数组  数据
        void write(byte[] b):将b.length字节从指定的字节数组写入此文件输出流
        一次写一个字节数组的部分数据
        void write(byte[] b,int off,int len):将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流

 */
public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //FileOutputStream(String name):创建文件输出流以指定的名称写入文件
        FileOutputStream fos=new FileOutputStream("day04//fos.txt");
        //new File(name),相当于下面这句
//        FileOutputStream fos=new FileOutputStream(new File("day04//fos.txt"));


        //void write(int b):将指定的字节写入此文件输出流
//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);

        //void write(byte[] b):将b.length字节从指定的字节数组写入此文件输出流
//        byte[] bys={97,98,99,100};

        //byte[] getByte():返回字符串对应的   字节数组
        byte[] bys = "abcdef".getBytes();
//        fos.write(bys);

        //void write(byte[] b,int off,int len):将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
        fos.write(bys,0,bys.length);
//        fos.write(bys,1,3);

    }
}
