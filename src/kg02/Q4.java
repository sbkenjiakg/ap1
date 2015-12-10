/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg02;

/**
 *
 * @author C0114112
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1;
        String str;     // 手順(2) でとりだした名前をいれる変数
        double bmi;     // 手順(4) でとりだしたB M I をいれる変数

        p1 = new Person("masahiro");    // (1) コンストラクタC 1 を使ってインスタンスを作成し， p 1 で参照する
        // このインスタンスのフィールドname は" masahiro " にする

        str = p1.getName();             // (2) メソッドM 2 を使ってp1 の名前をとりだし， str に代入する

        p1.setParams(1.65, 56.8);// (3) メソッドM 3 を使ってp1 の身長に1.65 ， 体重に56.8 を設定する

        bmi = p1.getBMI();// (4) メソッドM 4 を使ってp1 のBMI をとりだし， bmi に代入する

        // str とbmi を出力する
        System.out.println(" NAME : " + str);
        System.out.println(" BMI : " + bmi);
    }

}
