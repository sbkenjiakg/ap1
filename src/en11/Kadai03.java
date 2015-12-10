/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en11;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Kadai03 {
    public static void main(String args[]){
        TreeSet data = new TreeSet();
        data.add("lemon");
        data.add("grape");
        data.add("orange");
        data.add("grape");
        
        for(Iterator<String> i = data.iterator();i.hasNext();){
            String str = i.next();
            System.out.println(str);
        }
    }
}
