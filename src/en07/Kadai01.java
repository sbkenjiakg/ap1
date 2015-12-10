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
public class Kadai01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {10, 20, 30};
        int b = 2;
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            try {
            ans = a[i] / b;
                System.out.println(" ans = " + ans);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("配列の上限を超えました");
            }
        }
    }

}
