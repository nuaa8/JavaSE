//获取最值
package com.itheima.array;

public class text3 {
    public static void main(String[] args) {
        int[] arr={15,45,13,98,73,60};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("max="+max);
        System.out.println("min="+min);

    }
}
