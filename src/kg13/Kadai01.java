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
public class Kadai01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Tokyo University of Technology";
        
        System.out.println(str.charAt(15));
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(6, 9));
        System.out.println(str.indexOf("o",9));
        String[] str1 = new String[4];
        
        str1 = str.split(" ");
        System.out.println(str1[2]);
    }
    
}
