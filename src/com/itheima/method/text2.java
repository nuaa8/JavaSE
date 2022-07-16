//需求:定义一个方法，在方法中定义一个变量，判断该数据是不是偶数
package com.itheima.method;

public class text2 {
    public static void main(String[] args) {
        //调用方法
        isEvenNumber();
    }
    public static void isEvenNumber(){

        int number=10;//定义变量并赋值
        if(number%2==0)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
