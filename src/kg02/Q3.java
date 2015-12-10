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
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box b;
        b = new Box(); // B o x クラスのインスタンスを作成する
        b.setWidth(5); // 幅と高さを設定する
        b.setHeight(3);
        int area = b.getArea(); // 面積を取得する
        System.out.println(" AREA : " + area); // 面積を出力する
    }

}
