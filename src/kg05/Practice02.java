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
public class Practice02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stir ="•“[18/May/2015:22:48:52 +0900] GET /favicon.ico HTTP/1.1";
        String ostr;
        
        ostr = stir.replaceAll("\\d"," ");
        System.out.println(ostr);
        
        ostr = stir.replaceAll("\\w", "?");
        System.out.println(ostr);
        
        ostr = stir.replaceAll("\\s.", "--");
        System.out.println(ostr);
    }
    
}
