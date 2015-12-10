/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg04;

/**
 *
 * @author C0114112
 */
public class StringSample04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double d = 3.141592653689;
        
        String str1 = String.format("入力：%f%n", d);
        String str2 = String.format("入力：%8.3f%n", d);//全体で８桁小数点以下３桁
        
        System.out.println(str1 + str2);
                
    }
    
}
