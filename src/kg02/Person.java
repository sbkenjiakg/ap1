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
class Person {

    private String name; // 名前
    private double height; // 身長[ m]
    private double weight; // 体重[ kg]

    public Person(String nm) {
        this.name = nm;
    }   // (1 ') C1: 引数nm の値をフィールドname を設定するコンストラクタ

    public String getName() {
        return name;
    }   // M2: name をかえすgetName メソッド

    public void setParams(double h, double w) {
        this.height = h;
        this.weight = w;
    }   // (3 ') M3: height とweight を同時に設定するsetParams メソッド

    public double getBMI() {
        return weight / (height * height);
    }// (4 ') M4: BMI ( Body Mass Index ) を計算してかえすgetBMI メソッド
}
