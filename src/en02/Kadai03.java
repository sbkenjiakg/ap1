/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

/**
 *
 * @author C0114112
 */
public class Kadai03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sphere[] spheres = new Sphere[3];
        
        for (int i = 0; i < spheres.length; i++) {
        spheres[i] = new Sphere(i+1);
        }
        for (int i = 0; i < spheres.length; i++) {
            System.out.print("Radius:"+ spheres[i].getRadius()+" ");
            System.out.println("Surface AreaA" + spheres[i].surface());
        }   
    }
    
}
