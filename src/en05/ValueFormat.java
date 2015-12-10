/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

/**
 *
 * @author C0114112
 */
class ValueFormat {

    static String getValue(int n) {
        return String.valueOf(n);
    }

    static String getValue(double d) {
        return String.valueOf(String.format("%011.6f", d));
    }

    static String getCommaFormat(int i) {
        return String.format("%,9d", i);
    }

    static String getCommaFormat(double d) {
        return String.format("%,012.6f", d);
    }

    static String getDigitCommaFormat(int n, int i) {
        return String.format("%," + i + "d", n);
    }

    static String getDigitCommaFormat(double n, int i, int i0) {
        return String.format("%," + i + "." + i0 + "f", n);
    }

}
