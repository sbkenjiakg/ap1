/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author C0114112
 */
public class ArraySample04 {
    public static void main(String[] args) {
        List data = new ArrayList();
        
        data.add("word");
        data.add(2000);
        Student st = new Student("Taro", 1);
        data.add(st);
        
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        for (Iterator i = data.iterator(); i.hasNext();) {
            System.out.println(i.next());
            
        }
        for(Object obj : data)
            System.out.println(obj);
    }
}
