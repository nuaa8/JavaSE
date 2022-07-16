package com.itheima5.myInternet.text10;
/*
   服务器：接收到的数据写入文本文件，给出反馈。代码用线程进行封装，为每一个客户端开启一个线程。
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss=new ServerSocket(10000);

        while (true){
            //监听客户端的连接，返回一个对应的Socket对象
            Socket s=ss.accept();
            //为每一个客户端开启一个线程
            new Thread(new ServerThread(s)).start();

        }

//        ss.close();//不在调用，因为一般不需要关闭的
    }
}
