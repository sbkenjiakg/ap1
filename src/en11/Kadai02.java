/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Kadai02 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(" orange ");
        list.add(" apple ");
        list.add(" grape ");
        list.add(" orange ");
        list.add(" apple ");
        list.remove(" orange ");
        list.remove(" apple ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
