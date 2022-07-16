package com.itheima5.myInternet.text2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*

    java提供了DatagramSocket类作为基于UDP协议的Socket
    UDP接收数据的步骤
        1.创建接收端的Socket对象(DatagramSocket)
            DatagramSocket(int port)
        2.创建一个数据包，用于接收数据
            DatagramPacket(byte[] buf,int length)
        3.调用DatagramSocket对象的方法接收数据
            void receive(Datagram p)
        4.解析数据包，并把数据在控制台显示
            byte[] getData()
            int getLength()
        5.关闭接收端
            void close()
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象(DatagramSocket)
        //DatagramSocket(int port):构造数据报套接字并将其绑定到   本地   主机上的指定端口
        //DatagramSocket(int port, InetAddress laddr)：创建一个数据报套接字，绑定到      指定的  本地地址   。
        DatagramSocket ds=new DatagramSocket(10086);

        //创建一个数据包，用于接收数据
        //DatagramPacket(byte[] buf,int length):构造一个DatagramPacket用于接收长度为length数据包
        byte[] bys=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bys,bys.length);

        //调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

        //解析数据包，并把数据在控制台显示
        //byte[] getData():返回数据缓冲区
        byte[] datas=dp.getData();
        //int getLength():返回要发送的数据的长度或接收到的数据的长度
        int len=dp.getLength();//得到实际的发送数据长度
        String dataString=new String(datas,0,len);
        System.out.println("数据是:"+dataString);

        //也可以写成一句
//        System.out.println("数据是："+new String(dp.getData(),0,dp.getLength()));


        //关闭接收端
        ds.close();
    }
}
