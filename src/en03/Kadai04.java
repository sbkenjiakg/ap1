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
public class Kadai04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] sts;
        sts = new Student[4];
        sts[0] = new Student();
        sts[1] = new Student(" C0115012 ");
        sts[2] = new Student(" C0115345 ");
        sts[3] = new Student(" C0115678 ");
        for (int i = 0; i < sts.length; i++) {
            System.out.println(sts[i].getStid() + " : " + sts[i].getProgClass());
        }

    }
}

