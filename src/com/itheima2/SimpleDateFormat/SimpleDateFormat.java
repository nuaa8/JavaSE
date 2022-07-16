package com.itheima2.SimpleDateFormat;
/*
    SimpleDateFormat是一个具体的类，用于以区域设置敏感的方式格式化和解析日期。重点学习日期格式化和解析。
 */
import java.text.ParseException;
import java.util.Date;

/*
    构造方法：
        public SimpleDateFormat():构造一个SimpleDateFormat，使用默认模式和日期格式
        public SimpleDateFormat(String pattern):构造一个SimpleDateFormat，使用给定的模式和默认的日期格式
    格式化：从Date到String
        public final String format(Date date):将日期格式化成日期/时间的字符串
    解析:从String到Date
        public Date parse(String source):从给定字符串的开始解析文本以生成日期

 */
public class SimpleDateFormat {


    public static void main(String[] args) throws ParseException {
        //格式化：从Date到String
        Date d=new Date();
//        java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat();
        java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s=sdf.format(d);
        System.out.println(s);
        System.out.println("--------");

        //解析：从String到Date
        String ss="2048-08-09 11:11:11";
        java.text.SimpleDateFormat sdf2=new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd=sdf2.parse(ss);
        System.out.println(dd);

    }


}
