package com.itheima3.Exception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");;
    }
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException();
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//把异常的错误信息输出在控制台.一般使用这个把异常信息输出，因为给出的信息最全


            //public String getMessage():返回此throwable的详细字符串
            System.out.println(e.getMessage());// 返回异常的原因，  Index 3 out of bounds for length 3

            //public string toString():返回此可抛出的简短的描述
            System.out.println(e.toString());//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

//          //public void printStackTrace():把异常的错误信息输出在控制台
//            e.printStackTrace();
        }
    }
}
/*
     public String getMessage() {
        return detailMessage;
    }
 */