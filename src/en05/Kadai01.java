/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

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
        int n = 1234;
        double d = 1234.567;
        
        System.out.println(String.format("%8d",n));
        System.out.println(String.format("%,8d", n));
        System.out.println(String.format("%,08d", n));
        System.out.println(String.format("%.2f", d));
        System.out.println(String.format("%10.2f", d));
        System.out.println(String.format("%,10.2f", d));
    }
    
}
