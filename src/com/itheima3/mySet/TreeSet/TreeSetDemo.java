package com.itheima3.mySet.TreeSet;
/**
    自然排序Comparable的使用
        结论：
        1.用TreeSet集合存储自定义对象，无参构造方法使用的是   自然排序  对元素进行排序的
        2.自然排序，就是   让元素所属的类实现Comparable接口   ，重写compareTo(T o)方法
        3.重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写
 */
import java.util.TreeSet;

/*
    存储学生对象并遍历，创建集合使用无参构造方法
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts=new TreeSet<>();

        //创建学生对象
        Student s1=new Student("xishi",29);
        Student s2=new Student("wangzhaojun",28);
        Student s3=new Student("diaochan",30);
        Student s4=new Student("yangyuhuan",33);


        //按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
        Student s5=new Student("linqingxia",33);
        Student s6=new Student("linqingxia",33);



        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历集合
        for(Student s:ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
