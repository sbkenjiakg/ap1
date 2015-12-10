/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en08;

/**
 *
 * @author C0114112
 */
public class Kadai00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "abcdefg";
        System.out.println(" INPUT 1 : " + s1);
        System.out.println(" OUTPUT1 : " +s1.replaceAll("[bef]", "*")) ;
        System.out.println(" OUTPUT2 : " +s1.replaceAll("[^bef]", "*"));
        System.out.println(" OUTPUT3 : " +s1.replaceAll("[b-d]", "-")) ;
        
        String s2 = "a1B23C456d7";
        System.out.println("\n INPUT 2 : " + s2);
        System.out.println(" OUTPUT4 : " +s2.replaceAll("[0-9]", "?")) ;
        System.out.println(" OUTPUT5 : " +s2.replaceAll("[a-zA-Z]", "+")) ;
        System.out.println(" OUTPUT6 : " +s2.replaceAll("[a-zA-Z][0-9][0-9]", "*"));
    }

}
