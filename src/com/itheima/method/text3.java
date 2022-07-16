/* *
 *1.带返回值方法的定义
 *  public static 数据类型 方法名（参数）{
 *  return 数据；//数据是该返回值数据类型
 *  }
 *  2.带返回值方法调用
 * 格式1:方法名（参数）
 *  例如:isEvenNumber(5);
 * 格式2:数据类型 变量名=方法名（参数）
 * 例如:boolean flag=isEvenNumber(5);
 */
//需求:求两个数中的最大值
package com.itheima.method;

public class text3 {
    public static void main(String[] args) {
        int result=getMax(10,20);
        System.out.println(result);
    }
    public static int getMax(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }

}
