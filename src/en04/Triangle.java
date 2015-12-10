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
class Triangle {

    double s1,s2,s3;
    
    Triangle(int i, int i0, int i1) {
        s1 = i;
        s2 = i0;
        s3 = i1;
    }

    boolean isTriangle() {
        if (s1 < s2 + s3 && s2 < s3 + s1 && s3  < s2 + s1) {
            return true;
        }else{
            return false;
        }
    }
    double getArea() {
        double s = (s1+s2+s3)/2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
    
}
