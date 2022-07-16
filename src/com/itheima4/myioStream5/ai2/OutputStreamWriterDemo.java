package com.itheima4.myioStream5.ai2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
    构造方法：
        OutputStreamWriter (OutputStream out):创建一个使用默认字符编码的OutputStreamWriter

    字符流  写数据的5种方法：
        void write(int c):写一个字符
        void write(char[] cbuf):写入一个字符数组
        void write(char[] cbuf,int off,int len):写入字符数组的一部分
        void write(String str):写一个字符串
        void write(String str,int off,inr len):写一个字符串的一部分

    flush():刷新流，还可以继续写数据
    close():关闭流，释放资源，但是在关闭之前会先  刷新流  。一旦关闭，就不能再写数据。
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter (OutputStream out):创建一个使用默认字符编码的OutputStreamWriter
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\mycode\\itheima\\osw.txt"));


//        void write(int c):写一个字符
//        osw.write(97);
//        //void flush():刷新流
//        osw.flush();//字符流  需要刷新一下，在能进去
//        osw.write(98);
//        osw.flush();


//        void write(char[] cbuf):写入一个字符数组
        char[] chs={'a','b','c','d','e'};
//        osw.write(chs);

//        void write(char[] cbuf,int off,int len):写入字符数组的一部分
//        osw.write(chs,0, chs.length);
//        osw.write(chs,1, 3);


//        void write(String str):写一个字符串
//        osw.write("abcde");
        osw.write("abcde",1,3);


//        void write(String str,int off,inr len):写一个字符串的一部分

        //释放资源
        osw.close();
        //Exception in thread "main" java.io.IOException: Stream closed
//        osw.write(100);
    }
}
