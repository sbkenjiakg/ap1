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
public class Kadai07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle t = new Triangle(7,24,25);
        //Triangle t = new Triangle(6,25,35);
        if(t.isTriangle()){
            System.out.println("t : " + t.getArea());
        }else{
            System.out.println("t is not a triangle!");
        }
    }
    
}
