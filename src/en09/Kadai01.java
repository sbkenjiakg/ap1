/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en09;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author C0114112
 */
public class Kadai01 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // TODO code application logic here
        List data = new ArrayList();
        System.out.println("=== リストに要素を3つ追加します ===");
        data.add("Tokyo");
        data.add("of");
        data.add("Technology");
        System.out.println("要素数：" + data.size());
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i) + " ");
        }
        System.out.println("");
        
        System.out.println("=== リストに要素を1つ追加します ===");
        data.add(1, "University");
        System.out.println("要素数：" + data.size());
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i) + " ");
        }
        System.out.println("");

    }

}
