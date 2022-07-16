package com.itheima2.Base3;
/*
    int和String的相互转换
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //int---String
        int number=100;
        //方式1
        String s1=""+number;
        System.out.println(s1);

        //方式2
        //public static String valueOf(int i)
        String s2=String.valueOf(number);//静态方法： 通过类名直接访问 Java核心105
        System.out.println(s2);
        System.out.println("---------");

        //String----int
        String s="100";
        //方式1
        //String--Integer--int
        Integer i=Integer.valueOf(s);
        //public int intValue()
        int x=i.intValue();
        System.out.println(x);

        //方式2:直接转换
        //public static int parseInt(String s)
        int y=Integer.parseInt(s);
        System.out.println(y);
        int  z=Integer.parseInt("345");
        System.out.println(z);




    }
}
