package com.itheima1.myArgs2;
//操作类
public class JumppingOperator {
    public void useJumpping(Jumpping j){//形参就是接口//Jumpping j=new Cat();
        j.jump();
    }
    public Jumpping getJumpping(){
        Jumpping j=new Cat();
        return j;
    }
}
