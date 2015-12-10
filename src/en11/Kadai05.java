/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en11;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Kadai05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Set adata = new TreeSet();

        adata.add("Java");
        adata.add("C");
        adata.add("Ruby");
        adata.add("Pascal");

        Set bdata = new TreeSet();
        bdata.add("Java");
        bdata.add("Python");
        bdata.add("C");
        bdata.add("Clojure");
        

        bdata.retainAll(adata);

        
        for (Iterator<String> i = bdata.iterator(); i.hasNext();) {
            String str = i.next();
            System.out.println(str);
        }
    }
    
}
