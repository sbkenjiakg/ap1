/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en03;

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
        Computer c1 = new Computer();
        Computer c2 = new Computer(" Linux ", 16);
        String s1 = c1.getSpec();
        String s2 = c2.getSpec();
        System.out.println(s1);
        System.out.println(s2);
    }

}
