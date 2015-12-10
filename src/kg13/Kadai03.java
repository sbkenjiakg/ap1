/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13;

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
        int[] a = {50, 40, 30, 20, 10, 0};

        for (int i = 0; i < 10; i++) {
            try {
                int val = 100 / a[i];
                System.out.println("val = " + val);
            } catch (ArithmeticException ae) {
                System.out.println("0で割りました。");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("配列の境界を越えました。");
            }

        }
    }

}
