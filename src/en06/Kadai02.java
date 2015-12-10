/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en06;

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
        String input ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String output;
        
        System.out.println("Before:"+ input);
        output = input.replaceAll("[G-P]", "*");
        System.out.println("After1:" + output);
        output = output.replaceAll("[n-v]", "*");
        System.out.println("After2:" + output);
        output = output.replaceAll("[2-4]", "*");
        System.out.println("After3:" + output);
    }
    
}
