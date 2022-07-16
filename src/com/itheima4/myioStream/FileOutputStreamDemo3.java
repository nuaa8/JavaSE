package com.itheima4.myioStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据的2个小问题:
        1.字节流写数据如何实现换行哪？
            不同的操作系统，换行符不一样
            window:\r\n
            linux:\n
            mac:\r

        2.字节流写数据如何实现追加写入哪？
        public FileOutputStream(String name,boolean append)
            创建文本输出流以指定的名称写入文件
            如果第二个参数为true，则字节将写入文件的末尾而不是开头
 */
public class FileOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
//        FileOutputStream fos=new FileOutputStream("day04//fos.txt");
        FileOutputStream fos=new FileOutputStream("day04//fos.txt",true);//追加写入
        //写数据
        for(int i=0;i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());// window:\r\n
        }

        //释放资源
        fos.close();
    }
}
