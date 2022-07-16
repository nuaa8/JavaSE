package com.itheima5.Stream.text2;

import java.util.*;
import java.util.stream.Stream;

/*
    Stream流的常见生成方式
        1.Collection体系的集合可以使用默认方法stream()生成流
            default Stream<E> stream()
        2.Map体系的集合间接的生成流
        3.数组可以通过Stream接口的静态方法of(T...values)生成流
 */
public class StreamDemo {
    public static void main(String[] args) {
        //Collection体系的集合可以使用默认方法stream()生成流
        List<String> list=new ArrayList<String >();
        Stream<String > listStream=list.stream();

        Set<String> set=new HashSet<>();
        Stream<String> setStream=set.stream();

        //Map体系的集合间接的生成流
        Map<String,Integer> map=new HashMap<>();
        Stream<String> keyStream=map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Set<Map.Entry<String, Integer>> entryStream = map.entrySet();

        //数组可以通过Stream接口的静态方法of(T...values)生成流
        String[] strArray={"hello","world","java"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<String> strArrayStream2 = Stream.of("hello", "world", "java");
        Stream<Integer> intStream = Stream.of(10, 20, 30);
    }
}
