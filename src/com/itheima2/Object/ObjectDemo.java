package com.itheima2.Object;
/*
    Object是类层次结构的根，每个类都可以将Object作为超类，所有类直接或间接的继承自该类

    看方法的源码：
        选中方法，按下Ctrl+B

    建议所有子类重写此方法
    如何重写哪?  自动生成即可  ，即Student中的toString方法
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("林青霞");
        s.setAge(30);
        System.out.println(s);//com.itheima2.Object.Student@776ec8df    ，以后再直接输出对象的时候（例如对象s）,在该对象的类中，直接重写toString方法(和set,get方法一个地方生成)
        System.out.println(s.toString());//com.itheima2.Object.Student@776ec8df,结果同上
        /*
         public void println(Object x) { //x=s
        String s = String.valueOf(x);
        if (getClass() == PrintStream.class) {
            // need to apply String.valueOf again since first invocation
            // might return null
            writeln(String.valueOf(s));
        } else {
            synchronized (this) {
                print(s);
                newLine();
            }
        }
         */

        /*
        public static String valueOf(Object obj) { //obj=x
        return (obj == null) ? "null" : obj.toString();
    }
         */


        /*
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
         */
        System.out.println(s.getName()+","+s.getAge());
    }
}

