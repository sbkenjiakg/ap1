/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg05;

/**
 *
 * @author C0114112
 */
public class Practice03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String stri = "          Hello!          Hello!";
        String ostr;
        ostr = stri.replaceAll("^ *", "");
        System.out.println(ostr);
        
        ostr = stri.replaceAll(" *\\w+!$","Goodbye!");
        System.out.println(ostr);
        
        ostr = stri.replaceAll("^ *\\w+", "Good!");
        System.out.println(ostr);
    }
    
}
