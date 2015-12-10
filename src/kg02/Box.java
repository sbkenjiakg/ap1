/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg02;

/**
 *
 * @author C0114112
 */
class Box {

    private int width; // 四角形の幅
    private int height; // 四角形の高さ
// (1) 引数w の値をフィールドwidth に設定するsetWeight メソッド
    void setWidth(int w){
        this.width = w;
    } 
// (2) 引数h の値をフィールドheight に設定するsetHeight メソッド
    void setHeight(int h){
        this.height = h;
    }
// (3) このインスタンスの面積（ めんせき， A r e a ） をかえすgetArea メソッド
    int getArea(){
        return this.height*this.width;
    }
}
