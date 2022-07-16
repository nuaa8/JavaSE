package com.itheima4.myioStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream:文件输出流用于将数据写入File
 * FileOutputStream(String name):创建文件输出流以指定的名称写入文件
 * 使用字节输出流写数据的步骤：
 *  1.创建字节输出流对象（调用系统功能创建了文件，创建字节输出流对象。让字节输出流对象指向文件）
 *  2.调用字节输出流对象的写数据
 *  3.释放资源（关闭此文件输出流并释放与此流相关的任何系统资源）
 */
public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream(String name):创建文件输出流以指定的名称写入文件
        FileOutputStream fos=new FileOutputStream("day04//fos.txt");
        /*
        做了3件事情:
            1.调用系统功能创建文件
            2.创建字节输出流
            3.让字节输出流对象指向创建好的文件
         */

        //void write(int b):将指定的字节写入文件输出流
        fos.write(97);
        fos.write(98);
//        fos.write(57);//9
//        fos.write(55);//7

        //最后都要释放资源
        //void close():关闭此文件输出流并释放与此流相关的任何系统资源
        fos.close();
    }
}
