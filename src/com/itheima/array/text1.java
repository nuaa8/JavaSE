//数组元素初始化
/*格式：

     数组类型[] 变量名=new 数据类型[数组长度]

 */
package com.itheima.array;

public class text1 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
            System.out.println(arr);
        System.out.println(arr[0]);//输出默认值:整数是0
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[0]=100;
        arr[1]=200;
        System.out.println(arr[0]);//100
        System.out.println(arr[1]);//200



    }
}
