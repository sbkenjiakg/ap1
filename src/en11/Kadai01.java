/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Kadai01 {

    public static void main(String[] args) {
// ジェネリクス( Generics ) によりString 型だけ扱えるようにする
        List<String> list = new ArrayList<>();
// 要素を追加
        list.add(" grape ");
        list.add(" lemon ");
        list.add(" apple ");
// イテレータ( iterator ) を用いて出力する
        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            String n = it.next();
            System.out.println(n);
        }
    }
}
