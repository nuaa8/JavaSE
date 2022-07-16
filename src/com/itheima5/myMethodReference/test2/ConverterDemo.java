package com.itheima5.myMethodReference.test2;
/*
    Lambda表达式支持的方法引用
    常见的引用方式：
        引用类方法
            格式：类名::静态方法  范例：Integer::parseInt
        引用对象的实例方法(其实就是引用类中的成员方法)
            格式：对象::成员方法     范例：“HelliWorld”::toUpperCase  String类中的方法： public String toUpperCase() 将此String所有字符转换成大写
        引用类的实例方法（其实就是引用类中的成员方法）
            格式：类名::成员方法     范例：String::substring   String类中的方法：public String substring(int beginIndex,int endIndex) 从beginIndex开始到endIndex结束，截取字符串。返回一个子串，
            子串的长度endIndex-beginIndex
        引用构造器（其实就是引用构造方法）
            格式：类名::new  范例：Student::new

    练习
        1.定义一个接口（Converter）,里面定义一个抽象方法
            int convert(String s)
        2.定义一个测试类（ConverterDemo）,在测试类中提供了两个方法
            一个方法是：useConverter(Converter c)
            一个方法是主方法，在主方法中调用useConverter方法

    引用类方法
            格式：类名::静态方法  范例：Integer::parseInt
 */
public class ConverterDemo {
    public static void main(String[] args) {
        //在主方法中调用useConverter方法
//        useConverter((String s)->{
//            return Integer.parseInt(s);
//        });
        useConverter(s -> Integer.parseInt(s));

        //引用类方法
        useConverter(Integer::parseInt);

        //Lambda表达式被类方法代替的时候，它的形参全部传递给静态方法作为参数

    }
    private static void useConverter(Converter c){
        int number= c.convert("666");
        System.out.println(number);
    }
}
