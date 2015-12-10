/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en01;

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
        int a[] = new int[5];
        a[0] = 3;
        a[1] = 7;
        a[2] = 5;
        a[3] = 9;
        a[4] = 2;
        
        System.out.println("BEFORE");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < a.length -1; i++) {
            int b = a[i];
            a[i] = a[i+1];
            a[i+1] = b;
        }
        
        
        System.out.println("AFTER");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

}
