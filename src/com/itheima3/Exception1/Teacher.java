package com.itheima3.Exception1;

public class Teacher {
    public void checkScore(int score) throws ScoreException{
        if(score<0||score>100){
//            throw new ScoreException();//  无参构造方法,(抛出异常对象,自定义的异常)
            throw new ScoreException("你给的分数有误，分数应该在0-100之间");
        }else
        {
            System.out.println("分数正常");
        }
    }
}
