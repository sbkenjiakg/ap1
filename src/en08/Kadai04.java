/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en08;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

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

        Calendar cal = Calendar.getInstance();
        long nowTime = cal.getTimeInMillis()/(1000*60*60*24);
        
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2020, Calendar.JULY, 24);
        System.out.println(cal1.getTimeInMillis()/(1000*60*60*24)-cal.getTimeInMillis()/(1000*60*60*24)+"日");
        
    }
    
}
