/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg12;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ogiya
 */
public class WorkerA extends Thread {

    private String name;
    private int pay;
    private int goal;
    private int have;
    private final JTextField field;
    private final JTextArea Area;

    public WorkerA(String nm, int p, int g, int h, final JTextField f, final JTextArea a) {
        this.name = nm;
        this.pay = p;
        this.goal = g;
        this.have = h;
        this.field = f;
        this.Area = a;
    }

    @Override
    public void run() {

        while (this.have < this.goal) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            this.have += this.pay;
            this.field.setText(this.have + "");
            
            Area.append(this.name + "は仕事をしました。持ち金：" + this.have + "\n");
        }
        Area.append(this.name + "は目標金額を稼ぎました。\n");
    }
}
