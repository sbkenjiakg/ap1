/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

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
        List num = new ArrayList();
        Random ran = new Random();
        
        for (int i = 0; i < 20; i++) {
            num.add(ran.nextInt(21));
        }
        for (Iterator i = num.iterator(); i.hasNext();) {
            int a= (Integer) i.next();
            System.out.print(a + " ");
            
        }
    }
    
}
