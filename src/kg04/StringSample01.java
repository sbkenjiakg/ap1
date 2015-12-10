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
public class StringSample01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Tokyo University of Technology";
        
        System.out.println("入力：" + str);
        System.out.println("長さ：" + str.length());
        System.out.println("charAt,8：" + str.charAt(8));
        System.out.println("indexOf,i：" + str.indexOf("i"));
        System.out.println("contact：" + str.concat("（東京工科大学）"));
        System.out.println("startsWith,　T：" + str.startsWith("T"));
    }
    
}
