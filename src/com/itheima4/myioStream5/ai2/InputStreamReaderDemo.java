package com.itheima4.myioStream5.ai2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


/*
    构造方法：
        InputStreamReader (InputStream in):创建一个使用默认字符集的InputStreamReader
    字节流  读数据的2种方法：
        int read():一次读取一个字符数据
        int read(char[] cbuf):一次读取一个字符数组数据
 */
public class InputStreamReaderDemo {
    public static void main(String[] args0) throws IOException {
        // InputStreamReader (InputStream in):创建一个使用默认字符集的InputStreamReader

        InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\mycode\\itheima\\osw.txt"));
//        int read():一次读取一个字符数据
//        int ch;
//        while ((ch=isr.read())!=-1){
//            System.out.println((char)ch);
//        }

        // int read(char[] cbuf):一次读取一个字符数组数据
        char[] chs=new char[1024];
        int len;
        while((len=isr.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }

        //释放资源
        isr.close();

    }
}
