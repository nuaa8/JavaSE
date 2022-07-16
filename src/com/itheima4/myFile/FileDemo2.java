package com.itheima4.myFile;

import java.io.File;
import java.io.IOException;

/*
    File类的创建功能:
        1.public boolean creatNewFile():当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
            1.1如果文件不存在，就创建文件，并返回true
            1.2如果文件存在，就不创建文件，并返回false
        2.public boolean mkdir():创建由此抽象路径名命名的目录
            2.1如果目录不存在，就创建文件，并返回true
            2.2如果目录存在，就不创建文件，并返回false
        3.public boolean mkdirs():创建由此抽象路径名命名的目录，包括任何必须但不存在的父目录
            3.1如果目录不存在，就创建文件，并返回true
            3.2如果目录存在，就不创建文件，并返回false
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        //需求1:我要在E:\\itcast目录下创建一个文件java.txt
        File f1=new File("E:\\itcast\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("-------");

        //需求2:我要在E:\\itcast目录下创建一个目录JavaSE
        File f2=new File("E:\\itcast\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("-------");

        //需求3:我要在E:\\itcast目录下创建一个多及目录javaWEB\\HTML
        File f3=new File("E:\\itcast\\JavaSE\\HTML");
        System.out.println(f3.mkdirs());
        System.out.println("--------");

        //需求4:我要在E:\\itcast目录下创建一个文件javase.txt
        File f4=new File("E:\\itcast\\javase.txt");
//        System.out.println(f4.mkdir());
        System.out.println(f4.createNewFile());

        //public boolean creatNewFile():当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
        //public boolean mkdir():创建由此抽象路径名命名的目录
        //public boolean mkdirs():创建由此抽象路径名命名的目录，包括任何必须但不存在的父目录

    }
}
