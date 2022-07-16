package com.itheima4.myioStream5.anli;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    案例：文件到集合
    需求：
        把ArrayList集合中的字符串数据写入到文本文件。要求：每一个字符串元素作为文件中的一行数据

    思路：
        1.创建ArrayList集合
        2.往集合中存储字符串元素
        3.创建字符缓冲输出流对象
        4.遍历集合，得到每一个字符串数据
        5.调用字符缓冲输出流对象的方法写数据
        6.释放资源
    讲这个实例的目的，是说数据源可能来自集合。
 */
public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        //创建ArrayList集合
        ArrayList<String> array=new ArrayList<>();

        //往集合中存储字符串元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //创建字符缓冲输出流对象
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\mycode\\itheima\\array.txt"));

        //遍历集合，得到每一个字符串数据
        for (String s:array){
            //调用字符缓冲输出流对象的方法写数据
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
    }
}
