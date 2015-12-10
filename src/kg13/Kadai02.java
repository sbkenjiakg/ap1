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
public class Kadai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "2015/07/14 10:47:51 c0114999ab Kadai01.java ok.";
        System.out.println(input.replaceAll("\\d", "+"));
        System.out.println(input.replaceAll("[^\\d]", "@" ));
        System.out.println(input.replaceAll("[a-zA-Z]+", "#"));
        System.out.println(input.replaceAll("\\W", "="));
        System.out.println(input.replaceAll("\\W$", "?"));
        
        
    }
    
}
