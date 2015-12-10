/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

/**
 *
 * @author C0114112
 */
class Animal {

    private String species; // 種類
    private int weight; // 重さ

    void setParams(String s, int w) { // M1: 種類と重さを設定するsetParams メソッド
        this.species = s;
        this.weight = w;
    }

    String getSpecies() {// M2: 種類をかえすgetSpecies メソッド
        return this.species;
    }

    int getWeight() {// M3: 重さをかえすgetWeight メソッド
        return this.weight;
    }
}
