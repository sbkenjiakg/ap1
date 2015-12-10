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
public class Kadai01 {

    public static void main(String[] args) {
        String input = "Japan is an island country.";
        String output;
        System.out.println("Before:" + input);
        output = input.replaceAll("an", "**");
        System.out.println("After1:" +output);
        output = input.replaceAll("[an]", "*");
        System.out.println("After2:" +output );
        output = input.replaceAll("an.","***");
        System.out.println("After3:" + output);
        output = input.replaceAll("\\s","-");
        System.out.println("After4:"+ output);
        output = input.replaceAll("\\w", "-");
        System.out.println("After5:"+ output);
    }
}
