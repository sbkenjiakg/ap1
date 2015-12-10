/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en03;

/**
 *
 * @author C0114112
 */
class Computer {

    String os;
    int ram;
    Computer(String _Linux_, int i) {
       this.os = _Linux_;
       this.ram = i;
    }

    Computer() {
        this.os = "Windows 8.1";
        this.ram = 4;
    }

    String getSpec() {
        return "OS: "+ os + ", RAM: " + ram + "GB";
    }
    
}
