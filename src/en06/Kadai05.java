/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author C0114112
 */
public class Kadai05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File(".\\src\\en06\\data2.txt");
        try {
// S c a n n e r ク ラ ス の 変 数 sc を 宣 言 し て イ ン ス タ ン ス を 作 成
// F i l e ク ラ ス の 変 数 f を 引 数 に し て data *. txt を 読 み 込 み
            Scanner sc = new Scanner(f);
// S c a n n e r クラ スの useDelimiter () を 用 い て
// 指 定 し た 引 数 で 文 字 列 を 配 列 要 素 に 分 割 （ こ の 場 合 改 行\ n が 区 切 り 文 字 ）
            sc.useDelimiter("\\n");
// u s e D e l i m e t e r で 分 割 し た 要 素 を 順 番 に 読 み 込 み
// hasNext () は 要 素 が あ れ ば true , な け れ ば f a l s eを返す
            while (sc.hasNext()) {
// S t r i n g 型 の 変 数 next に 要 素 を 代 入
                String next = sc.next();
// (1) 出 力 例 ， こ こ を replaceAll () で 置 換 に 置 き 換 え る
                next = next.replaceAll("[\\x01-\\x7E]\\S|>","");
                //next = next.replaceAll("(// )|[^\\x01-\\x7E]", "");
                
                System.out.println(next);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }

}
