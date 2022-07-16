package com.itheima2.Arrays;
/*

    Arrays 类包含用于操作数组的各种方法（如排序和搜索）
        用类名直接访问该类的方法

    public static String toString(int[] a):返回指定数组的内容的字符串表示形式
    public static void sort(int[] a):按指定数字顺序排列指定的数组
 */
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr={24,69,80,57,13};

        System.out.println("排序前:"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后:"+Arrays.toString(arr));
    }
}
