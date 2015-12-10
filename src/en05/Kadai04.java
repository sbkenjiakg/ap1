/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 文 字 列 を 入 力 し て く だ さ い > ");
        String str = scanner.nextLine();
        System.out.println(" 入 力 し た 文 字 列 は " + str + " で す");
// (1) 変 数 s t r の 英 文 字 ( a～z , A～Z ) を 「* 」 に 置 換 し ， 変 数 s t r 2 に 代 入 す る
        String str2 = str.replaceAll("[a-zA-Z]", "*");
        System.out.println(" 変 換 後 の 文 字 列 は " + str2 + " で す");

    }

}
