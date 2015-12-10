/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en04;

/**
 *
 * @author C0114112
 */
public class Kadai05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Heading heading = new Heading("Java Programing");
        System.out.println(heading.getDecoText());
        heading.setTag("*");
        System.out.println(heading.getDecoText());
        heading.setTag("_ _ _");
        System.out.println(heading.getDecoText());
    }
    
}
