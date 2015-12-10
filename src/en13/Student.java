/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en13;

/**
 *
 * @author C0114112
 */
public class Student {

    private String id; // 学 籍 番 号
    private int score; // 得 点

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }
    /**
     *このインスタンスの得点に、指定した値を加えます。指定した値が負の場合、得点から減らされます。
     * 
     * 
     * @param a -　得点に加える点数
     */
    public void adjust(int a) {
        this.score = this.score + a;
    }
    /**
    * このインスタンスの得点が60以上の場合trueを返します。そうでない場合はfalseを返します。
    * @return 得点が60以上の場合はtrue
    */
    public boolean isPass() {
        if (score >= 60) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return " Student {" + " id =" + id + ", score =" + score + "}";
    }
}
