//遍历数组元素
package com.itheima.array;

public class text2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)//获取数据元素数量的格式:数组名.length
            System.out.println(arr[i]);
        System.out.println("----------");
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0)
                System.out.println(arr[j]);
        }
    }
}
