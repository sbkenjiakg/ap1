/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg11;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class CollectionSample01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String,String> map = new HashMap<>();
        
        map.put("cat", "猫");
        map.put("dog", "犬");
        map.put("fish", "魚");
        
        String key = "cat";
        String result = map.get(key);
        System.out.println(key + " に関連付けられた値は " + result + " です");
    }
    
}
