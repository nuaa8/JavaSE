package com.itheima4.myioStream5.ai6;

import java.io.*;

/*
    字符  缓冲流的特有功能：
        BufferedWriter:
            void newLine():写一行行分隔符，行分隔符字符串由系统属性定义

        BufferedReader:
            public String readLine():读取一行文字
                结果包含行的内容的字符串，不包括任何行终止符，如果流的结尾已经到达，则为null
 */
public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        //创建字符缓冲输出流
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\mycode\\itheima\\bw.txt"));

        //写数据
        for (int i=0;i<10;i++){
            bw.write("hello"+i);
//            bw.write("\r\n");
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
    */

        //创建字符缓冲输入流
        BufferedReader br=new BufferedReader(new FileReader("D:\\mycode\\itheima\\bw.txt"));

//        //public String readLine():读取一行文字
//        //第一次读数据
//        String line = br.readLine();
//        System.out.println(line);
//
//        //第二次读数据
//        line = br.readLine();
//        System.out.println(line);
//
//
//        //再多读几行
//        line = br.readLine();
//        System.out.println(line);

        String line;
        while ((line=br.readLine())!=null){
//            System.out.print(line);//结果包含行的内容的字符串，不包括任何行终止符
            System.out.println(line);
        }
        //释放资源
        br.close();
    }

}