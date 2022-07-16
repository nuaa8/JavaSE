package com.itheima5.myLambda.text2;
/*
    Lambda表达式的格式：（形式参数）->{代码块}
    Lambda表达式的使用前提
        1.有一个接口
        2.接口中有且仅有一个抽象方法
    练习1:
        1.定义一个接口（Eatable）,里面定义一个抽象方法:void eat()
        2.定义一个测试类（EatableDemo）,在测试类中提供2个方法
            一个是:useEatable(Eatable e)
            另一个是主方法:在主方法中调用useEatable
 */
public class EatableDemo {
    public static void main(String[] args) {
        //在主方法中调用useEatable
        Eatable e=new EatableImpl();
        useEatable(e);

        //匿名内部类
//        useEatable(new Eatable() {
//            @Override
//            public void eat() {
//                System.out.println("一天一个苹果，医生远离我");
//            }
//        });

        //Lambda表达式
     useEatable(()->{
         System.out.println("一天一个苹果，医生远离我");
     });
    }
    private static void useEatable(Eatable e){
        e.eat();
    }
}
