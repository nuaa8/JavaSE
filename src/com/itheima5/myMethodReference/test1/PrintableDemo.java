package com.itheima5.myMethodReference.test1;
/*
    需求：
        1.定义一个接口（Printable）：里面定义一个抽象方法：void printString(String s);
        2.定义一个测试类（PrintableDemo），在测试类中提供两个方法
            一个方法是：usePrintable(Printable p)
            一个方法是主方法，在主方法中调用usePrintable方法

        方法引用符： ::
        Lambda表达式：usePrintable(s -> System.out.println(s));
            分析：拿到参数s之后通过Lambda表达式，传递给System.out.println方法去处理
        方法引用：usePrintable(System.out::println);
            分析（非常重要，非常重要，非常重要）：直接使用System.out中的println方法来取代Lambda，代码更加的简洁

        推导与省略
        1.如果使用Lambda，那么根据“可推到就是可省略”的原则，无需指定参数类型，也无需指定重载的形式，它们都将自动推导
        2.如果使用方法引用，也是同样可以根据上下文进行推导
        3.方法引用是Lambda的孪生兄弟

 */
public class PrintableDemo {
    public static void main(String[] args) {
        //在主方法中调用usePrintable方法
//        usePrintable((String s)->{
//            System.out.println(s);
//        });

        usePrintable(s -> System.out.println(s));
//        System.out.println("爱生活，爱java");

        //方法引用符： ::     (直接将参数s，传给方法println，只是这个动作并没有显示出来)
        usePrintable(System.out::println);
        //分析：直接使用System.out中的println方法来取代Lambda，代码更加的简介
        //一个原则：可推导的就是可省略的

    }
    public static void usePrintable(Printable p){
        p.printString("爱生活，爱java");
    }
}
