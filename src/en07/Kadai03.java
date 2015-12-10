/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en07;

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

        int[] a = {10, 20, 30};
        int[] b = {2, 0, -2};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("a[" + i + "] / b[" + j + "] = ");
                try {
                    System.out.println(a[i] / b[j]);
                } catch (ArithmeticException e) {
                    System.out.println("0で割りました");
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("配列の境界を超えました");
                }

            }

        }
    }
}


