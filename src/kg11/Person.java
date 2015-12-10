/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg11;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private double hight;
    private double weight;
    
    Person(String n,double h,double w){
        this.name = n;
        this.hight = h;
        this.weight = w;
    }
    /**
     * このインスタンスのBMI値を計算して値を返します
     * @return 体重[㎏]/(身長[m]*身長[m])
     */
    public double getBMI(){
        return (this.weight/(this.hight*this.hight));
    }
    /**
     * このインスタンスのフィールド値であるweight(体重)の数値から　引数wの数値分だけ減らします
     * @param w 減らしたい量
     */
    public void shapeUp(double w){
         this.weight = this.weight - w;
    }
}
