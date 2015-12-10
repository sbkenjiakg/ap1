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
public class Kadai03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String istr = "zm zom zoom zooom zoooom";
        String ostr;

        ostr = istr.replaceAll("zo?m", "^o^");//zの後にoが0or1文字連続してmが続く場合
        System.out.println(ostr);
        ostr = istr.replaceAll("zo*m", "(^o^)");//zの後にoが0文字以上連続してmが続く場合
        System.out.println(ostr);
        ostr = istr.replaceAll("zo+m", "(^v^)");//zの後にoが1文字以上連続してmが続く場合
        System.out.println(ostr);
    }

}
