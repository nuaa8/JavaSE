package com.itheima3.myMap.anli5;
/*
    需求：
        键盘录入一个字符串，要求统计字符串中每个字符串出现的次数
        举例：键盘录入“aababcabcdabcde”  在控制台输出：“a(5)b(4)c(3)d(2)e(1)’”
    思路：
        1.键盘录入一个字符串
        2.创建HashMap集合，键是Character,值是Integer
        3.遍历字符串，得到每一个字符
        4.拿得到的每一个字符作为键到HashMap集合中找对应的值，看其返回值
            如果返回是null：说明该字符在HashMap集合中不存在，就把该字符作为键，1作为只存储
            若果返回不是nul：说明该字符在HashMap集合中，把该值加1，然后重新存储该字符串和对应的值
        5.遍历HashMap集合，得到键值，按照要求进行拼接
        6.输出结果
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //创建HashMap集合，键是Character,值是Integer
        HashMap<Character, Integer> hm=new HashMap<>();//无顺序排列，输入：fqylovelingqingxia，结果：q(2)a(1)e(1)f(1)v(1)g(2)x(1)y(1)i(3)l(2)n(2)o(1)
//        TreeMap<Character,Integer> hm=new TreeMap<>();//有顺序排列，输入：fqylovelingqingxia，结果：a(1)e(1)f(1)g(2)i(3)l(2)n(2)o(1)q(2)v(1)x(1)y(1)

        //遍历字符串，得到每一个字符(重点，重点，重点)
        for(int i=0;i<line.length();i++){
            char key = line.charAt(i);

            //拿得到的每一个字符作为键到HashMap集合中找对应的值，看其返回值
            Integer value = hm.get(key);
            //如果返回是null：说明该字符在HashMap集合中不存在，就把该字符作为键，1作为只存储
            if(value==null){
                hm.put(key,1);
            }else {
                //若果返回不是nul：说明该字符在HashMap集合中，把该值加1，然后重新存储该字符串和对应的值
                value++;
                hm.put(key,value);
            }




        }

        //遍历HashMap集合，得到键值，按照要求进行拼接
        StringBuilder sb=new StringBuilder();

        Set<Character> keySet=hm.keySet();
        for (Character key:keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        String result = sb.toString();

        //输出结果
        System.out.println(result);


    }
}
