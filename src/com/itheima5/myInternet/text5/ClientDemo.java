package com.itheima5.myInternet.text5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    练习1：
    客户端：发送数据，接收服务器反馈
    服务器：接收数据，给出反馈
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        Socket s=new Socket("172.19.14.166",10000);

        //获取输出流，写数据
        OutputStream os=s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());

        //接收服务器反馈
        InputStream is=s.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);
        System.out.println("客户端："+data);

        //释放资源
//        is.close();
//        os.close();
        s.close();//这一个就可以了，因为is,os,都是s创建的
    }
}
