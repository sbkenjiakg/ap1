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
public class Kadai04a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8, 4, 6};

        int b[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            b[a[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < b[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


