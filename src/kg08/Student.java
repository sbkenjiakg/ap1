/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg08;

/**
 *
 * @author C0114112
 */
public class Student {
        int stid;
        String stname;
        
        public Student(String str, int i){
                stname = str;
                stid = i;
        }
        public String toString(){
            return "Name:" + stname + ", ID:" + stid ;
        }
    
}
