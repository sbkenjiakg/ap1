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
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //studentクラスのインスタンスを作成する
        Student student = new Student();
        //インスタンスのフィールドに値を設定する
        student.name = "masahiro";
        student.score = 57;
        //インスタンスのフィールドを出力する
        System.out.println("NAME  :"+ student.name);
        System.out.println("SCORE :"+ student.score);
    }
    
}
