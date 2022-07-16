package com.itheima5.myInternet.text9;

import java.io.*;
import java.net.Socket;

/*
    练习5
    客户端：数据来自文本文件，接收服务器的反馈
    服务器：接收到的数据写入文本文件，给出反馈
    出现的问题：程序一直在等待
    原因：读数据的方法是阻塞的
    解决方法：自定义结束标记；使用shutdownOutput()方法  （推荐使用该方法）
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s=new Socket("172.19.14.166",10000);

        //封装文本文件的数据
        BufferedReader br=new BufferedReader(new FileReader("InetAddressDemo.java"));
        //封装输出流对象
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            if("886".equals(line)){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        System.out.println(2222);
        //自定义结束结束符，不是最好的处理方式。因为可能文件的内容中，又该标识符，将会传输错误信息
//        bw.write("886");
//        bw.newLine();
//        bw.flush();

        //public void shutdownOutput()  作用：发送了一个输出结束的标记
        s.shutdownOutput();


        //接受反馈
        BufferedReader brClient=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data=brClient.readLine();    //等待读取数据
        System.out.println("服务器的反馈："+data);


        //释放资源
        br.close();
        s.close();
    }
}
