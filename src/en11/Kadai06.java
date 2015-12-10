/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Kadai06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str; // input .txt を1 行ずつ処理するときに用いる変数
        String[] array; // split () の戻り値を格納する変数
        Set words = new TreeSet();// (1) 重複なしで自動ソートさせるSet を宣言し， インスタンスを作成
        // 例外処理
        try {
            // input . txt にパスを通す
            BufferedReader br = new BufferedReader(new FileReader("src/en11/input.txt"));
            // input . txt を1 行ずつ読み込み， 単語に分割して変数words に追加
            while ((str = br.readLine()) != null) {
                // (2) 変数str を小文字に変換
                str = str.toLowerCase();
                // (3) 変数array に変数str の文字列を単語に分割して代入
                array = str.split("\\W+");
                // 区切り文字の指定で連続する単語構成文字以外を指定するとよい
                // (4) 変数words に変数array の要素を追加
                words.addAll(Arrays.asList(array));
            }
            System.out.println(" 単語の種類： " + words.size());
            System.out.println(" 一覧：");
            // (5) 変数wordsのすべての要素を出力
            for (Object o : words) {
                System.out.println(o);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
