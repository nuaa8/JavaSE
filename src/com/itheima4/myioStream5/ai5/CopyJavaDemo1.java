package com.itheima4.myioStream5.ai5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
     需求：(字符流的)
        把模块目录下的ConversionStreamDemo.java 复制到模块目录下的Copy.java(改进版)
    分析：
        1.轮换流的名字比较长，我们常见的操作都是按照本地默认编码实现的，所以，为了简化书写，轮换流提供了对应的子类
        2.FileReader:用于读取字符文件的便捷类
            FileReader(String fileName)
        3.FileWriter:用于写入字符文件的便捷类
            FileReader(String fileName)
        4.

    思路：
        1.根据数据源创建字符输入流对象
        2.根据目的地创建字符输入流对象
        3.读写数据，复制文件
        4.释放资源
 */
public class CopyJavaDemo1 {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符输入流对象
        FileReader fr=new FileReader("E:\\itcast\\ConversionStreamDemo.java");
        //根据目的地创建字符输入流对象
        FileWriter fw=new FileWriter("day04\\teet.java");

        //读写数据，复制文件
        //一次读写一个字符数据
//        int ch;
//        while ((ch=fr.read())!=-1){
//            fw.write(ch);
//        }

        //一次读写一个字符数组
        char[] chs=new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }

        //释放资源
        fr.close();
        fw.close();

    }
}
