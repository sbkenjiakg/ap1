/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author C0114112
 */
public class Kadai04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List box = new ArrayList();
        box.add("If");
        box.add("you");
        box.add("can");
        box.add("dream");
        box.add("it");
        box.add(",");
        box.add("you");
        box.add("can");
        box.add("do");
        box.add("it");
        box.add(".");
        
        String str ="If you can dream it , you can do it .";
        str = str.replaceAll("\\.","");
        String words[] = str.split(" ");
        

        System.out.println("=== 文章を出力します ===");
        for (int i = 0; i < box.size(); i++) {
            System.out.print(box.get(i) + " ");
        }
        System.out.println("");

        System.out.println("=== 文章から\",\"を削除します ===");
        box.remove(box.indexOf(","));
        for (int i = 0; i < box.size(); i++) {
            System.out.print(box.get(i) + " ");
        }
        
        System.out.println("");
        System.out.println("=== 文章から\".\"を削除します ===");
        box.remove(box.indexOf("."));
        for (int i = 0; i < box.size(); i++) {
            System.out.print(box.get(i) + " ");
        }
        System.out.println("");

        System.out.println("=== List内の要素を出力します ===");
        for (int i = 0; i < box.size(); i++) {
            System.out.println(box.get(i));
        }

        System.out.println("=== Iteratorniにより\"can\"を削除します ===");
        for (Iterator i = box.iterator(); i.hasNext();) {
            if ((String) i.next() == "can") {
                i.remove();
            }
        }
        
        System.out.println("=== Iteratorniにより\"can\"を削除します ===");
        /*for (Iterator i = wordData.iterator(); i.hasNext();) {
            String word = i.next();
            String removeWord = "can";
            if (word.equals(removeWord)) {
                i.remove();
            }
        }*/
        System.out.println("=== List内の要素を出力します ===");
        for (int i = 0; i < box.size(); i++) {
            System.out.println(box.get(i));
        }
    }

}
