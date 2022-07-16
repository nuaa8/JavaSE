package com.itheima1.myInnerClass1;

public class Ouder {
    private int num=10;
    public class Inner{
       public void show(){     System.out.println(num);
       }
    }
//  一般使用下面的方法，内部一般不想让别人访问，设置为private
//    private class Inner{
//        public void show(){
//            System.out.println(num);
//        }
//    }
//
//    public void method(){
//        Inner i=new Inner();
//        i.show();
//    }


}
