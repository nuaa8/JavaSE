package com.itheima3.myMap;

import java.util.HashMap;
import java.util.Map;

/*
    Map集合（是一个接口，单独不能实例化，需要具体的实现类HashMap）概述
        Interface Map<K,V>:k:键的类型，V:值的类型
        V put (K key,v value):将指定的值与该映射中的指定键相关联
        将键映射到值得对象:不包含重复的建:每个键可以映射到最多一个值
        举例:学生的学号和姓名
            001  林青霞
            002  张曼玉
            003  王祖贤
    创建Map集合的对象
        多态的方式
        具体的实现类HashMap
 */
public class MapDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map=new HashMap<String,String>();

        //V put (K key,v value):将指定的值与该映射中的指定键相关联
        map.put("001","林青霞");
        map.put("002","张曼玉");
        map.put("003","王祖贤");
//        map.put("003","胡慧中");//覆盖003的王祖贤

        //输出集合对象
        System.out.println(map);//直接输出
    }
}
