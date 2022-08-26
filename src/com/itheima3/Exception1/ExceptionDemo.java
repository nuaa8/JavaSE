package com.itheima3.Exception1;

/**
 * 虽然可以通过try...catch 对异常进行处理，但是并不是所有的异常我们都有  权限  进行异常处理。这是就要用到throws
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        method();
    }
    public static void method() throws ArrayIndexOutOfBoundsException{  //仅仅把异常抛出去，并没有对其进行进行处理，真正处理还是try-- catch

        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);


    }
}
