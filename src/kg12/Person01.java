/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg12;

/**
 *
 * @author ogiya
 */
public class Person01 extends Thread {

    private String name;
    private int count;
    
    public Person01(String nm, int c) {
        this.name = nm;
        this.count = c;
    }
    
    @Override
    public void run() {
        for (int i = 0; i <= count; i++) {
            System.out.println(name + ":" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println(name + "は" + count + "数え終わりました");
    }
}
