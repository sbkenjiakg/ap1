/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en03;

/**
 *
 * @author C0114112
 */
class Student {

    String stid;
    String prog;

    Student(String s) {
        this.stid = s;
        int stidNum = Integer.parseInt(stid.substring(6,9));

        if (0 <= stidNum && stidNum <= 200) {
            prog = "P";
        } else if (200 < stidNum && stidNum <= 400) {
            prog = "Q";
        } else if (400 < stidNum) {
            prog = "R";
        }
    }

    Student() {
        this.stid = "NO STDID";
        this.prog = "NONE";
    }

    String getStid() {
        return this.stid;
    }

    String getProgClass() {
        return prog;
    }

}
