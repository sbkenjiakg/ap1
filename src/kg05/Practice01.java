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
public class Practice01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String istr = "School of Computer Science.";
        String ostr;
        
        ostr = istr.replaceAll("oo", "-");
        System.out.println(ostr);
        
        ostr =istr.replaceAll("[o ]", "*");
        System.out.println(ostr);
        
        ostr = istr.replaceAll("\\.", "?");
        System.out.println(ostr);
        
    }
    
}
