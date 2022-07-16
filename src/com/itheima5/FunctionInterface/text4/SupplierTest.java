package com.itheima5.FunctionInterface.text4;

import java.util.function.Supplier;

/*
    练习:定义一个类(SupplierTest)，在类中提供两个方法
        一个方法是，int getMax(Supplier<Integer> sup)  用于返回一个int数组中的最大值
        一个方法是主方法，在主方法中调用getMax方法
 */
public class SupplierTest {
    public static void main(String[] args) {
        int[] arr={19,50,28,37,45};
        int maxValue=getMax(()->{
            int max=arr[0];

            for(int i=1;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
    //返回一个int数组中的最大值
    private static int getMax(Supplier<Integer> sup){
    return sup.get();
    }
}
