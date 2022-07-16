package com.itheima4.myioStream5.ai5;
/*
    需求：(字符流的)
        把模块目录下的ConversionStreamDemo.java 复制到模块目录下的Copy.java
    思路：
        1.根据数据源创建字符输入流对象
        2.根据目的地创建字符输入流对象
        3.读写数据，复制文件
        4.释放资源
 */

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符输入流对象
        InputStreamReader isr=new InputStreamReader(new FileInputStream("E:\\itcast\\ConversionStreamDemo.java"));
        //根据目的地创建字符输入流对象
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("day04\\teet.java"));

        //读写数据，复制文件
        //一次读写一个字符数据
//        int ch;
//        while ((ch=isr.read())!=-1){
//            osw.write(ch);
//        }

        //一次读写一个字符数组
        char[] chs=new char[1024];
        int len;
        while ((len=isr.read(chs))!=-1){
            osw.write(chs,0,len);
        }

        //释放资源
        osw.close();
        isr.close();

    }
}
