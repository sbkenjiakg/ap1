/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg10;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private int age;
    
    public Person(String nm, int a){
        this.name = nm;
        this.age = a;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
}
