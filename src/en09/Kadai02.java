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
public class Kadai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List data = new ArrayList();

        System.out.println("=== リストに要素を3つ追加します ===");
        data.add("I");
        data.add("am");
        data.add("Taro");
        boolean a = false;
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i) + " ");
        }
        System.out.println("");

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == "Jiro") {
                a = true;
                break;
            } else {
                a = false;
            }
        }

        if (a == false) {
            System.out.println("検索文字Jiroは見つかりませんでした。");
        } else {
            System.out.println("検索文字Jiroがありました。");
        }
        System.out.println("=== 要素を1つ上書きします ===");
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i) + " ");
        }
        System.out.println("");

        data.set(data.indexOf("Taro"), "Jiro");
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == "Jiro") {
                a = true;
                break;
            } else {
                a = false;
            }
        }

        if (a = false) {
            System.out.println("検索文字Jiroは見つかりませんでした。");
        } else {
            System.out.println("検索文字Jiroがありました。");
        }
    }

}
