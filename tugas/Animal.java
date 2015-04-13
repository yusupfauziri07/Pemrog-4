/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractAnimal;

/**
 *
 * @author user
 */
public class Animal {
    protected int legs;
    
    public Animal(){
        
    }
    
    protected Animal(int legs){
        System.out.println("\nHewan memiliki kaki");
    }
    
    public void walk(){
        System.out.println("Hewan dapat berjalan");
    }
    
    public void eat(){
        System.out.println("Hewan Dapat Makan");
    }
    
}

