package com.itheima3.Exception;




import java.util.Date;

/*
    Java中的异常被分为两大类：编译时异常和运行时异常，也被称为受检异常和非受检异常
    所有的RuntimeException类及其子类的实例被称为运行时异常，其他的异常都是编译时异常
    编译时异常:必须显示处理，否则程序就会发生错误，无法通过编译
    运行时异常：无需显示处理，也可以和编译时异常一样处理
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {

        method();

    }


    //运行时异常
    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
