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
class RepeatingNumbers {
    int ans[];
    public RepeatingNumbers() {
        ans = new int[4];
        ans[0] = 1;
        ans[1] = 6;
        ans[2] = 2;
        ans[3] = 5;
    }

    public RepeatingNumbers(int i, int i0, int i1) {
        ans = new int[3];
        ans[0] = i;
        ans[1] = i0;
        ans[2] = i1;
    }
    
    
    int back = 0;
    int getNum(){
        int a = ans[back];
        back = (back+1)%ans.length;
        return a;
    }
    
}
