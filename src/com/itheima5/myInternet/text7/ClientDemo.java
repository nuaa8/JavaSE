package com.itheima5.myInternet.text7;

import java.io.*;
import java.net.Socket;

/*
    练习3：
    客户端：数据来自键盘录入，直到输入的数据数886，发送数据结束
    服务器：接收到的数据写入文本文件
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s=new Socket("172.19.14.166",10000);
        //数据来自于键盘录入，直到输入的数据是886，发送数据结束
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
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
        s.close();
    }
}
