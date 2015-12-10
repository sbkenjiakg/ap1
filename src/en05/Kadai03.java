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
public class Kadai03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 1234567;
        double d = 1800.1234;
        String str1, str2;
// V a l u e F o r m a tクラスのg e t V a l u e () を 用 い て 変 数 n , d を 出 力
        str1 = ValueFormat.getValue(n);
        str2 = ValueFormat.getValue(d);
        System.out.println(str1);
        System.out.println(str2);
// V a l u e F o r m a tクラスのg e t C o m m a F o r m a t () を 用 い て 変 数 n , d を 出 力
        str1 = ValueFormat.getCommaFormat(n);
        str2 = ValueFormat.getCommaFormat(d);
        System.out.println(str1);
        System.out.println(str2);
// (7) 変 数 n を1 0 桁 カ ン マ 付 き で 出 力
        str1 = ValueFormat.getDigitCommaFormat(n, 10);
        System.out.println(str1);
// (8) 変 数 d を1 0 桁 小 数 点 以 下2 桁 の カ ン マ 付 き で 出 力
        str1 = ValueFormat.getDigitCommaFormat(d, 10, 2);
        System.out.println(str1);

    }

}
