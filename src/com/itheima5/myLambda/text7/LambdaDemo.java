package com.itheima5.myLambda.text7;
/*
    Lambda表达式和匿名内部类的区别
    所需类型不同
        1.匿名内部类：可以是接口，也可以是抽象类，还可以是具体类
        2.Lambda表达式：只能是接口
    使用限制不同
        1.如果接口中有且只有一个抽象方法法，可以使用Lambda表达式，也可以使用匿名内部类
        2.如果接口中有多余一个抽象方法，只能使用匿名内部类，而不能使用Lambda表达式
    实现原理不同
        1.匿名内部类：编译之后，产生一个单独的.class字节码文件
        2.Lambda表达式：编译之后，没有一个单独的.class字节码文件。对应的字节码会在运行的时候动态生成
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类
        /*
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });
        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("抽象类");
            }
        });
        useStudent(new Student(){
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });
        */
        //Lambda
//        useInter(()-> System.out.println("接口"));
//        useAnimal(()-> System.out.println("抽象类"));//抽象类不可以，必须是接口
//        useStudent(()-> System.out.println("具体类"));//抽象类不可以，必须是接口

    }
    private static void useStudent(Student s){
        s.study();
    }
    private static void useAnimal(Animal a){
        a.method();
    }
    private static void useInter(Inter i){
        i.show();
    }
}
