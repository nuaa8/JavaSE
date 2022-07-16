package com.itheima5.myInternet.text8;

import java.io.*;
import java.net.Socket;

/*
    练习4：
    客户端：数据来自于文本文件
    服务器：接收到的数据写入文本文件
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
        //释放资源
        br.close();
        s.close();
    }
}
