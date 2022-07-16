//要求输出一行数组元素
package com.itheima.method;

public class text6 {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr={11,22,33,44,55};
        //调用方法
        printArray(arr);
    }
    //定义一个方法,用数组通用格式对数组进行遍历
    /*
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

     */

    public static void printArray(int[] arr){
        System.out.print("[");  //这里是print:为了显示在一行，println:自动换行
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i]+",");
        }
        System.out.print("]");
    }

}
