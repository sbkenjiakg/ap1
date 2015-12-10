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
public class Kadai04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 引数無しのコンストラクタを使ってインスタンスを作成
        RepeatingNumbers r1 = new RepeatingNumbers();
        // インスタンスr1 のgetNum () を呼び出すと、
        // 1, 6, 2, 5, 1, 6, 2, ... の順番で整数を返す
        System.out.println("5 回取り出します");
        for (int i = 0; i < 5; i++) {
            System.out.print(r1.getNum() + " ");
        }
        System.out.println("");
        System.out.println("10 回取り出します");
        for (int i = 0; i < 10; i++) {
            System.out.print(r1.getNum() + " ");
        }
        System.out.println("");
        System.out.println("----------------------------------------");
        




        // 引数3 つのコンストラクタでインスタンスを作成
        RepeatingNumbers r2 = new RepeatingNumbers(1, 2, 5);
        // インスタンスr2 のgetNum () を呼び出すと、
        // 引数で指定した3 つの整数（ この場合は1, 2, 5 ） を順番に返す
        System.out.println("10 回取り出します");
        for (int i = 0; i < 10; i++) {
            System.out.print(r2.getNum() + " ");
        }
        System.out.println("");
        System.out.println("15 回取り出します");
        for (int i = 0; i < 15; i++) {
            System.out.print(r2.getNum() + " ");
        }
        System.out.println("");
    }

}
