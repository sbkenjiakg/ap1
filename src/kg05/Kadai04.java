/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg05;

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
        String istr = "らんらんらららんらんらん";
        String ostr;
        ostr = istr.replaceAll("^らん", "(^^)らん");//先頭
        System.out.println(ostr);
        ostr = istr.replaceAll("らんらんらん$", "らん♪");//末尾
        System.out.println(ostr);

        String istr2 = "f! fo! foo! fooo!";
        String ostr2;
        ostr2 = istr2.replaceAll("fo*", "(=o=)");
        System.out.println(ostr2);
        istr2 = "f fo! fo!o! fo!o!o!";
        ostr2 = istr2.replaceAll("f(o!)*", "(o_o)");
        System.out.println(ostr2);
    }

}
