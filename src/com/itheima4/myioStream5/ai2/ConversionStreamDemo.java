package com.itheima4.myioStream5.ai2;
/*
    字符流中的编码解码问题：
    字符流抽象基类：
        Reader:字符输入流的抽象类
        Writer:字符输出流的抽象类
    字符流中和编码解码问题相关的两个类：
        InputStreamReader:是从字节流到字符流的桥梁
            它读取字节，并使用指定的编码将其解码为字符
            它使用的字符集可以有名称指定，也可以被明确指定，或者接受平台的默认字符集
        OutputStreamWriter:是从字符流道字节流的桥梁
            是从字符流道字节流的桥梁,使用指定的编码将写入的字符编码为字节
            它使用的字符集可以由名称指定，也可以被明确指定，或者接受平台的默认字符集

 */


import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter(OutputStream out)  ：创建一个使用默认字符编码的OutputStreamWriter.
//        OutputStreamWriter(OutputStream out，String charsetName) ： 创建一个使用命名字符集的OutputStreamWriter.

//        FileOutputStream fos=new FileOutputStream("D:\\mycode\\itheima\\osw.txt"); // 相当于 OutputStream out，即用它的  子类FileOutputStream  进行创建对象
//        OutputStreamWriter osw=new OutputStreamWriter(fos);
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\mycode\\itheima\\osw.txt"),"UTF-8");    //以上两句的合并写法
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\mycode\\itheima\\osw.txt"),"GBK");
        osw.write("中国");
        osw.close();

//        InputStreamReader (InputStream in) 创建一个默认字符集的InputStreamReader.
//        InputStreamReader(InputStream in,String charsetName) 创建一个使用命名字符集的InputStreamReader.
//        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\mycode\\itheima\\osw.txt"));
        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\mycode\\itheima\\osw.txt"),"GBK");

        //一次读取一个字符数据
        int ch;
        while((ch=isr.read())!=-1){
            System.out.print((char) ch);
        }
        isr.close();

    }
}
