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
public class Kadai03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.JULY);
        cal.set(Calendar.DATE, 24);
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                System.out.println("日曜日");
                break;
            case Calendar.MONDAY:
                System.out.println("月曜日");
                break;
            case Calendar.TUESDAY:
                System.out.println("火曜日");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("水曜日");
                break;
            case Calendar.THURSDAY:
                System.out.println("木曜日");
                break;
            case Calendar.FRIDAY:
                System.out.println("金曜日");
                break;
            case Calendar.SATURDAY:
                System.out.println("土曜日");
                break;

        }
        //System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    }

}
