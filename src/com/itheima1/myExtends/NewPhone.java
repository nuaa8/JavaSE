package com.itheima1.myExtends;
/*
    新手机
 */
public class NewPhone extends Phone {
   public void call(String name){
       System.out.println("开启视频功能");
      // System.out.println("给"+name+"打电话");//可以调用父类的方法，如下
       super.call(name);//调用父类的方法
   }
}
