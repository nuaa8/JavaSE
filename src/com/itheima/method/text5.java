/**
 * 1.方法重载特点
 *      1.1重载仅对应方法的定义，与方法的调用无关
 *      1.2重载仅针对同一个类中方法的名称与参数进行识别，与返回值无关，
 *      换句话说不能通过返回值来判断两个方法是否相互构成重载
 *
 */
package com.itheima.method;

public class text5 {
    public static void main(String[] args) {
        int result1=sum(2,3);
        System.out.println(result1);
        double result2=sum(2,5);
        System.out.println(result2);
        int result3=sum(2,3,4);
        System.out.println(result3);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sun(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
