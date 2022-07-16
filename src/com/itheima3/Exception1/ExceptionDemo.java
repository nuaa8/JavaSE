package com.itheima3.Exception1;

public class ExceptionDemo {
    public static void main(String[] args) {
        method();
    }
    public static void method() throws ArrayIndexOutOfBoundsException{  //仅仅把异常抛出去，并没有对其进行进行处理，真正处理还是try-- catch

        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);


    }
}
