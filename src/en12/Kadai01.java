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
public class Kadai01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, String> map = new HashMap<>();
        map.put("Math", "PASS");
        map.put("Physics", "PASS");
        map.put("English", "FAIL");
        map.put("Programing", "PASS");
        map.put("Marketing", "FAIL");

        String pass = "Physics";
        String result = map.get(pass);
        System.out.println(pass + "の成績" + result);
        pass = "English";
        result = map.get(pass);
        System.out.println(pass + "の成績" + result);
                
    }

}
