/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en04;
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
        Random r = new Random();
        int n = r.nextInt(99);
        if (n>=80) {
            System.out.println("A");
        }else if (n>=70) {
            System.out.println("B");
        }else if (n>=60) {
            System.out.println("C");
        }else{
            System.out.println("D");
        }
        System.out.println(n);
    }
    
}
