/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en04;

/**
 *
 * @author C0114112
 */
class Calc {

    static int add(int i, int i0, int i1) {
        return i + i0 + i1;
    }

    static double ave(int i, int i0, int i1) {
        return (i + i0 + i1)/3.0;
    }

    static int fact(int i) {
        int ans = 1;
        for (int j = 0; i >= 1; i--) {
             ans *= i;
        }
        return ans;
    }
    
}
