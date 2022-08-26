package com.itheima4.myioStream10;

import java.util.Properties;
import java.util.Set;

/*
    Properties概数：
        1.是一个Map体系的集合类
        2.Properties可以保存到 流中 或从 流中 加载
    Properties作为Map集合的使用
 */
public class propertiesDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop=new Properties();

        //存储元素
        prop.put("itheima01","林青霞");
        prop.put("itheima02","张曼玉");
        prop.put("itheima03","王祖贤");

        //遍历集合
        Set<Object> keySet=prop.keySet();
        for (Object key:keySet){
            Object value=prop.get(key);
            System.out.println(key+","+value);
        }

    }
}
