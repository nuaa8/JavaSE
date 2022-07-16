package com.itheima5.myLambda.text5;

import com.itheima5.myLambda.text4.Addable;

/*
    Lambda表达式的省略模式
    省略规则：
        1.参数的类型可以省略,当有多个参数时，不能只省略一个参数
        2.如果参数有且只有一个，那么小括号可以省略
        3.如果代码块的语句只有一条，可以省略大括号和分号,如果有return，return也要省略
 */
public class LambdaDemo {
    public static void main(String[] args) {
        useAddable((int x,int y)->{
            return x+y;

        });
        //参数的类型可以省略,当有多个参数时，不能只省略一个参数
        useAddable((x, y) -> {
            return x-y;
        });

        useFlyable((String s)->{
            System.out.println(s);
        });

        //参数的类型可以省略
//        useFlyable((s)->{
//            System.out.println(s);
//        });
        //如果参数有且只有一个，那么小括号可以省略
//        useFlyable(s->{
//            System.out.println(s);
//        });

        //如果代码块的语句只有一条，可以省略大括号和分号
        useFlyable(s-> System.out.println(s)
        );

        //如果代码块的语句只有一条，可以省略大括号和分号,如果有return，return也要省略
        useAddable((x, y) -> x-y);
    }
    private static void useFlyable(Flyable f){
        f.fly("风和日丽，晴空万里");
    }

    private static void useAddable(Addable a){
        int sum=a.add(10,20);
        System.out.println(sum);
    }
}
