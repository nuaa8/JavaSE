package com.itheima3.myGeneric;
/*
    可变参数又称参数个数可变，用作方法的形参出现，那么方法参数个数就是可变的
    格式：修饰符 返回值类型 方法名（数据类型...变量名）
    示例：public static int sum(int...a)
 */
public class ArgsDemo1 {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,40));

        System.out.println(sum(10,20,30,40,50));
    }
    public static int sum(int a,int b){
        return a+b;

    }
    public static int sum(int a,int b,int c){
        return a+b+c;

    }

    public static int sum(int...a) {  //可变参数，这里的a实际上是一个数组
//        System.out.println(a);//[I@119d7047
//        return 0;
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;

    }
}
