/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en03;
import java.lang.String;

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
        String file = " Kadai02 . java ";
        System.out.println(" ファイル名: " + file);

        System.out.println("文字列の長さ : " + file.length());          // 1. file の長さを出力する

        int n = file.lastIndexOf('a');
        System.out.println("文字a が最後に出現する位置 : " + n);// 2. 'a' が最後に出現する位置を出力する

        String subName = file.substring(6, 16);
        System.out.println("2-4 文字目を取り出すと " + subName);// 3. 2 - 4 文字目を取り出し出力する( 先頭を0 番目とする)

        if (file.endsWith(". java ") == true) {
            System.out.println("「Java のソースファイルです」");
        } else {
            System.out.println("「Java のソースファイルではありません」");
        }
// 4. 文字列の最後が. java で終わっていた場合は
// 「Java のソースファイルです」
// そうでない場合は
// 「Java のソースファイルではありません」
// と出力する
    }

}
