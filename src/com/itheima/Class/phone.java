/*//类的定义步骤
      定义类
      编写类的成员变量
      编写类的成员方法
手机类：
    类名（）:
    手机（Phone）
    成员变量:
    品牌（brand）
    价格（price）
    成员方法:
    打电话（call）
    发短信（sendMessage）
 *
 */
package com.itheima.Class;

public class phone {
    //成员变量
    String brand;
    int price;
    //成员方法
    public void call(){
        System.out.println("打电话");

    }

    public phone() {
    }

    public phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void sendMessage(){
        System.out.println("发短信");
    }

}


