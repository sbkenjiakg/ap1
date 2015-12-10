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
public class Kadai04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "file- file-011 file-012 file-021 file-022";
        String output;
        
        System.out.println("Before:"+input);
        output = input.replaceAll("0.1", "NUM");
        System.out.println("After1:"+ output);
        
        output = input.replaceAll("\\d+", "NUM");
        System.out.println("After2:"+output);
        
        output = input.replaceAll("file-\\d+", "F");
        System.out.println("After3:" + output);
        
        output = input.replaceAll("file-(\\d+|)","F");
        System.out.println("After4:"+output);
    }
    
}
