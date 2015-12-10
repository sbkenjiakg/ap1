/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg12;

/**
 *
 * @author ogiya
 */
public class Kadai01 {

    public static void main(String[] args) {
        String str1 = "taro";
        String str2 = "jiro";
        int n1 = 5;
        int n2 = 3;

        Person01 taro = new Person01(str1, n1);
        taro.start();

        System.out.println(str1 + "は" + n1 + "数え始めました");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }

        Person01 jiro = new Person01(str2, n2);
        jiro.start();

        System.out.println(str2 + "は" + n2 + "数え始めました");
    }

}
