package com.itheima4.myioStream10;
/*
    Properties和IO流结合的方法：
        void load(Reader reader):
            从输入字符流读取属性列表（键和元素对）
        void store(Writer writer,String comments):
            将此属性列表（键和元素对）写入此Properties表中，以适合使用load(Reader)方法的格式写入输出字符流
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class propertiesDemo3 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
//        myStore();

        //把文件中的数据加载到集合
        myLoad();

    }
    private static void myLoad() throws IOException {
        Properties prop=new Properties();

        //void load(Reader reader):从输入字符流读取属性列表（键和元素对）
        FileReader fr=new FileReader("D:\\mycode\\itheima\\fw.txt");
        prop.load(fr);
        fr.close();

        System.out.println(prop);

    }

    private static void myStore() throws IOException {
        Properties prop=new Properties();

        prop.setProperty("itheima001","林青霞");
        prop.setProperty("itheima002","张曼玉");
        prop.setProperty("itheima003","王祖贤");

        //void store(Writer writer,String comments):将此属性列表（键和元素对）写入此Properties表中，以适合使用load(Reader)方法的格式写入输出字符流
        FileWriter fw=new FileWriter("D:\\mycode\\itheima\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
