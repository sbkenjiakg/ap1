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
public class Kadai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String istr= "1404-1, Katakuramachi";
        String ostr;
        
        ostr = istr.replaceAll("\\d", "+");//数字を＋に変換
        System.out.println(ostr);
        
        ostr = istr.replaceAll("\\D", "+");//数字以外を＋に変換
        System.out.println(ostr);
        
        ostr = istr.replaceAll("\\w", "@");//全ての単語構成文字を対象
        System.out.println(ostr);
        
        ostr = istr.replaceAll("\\W", "@");//単語構成文字以外を対象
        System.out.println(ostr);
        
        ostr = istr.replaceAll("\\s", "/");
        System.out.println(ostr);
        
        ostr = istr.replaceAll("\\S", "/");
        System.out.println(ostr);
    }
    
}
