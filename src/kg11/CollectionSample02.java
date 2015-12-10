/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class CollectionSample02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, String> map = new HashMap<>();

        map.put("cat", "猫");
        map.put("dog", "犬");
        map.put("fish", "魚");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> me : entries) {
            String key = me.getKey();
            String val = me.getValue();
            System.out.println("key: " + key + " , value " + val);
        }

    }
}
