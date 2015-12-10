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
public class Kadai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "c0114001, c0114002, c0115001, e0114900, m0115999";
        
        System.out.println(str1.replace("c", "C"));
        System.out.println(str1.replace("c0114","H26_" ));
        System.out.println(str1.replaceAll("[cem]", "*"));
        
    }
    
}
