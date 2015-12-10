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
public class Kadai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 3; i >= -3; i--) {
            System.out.print("10 / " + i + " = ");
            try {

                System.out.println(10 / i);

            } catch (ArithmeticException e) {
                System.out.println(" 0で割りました");
            }
        }

    }

}
