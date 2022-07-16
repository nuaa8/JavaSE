package com.itheima4.myioStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    需求:
        把文件fos.txt中的内容读取出来在控制要输出
    FileInputStream(String name):通过打开与实际文件的链接来创建一个FileInputStream，该文件由文件系统中的路径名name命名

    使用字节输入流读取数据的步骤:
        1.创建字节输入流的对象
        2.调用字节输入流对象的读数据方法
        3.释放资源
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流的对象
        // FileInputStream(String name)
        FileInputStream fis=new FileInputStream("day04\\fos.txt");

        //调用字节输入流对象的读数据方法
        //int read():从该输入流读取一个字节的数据
        /*
        //第一次读取数据
        int by = fis.read();
        System.out.println(by);
        System.out.println((char)by);
        //第二次读取数据
        by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        //再多读两次
        by = fis.read();
        System.out.println(by);//-1
        by = fis.read();
        System.out.println(by);

        //如果达到文件的末尾:-1

         */
        /*
        int by=fis.read();
        while (by!=-1){
            System.out.print((char)by);
            by= fis.read();
        }

         */

        //优化上面的代码
        int by;
        /*
            fis.read():读数据
            by=fis.read():把读取到的数据赋值给by
            by!=-1:判断读取的数据是不是-1
         */
        while ((by=fis.read())!=-1){  //如果达到文件的末尾:-1
            System.out.print((char) by);
        }

        //释放资源
        fis.close();
    }
}
