/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en03;

import java.util.Random;

/**
 *
 * @author C0114112
 */
public class Kadai03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "2015";
        System.out.println(" 今年は" + str + " 年です");
        
        Random rnd = new Random();
        
        // 処理3.1
        int y2 = Integer.parseInt(str) + rnd.nextInt(6);// 0 - 5 の乱数をstr の数値に足してint 型変数y2 に代入する
        System.out.println(" 次に東京で大雪が降るのは" + y2 + " 年です");
    }

}
