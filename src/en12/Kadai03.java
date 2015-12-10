/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Kadai03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Integer> map = new HashMap<>();
        map.put("Humburger", 100);
        map.put("Cheeseburger", 130);
        map.put("Teriyaki", 300);
        map.put("Fishburger", 390);
        map.put("French fries", 270);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> me : entries) {
            String key = me.getKey();
            int val = me.getValue();
            System.out.println(key + "　の値段 : " + val);
        }
        
                
    }

}
