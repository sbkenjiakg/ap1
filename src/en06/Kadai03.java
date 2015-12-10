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
public class Kadai03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "I like Java. I want to become a SE. Therefor I must study Java.";
        String output;
        
        System.out.println("Before:"+input);
        output = input.replaceAll("I", "You");
        System.out.println("After1:"+ output);
        
        output = input.replaceAll("^I", "We");
        System.out.println("After2:"+output);
        
        output = input.replaceAll("Java.$", "Python.");
        System.out.println("After3:"+output);
    }

}
