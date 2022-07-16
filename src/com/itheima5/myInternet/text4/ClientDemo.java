package com.itheima5.myInternet.text4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
    TCP发送数据的步骤：
        1.创建客户端的Socket对象（Socket）
            Socket(String host,int port)
        2.获取输出层，写数据
            OutputStream getOutputStream()
        3.释放资源
            void close
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象（Socket）
        //Socket(InetAddress address,int port) 创建流套接字并将其连接到指定IP地址的指定端口
//        Socket s=new Socket(InetAddress.getByName("172.19.14.166"),1000);
        //Socket(String host,int port)  创建流套接字并将其连接到指定主机上的指定的端口
        Socket s=new Socket("172.19.14.166",10000);

        //获取输出流，写数据
        //OutputStream getOutputStream()  返回此套接字的输出流
        OutputStream os=s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());

        //释放资源
        s.close();

    }
}
