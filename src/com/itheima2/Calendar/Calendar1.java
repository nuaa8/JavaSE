package com.itheima2.Calendar;
import java.util.Calendar;
/*
    public abstract void add(int field,int amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段
    public final void set(int year,int month,int date):设置当前日历的年月日
 */
public class Calendar1 {
    public static void main(String[] args) {
        //获取对象
        java.util.Calendar c= java.util.Calendar.getInstance();//多态的形式
//        System.out.println(c);
        //public int get(int filed)
//        int year = c.get(java.util.Calendar.YEAR);
//        int month = c.get(java.util.Calendar.MONTH) + 1;//从0开始
//        int date = c.get(java.util.Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        //public abstract void add(int field,int amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段
        //需求1：3年前的今天
//        c.add(Calendar.YEAR,-3);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;//从0开始
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");
//
//        //需求2：10年前后的5天前
//        c.add(Calendar.YEAR,10);
//        c.add(Calendar.DATE,-5);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;//从0开始
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        //public final void set(int year,int month,int date):设置当前日历的年月日
        c.set(2048,11,11);//month从0开始的
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;//从0开始
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

    }
}
