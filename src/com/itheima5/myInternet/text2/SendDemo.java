package com.itheima5.myInternet.text2;

import java.io.IOException;
import java.net.*;

/*
    UDP发送数据的步骤
        1.创建发送端的Socket对象(DatagramSocket:此类表示用于发送和接收数据报数据包的套接字。)
        2.创建数据，并把数据打包（ DatagramPacket：该类表示数据报包。数据报包用于实现无连接分组传送服务。）
        3.调用DatagramSocket对象的方法发送数据
        4.关闭发送端

    把数据发送到这个端口：
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)
        //DatagramSocket():构造数据报套接字并将其绑定到本地主机上的任何可用端口
        DatagramSocket ds=new DatagramSocket();

        //创建数据，并把数据打包
        //DatagramPacket(byte[] buf,int length,InetAddress address,int port):构造一个数据包，
        //发送长度为length的数据包到指定主机上的指定端口号   下面为需要的4个数据
        byte[] bys="hello,udp,我来了".getBytes();//字符串转换成   数组
//        int length=bys.length;
//        InetAddress address=InetAddress.getByName("172.19.14.166");//本机的ip地址：172.19.14.166
//        int port=10086;//端口号，0-65535之间就行
//        DatagramPacket dp=new DatagramPacket(bys,length,address,port);
        DatagramPacket dp=new DatagramPacket(bys,bys.length,InetAddress.getByName("172.19.14.166"),10086);//上面的省略版本

        //调用DatagramSocket对象的方法发送数据
        //void send(DatagramPacket p):从此套接字发送数据报包
        ds.send(dp);

        //关闭发送端
        //void close():关闭此数据报套接字
        ds.close();
    }
}
