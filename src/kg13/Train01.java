/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg13;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ogiya
 */
public class Train01 implements Runnable {

    private String trainType;        // テキストフィールドに表示する名前
    private JTextField[] laneNames;  // とのルートを通るか決める配列
    private long trainWaitTime;         // テキストが次の移動までに何ms必要か決める変数
    private JTextArea outputArea;    // 出力先

    public Train01(String trainType, JTextField[] laneNames, long trainSpeed, JTextArea outputArea) {
        this.trainType = trainType;
        this.laneNames = laneNames;
        this.trainWaitTime = trainSpeed;
        this.outputArea = outputArea;
    }

    public String getType() {
        return this.trainType;
    }

    @Override
    public void run() {
        try {
            int txtLength = 24;

            // 橋の前
            for (String str = trainType; str.length() < txtLength; str = " " + str) {
                print(laneNames[0], str);
            }

            // 橋
            print(laneNames[0], "");
            outputArea.append(trainType + " は橋を渡り始めました\n");
            for (String str = trainType; str.length() < txtLength; str = " " + str) {
                print(laneNames[1], str);
            }
            print(laneNames[1], "");

            // 橋の後
            for (String str = trainType; str.length() < txtLength; str = " " + str) {
                print(laneNames[2], str);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // テキストフィールドの文字を更新するメソッド
    private void print(final JTextField field, final String str) throws InterruptedException {
        field.setText(str);
        Thread.sleep(trainWaitTime);
    }
}
