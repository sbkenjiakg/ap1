/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author C0114112
 */
public class Kadai04 {

    public static void main(String[] args) {
        Players[] players = new Players[4];
        players[0] = new Players(1, "Ken Suzuki", 172.5, 68.5);
        players[1] = new Players(2, "Hiroto Takeda", 165.7, 61.1);
        players[2] = new Players(3, "Yuma Suzuki", 178.1, 76.8);
        players[3] = new Players(4, "Ren Yamada", 174.2, 62.3);

        ArrayList<Players> playerData = new ArrayList();
        playerData.addAll(Arrays.asList(players));

        System.out.println("名前\t\tID\t身長\t体重");
        for (int i = 0; i < players.length; i++) {
            Players p = playerData.get(i);
            System.out.println(p.getName() + "\t" + p.getId() + "\t" + p.getHeight() + "\t" + p.getWeight());

        }
        System.out.println("");
        System.out.println("Suzuki さんを検索します。");
        for (int i = 0; i < players.length; i++) {
            if (playerData.get(i).getName().matches(".*Suzuki.*")) {
                Players p = playerData.get(i);
                System.out.println(p.getName() + "\t" + p.getId() + "\t" + p.getHeight() + "\t" + p.getWeight());
            }

        }

    }
}
