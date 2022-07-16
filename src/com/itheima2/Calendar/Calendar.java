package com.itheima2.Calendar;


/*
    Calendar为某一时刻和一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法

    Calendar提供了一个类方法getInstance()用于获取Calendar对象，其日历字段已经使用当前日期和时间初始化
        Calendar rightNow=Calendar.getInstance();//静态方法
 */
public class Calendar {
    public static void main(String[] args) {
        //获取对象
     java.util.Calendar c= java.util.Calendar.getInstance();//多态的形式
//        System.out.println(c);
        //public int get(int filed)
        int year = c.get(java.util.Calendar.YEAR);
        int month = c.get(java.util.Calendar.MONTH) + 1;//从0开始
        int date = c.get(java.util.Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
