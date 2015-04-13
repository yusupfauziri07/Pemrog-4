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
public class Fish extends Pet{
    public Fish(){
        System.out.println("\nFish");
    }
    
    public void play(){
        System.out.println("Ikan dapat bermain");
    }
    
    public void walk(){
        System.out.println("Ikan dapat berjalan");
    }
    
    public void eat(){
        System.out.println("Ikan dapat makan");
    }
}
