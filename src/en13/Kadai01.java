/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en13;

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
        Student s0 = new Student (" C0116991 ", 58);
        System.out.println(s0);

        Student s1 = new Student(" C0116992 ", 76);
        System.out.println(s1);

        s1 = s0;
        s1.adjust(3); // s 1 の 得 点 を 3 増 や す

        System.out.println(s0);
        System.out.println(s1);

    }

}
