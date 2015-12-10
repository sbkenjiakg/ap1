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
public class Kadai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date dt = new Date();
        System.out.println(dt);
        DateFormat dtf = DateFormat.getDateInstance();
        Calendar cal = Calendar.getInstance();
        
        cal.setTime(dt);
        cal.add(Calendar.YEAR, 3);
        cal.add(Calendar.DATE, 204);
        System.out.println(dtf.format(cal.getTime()));
    }
    
}
