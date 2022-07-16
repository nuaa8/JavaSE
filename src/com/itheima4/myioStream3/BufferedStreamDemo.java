package com.itheima4.myioStream3;

import java.io.*;

/*

    public class BufferedOutputStream extends FilterOutputStream
        该类实现缓冲输出流。通过设置这样的输出流，应用程序可以向底层输出流写入字节，而不必为写入的每一个字节导致底层系统的调用

    字节   缓冲流:
        BufferedOutputStream:
             该类实现缓冲输出流。通过设置这样的输出流，应用程序可以向底层输出流写入字节，而不必为写入的每一个字节导致底层系统的调用
        BufferedInputStream:
             创建BufferedInputStream将创建一个内部缓冲区数组。当从流中读取或跳过字节时，内部缓冲区将根据需要从所包含的发输入流中重新填充，一次可以很多字节
    构造方法:
        字节缓冲输出流:BufferedOutputStream(OutputStream out):创建一个新的缓冲输出流，以将数据写入指定的底层输出流
        字节缓冲输入流:BufferedInputStream(InputStream in)：创建一个新的缓冲输出流，以便以指定的缓冲区大小将数据写入指定的底层数据流

    为什么构造方法需要的是字节流，而不是具体的文件或者路径名？
        字节缓冲流  仅仅提供缓冲区   ，而真正的读写数据还得依靠基本的  字节流对象   进行操作
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        //字节缓冲输出流:BufferedOutputStream(OutputStream out)
//        FileOutputStream fos=new FileOutputStream("day04\\bos.txt");
//        BufferedOutputStream bos=new BufferedOutputStream(fos);

        /*
        //以上两句合并在一起
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("day04\\bos.txt"));
        //写数据
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        //释放资源
        bos.close();

         */
        // 字节缓冲输入流:BufferedInputStream(InputStream in)
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("day04\\bos.txt"));

        /*
        //一次读取一个字节数据
        int by;
        while ((by=bis.read())!=-1){
            System.out.print((char)by);
        }

         */
        //一次读取一个字节数组
        byte[] bys=new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
            //String (byte[] bytes) ：把一个  字节数组  转换成   字符串
//        System.out.println(new String(bys));
        }
        //释放资源
        bis.close();
    }
}
