/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author C0114112
 */
public class Kadai01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date dt = new Date();
        System.out.println(dt);
        
        DateFormat dtf = DateFormat.getDateTimeInstance();
        System.out.println(dtf.format(dt));
        dtf = new SimpleDateFormat("yy年M月d日(E) a h時m分s秒");
        System.out.println(dtf.format(dt));
    }
    
}
