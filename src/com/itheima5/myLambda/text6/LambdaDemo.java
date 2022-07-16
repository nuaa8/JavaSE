package com.itheima5.myLambda.text6;
/*
    Lambda表达式的注意事项
        1.使用Lambda必须要有接口，并且接口中有且仅有一个抽象方法
        2.必须有上下文环境，才能推导出Lambda对应的接口
            根据  局部变量的赋值   得知Lambda对应的接口:Runnable r=()-> System.out.println("Lambda表达式");
            根据  调用方法的参数   得知Lambda对应的接口：new Thread(()-> System.out.println("Lambda表达式")).start();
 */
public class LambdaDemo {
    public static void main(String[] args) {
//        useInter(()->{
//            System.out.println("好好学习，天天向上");
//        });
        //使用Lambda必须要有接口，并且接口中有且仅有一个抽象方法
        useInter(()-> System.out.println("好好学习，天天向上"));//省略版本

        //必须有上下文环境，才能推导出Lambda对应的接口
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类");
//            }
//        }).start();

//        Runnable r=()-> System.out.println("Lambda表达式");//赋值给一个接口，即让它知道上下文环境
//        new Thread(r).start();

        new Thread(()-> System.out.println("Lambda表达式")).start();//上面的省略版
    }
    private static void useInter(Inter i){
        i.show();
    }
}
