package com.itheima5.myInternet.text1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    InetAddress
        此类表示Internet协议（IP）地址

    public static InetAddress getByName(String host):确定主机名称的IP地址。主机名称可以是机器名称
    ，也可以是IP地址
    public String getHostName():获取此IP地址的主机名
    public String getHostAddress():返回文本显示中的IP地址字段
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {

        //public static InetAddress getByName(String host):确定主机名称的IP地址。主机名称可以是机器名称
        InetAddress address=InetAddress.getByName("LAPTOP-JK7D2UUG");//和下面的功能一样
//        InetAddress address=InetAddress.getByName("192.168.1.6");//推荐这种方法让

        //public String getHostName():获取此IP地址的主机名
        String name = address.getHostName();

        //public String getHostAddress():返回文本显示中的IP地址字段
        String ip = address.getHostAddress();

        System.out.println("主机名:"+name);
        System.out.println("IP地址:"+ip);


    }
}
