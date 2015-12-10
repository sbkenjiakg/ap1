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
public class Kadai01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String istr = "1404-1, Katakuramachi.";
        String ostr;
        
        ostr = istr.replaceAll("ma", "*");//maという2文字が対象
        System.out.println(ostr);
        ostr = istr.replaceAll("[ma]", "*");//[]の中身のどれかが対象
        System.out.println(ostr);
        ostr = istr.replaceAll("[^ma]", "*");//[^]の中身以外が対象
        System.out.println(ostr);
        ostr = istr.replaceAll("[b-k]", "*");//[b-k]ｂからｋまでのアルファベットが対象、大文字小文字は区別される
        System.out.println(ostr);
        ostr = istr.replaceAll("a.", "*");//.は任意の文字。aと任意の文字の2文字が対象
        System.out.println(ostr);

    }

}
