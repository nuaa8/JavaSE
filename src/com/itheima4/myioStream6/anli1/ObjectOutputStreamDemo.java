package com.itheima4.myioStream6.anli1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    对象序列化：就是将对象保存到磁盘中，或者在网络传输对象
    这种机制就是使用一个字节序列表示一个对象，该字节序列包含：对象的类型、对象的数据和对象中存储的属性信息。
    字节序列写到文件之后，相当于文件中持久保存了一个对象信息。
    对象序列化流：ObjectOutputStream
        构造方法：
            ObjectOutputStream(OutputStream out):创建一个写入指定的OutputStream的ObjectOutputStream
        序列化对象的方法：
            void writeObject(Object obj):将指定的对象写入OutputStream

       NoteSerializableException:抛出一个实力需要一个Serializable接口。序列化运行时或实例的类可能会抛出此异常
       类的序列化由实现java.io.Serializable接口的类启用的。不实现此接口的类将不会使任何状态序列化或反序列化

    注意：
    1.一个对象要想被序列化，该对象所属的类必须实现    Serializable   接口
    2.Serializable是一个   标记接口   ，实现该接口，不需要重写任何方法

 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //ObjectOutputStream(OutputStream out):创建一个写入指定的OutputStream的ObjectOutputStream
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("day04\\oo.txt"));

        //创建对象
        Student s=new Student("林青霞",30);

        //void writeObject(Object obj):将指定的对象写入OutputStream
        oos.writeObject(s);

        //释放资源
        oos.close();

    }
}
