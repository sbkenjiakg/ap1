/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg01;

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
        for (int i = 1; i < 51; i++) {
            if (i%3==0 ||i%7==0 ) {
                System.out.print(i+" ");
            }
        }
    }
    
}
