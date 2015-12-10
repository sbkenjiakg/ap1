/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en04;

/**
 *
 * @author C0114112
 */
public class Heading {
    private String body;
    private String tag;
    
    public Heading(String body){
        this.body = body;
        this.tag = "";
    }
    public void setTag(String tag){
        this.tag = tag;
    }
    public String getDecoText(){
        return this.tag + this.body + this.tag;
    }
}
