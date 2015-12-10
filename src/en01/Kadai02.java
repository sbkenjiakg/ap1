/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en01;

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
        int r = new java.util.Random().nextInt(101);
        if (r>=90) {
            System.out.println("得点：" + r);
            System.out.println("S");
        }else if (r<90 && r>=80) {
            System.out.println("得点：" + r);
            System.out.println("A");
        }else if (r<80 && r>=70) {
            System.out.println("得点：" + r);
            System.out.println("B");
        }else if (r<70 && r>=60) {
            System.out.println("得点：" + r);
            System.out.println("C");
        }else{
            System.out.println("得点：" + r);
            System.out.println("D");
        }
    }
    
}
