/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en12;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Kadai02 {

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

        String pass = "Cheeseburger";
        int result = map.get(pass);
        System.out.println(pass + " の値段 : " + result);
        pass = "Fishburger";
        result = map.get(pass);
        System.out.println(pass + " の値段 : " + result);
                
    }

}
