/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en13;

/**
 *
 * @author C0114112
 */
class Players {
    private int id;
    private String name;
    private double height;
    private double weight;

    public Players(int id, String name, double height, double weight) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }
    
    
}
