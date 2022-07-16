package com.itheima4.myioStream5.ai1;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
    编码：
        byte[] getBytes():便于平台的默认字符集将该String编码为一系列字节，将结果存储在新的字节数组中
        byte[] getBytes(String charsetName):使用指定的字符集将该String编码为一系列字节，将结果存储在新的字节数组中
    解码：
        String(byte[] bytes):通过使用平台的默认字符集解码指定的字节数组来构造新的String
        String(byte[] bytes,String charsetName):将制定的字符集解码为指定的字节数组来构造新的String

    编码和解码要相对应，否则可能得到不一样答案。
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //定义一个字符串
        String s="中国";

        //编码

        //byte[] getBytes():便于平台的默认字符集将该String编码为一系列字节，将结果存储在新的字节数组中
        byte[] bys = s.getBytes();
//        System.out.println(Arrays.toString(bys));//[-28, -72, -83, -27, -101, -67],3个字节表示一个汉字

        //byte[] getBytes(String charsetName):使用指定的字符集将该String编码为一系列字节，将结果存储在新的字节数组中
//        byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
//        byte[] bys = s.getBytes("GBK");
        System.out.println(Arrays.toString(bys));//[-42, -48, -71, -6],2个字节表示一个汉字


        //解码

        //String(byte[] bytes):通过使用平台的默认字符集解码指定的字节数组来构造新的String
//        String ss=new String(bys);
//        System.out.println(ss);

        //String(byte[] bytes,String charsetName):将指定的字符集解码为指定的字节数组来构造新的String
        String ss=new String(bys,"UTF-8");
//        String ss=new String(bys,"GBK");
        System.out.println(ss);

    }
}
