/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.co.a2x.library.model;

/**
 *
 * @author scherman
 */
public class Author {
    
    private String name;
    private String age;
    
    public String getName(){
        return name;
    }
    
    public void setName (String name){
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
