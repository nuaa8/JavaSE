package com.itheima3.Exception;
/*
     try{
        可能出现异常的代码;
        } catch(异常类名 变量名){
            异常的处理代码;
        }
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");;
    }
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);// 程序运行时产生一个异常对象，相当于new ArrayIndexOutOfBoundsException()，即创建了一个对象，如果该对象和catch（）中的异常类匹配，则把该对象赋值给e（也是一个对象）;
        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("你访问的数组的索引不存在");
            e.printStackTrace();//public void printStackTrace():把异常的错误信息输出在控制台
        }
    }
}
