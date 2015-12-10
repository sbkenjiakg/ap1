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
public class StringSample03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 3000;
        
        String str1 = String.format("入力：%d%n", n);
        String str2 = String.format("入力：%,d%n", n);
        String str3 = String.format("入力：%06d&n",n);
        String str4 = String.format("入力：%6d%n",n);
    }
}
