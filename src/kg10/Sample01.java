/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Sample01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List data = new ArrayList();
        
        String str = "abc";
        Person p =new Person("taro",20);
        int a = 10;
        data.add(str);
        data.add(p);
        data.add(a);
        
        for(Iterator i = data.iterator(); i.hasNext();){
            Object obj = i.next();
            System.out.println(obj);
        }
        
    }
    
}
