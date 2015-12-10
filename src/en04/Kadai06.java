/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en04;

import sun.io.ByteToCharEUC_JP_LINUX;

/**
 *
 * @author C0114112
 */
public class Kadai06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = Calc.add(2,3,6);
        System.out.println(sum);
        
        double ave = Calc.ave(2,3,6);
        System.out.println(ave);
        
        int fac = Calc.fact(5);
        System.out.println(fac);
        
        int fac0 = Calc.fact(0);
        System.out.println(fac0);
    }
    
}
