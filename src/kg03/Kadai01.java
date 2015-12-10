/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg03;

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
        String istr ="Tokyo University of Technology";
        
        char c =istr.charAt(2);
        System.out.println("char at 2 is " + c);
        
        String ostr = istr.toLowerCase();
        System.out.println(ostr);
        
        ostr = istr.toUpperCase();
        System.out.println(ostr);
        
        int n = istr.indexOf('o');
        System.out.println("index of 'o' is " + n);
        
        n = istr.lastIndexOf('o');
        System.out.println("last index of 'o' is " + n);
        
        ostr = istr.substring(6, 16);
        System.out.println("substring is " + ostr);
        
        if (ostr == "University") {
            System.out.println("the same");
        }else{
            System.out.println("not the same");
        }
        
        if(ostr.equals("University") ){
            System.out.println("the same");
        }else{
            System.out.println("not the same");
        }
    }
    
}
