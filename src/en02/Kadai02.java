/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

/**
 *
 * @author C0114112
 */
public class Kadai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] species = {" Tiger ", " Horse "};       // 種類をいれる配列変数
        int[] weight = {230, 450};                       // 重さをいれる配列変数
 
        Animal[] animals = new Animal[2];                // A n i m a l クラスの配列変数をanimals として要素数2 で作成

        for (int i = 0; i < animals.length; i++) {
            animals[i] = new Animal();                      // f o r 文を使って， a n i m a l s の各要素にA n i m a l クラスのインスタンスを代入し，
                                                            // メソッドM 1 により種類( species ) と重さ( weight ) を設定する
            animals[i].setParams(species[i], weight[i]);
        }
                                                            // メソッドM2 , M 3 を使って， a n i m a l s の各要素を出力する
        for (int i = 0; i < animals.length; i++) {
            System.out.println(" Species : " + animals[i].getSpecies()
                    + "\t, Weight : " + animals[i].getWeight());
        }
    }

}
