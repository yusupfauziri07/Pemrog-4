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
public abstract class Pet extends Animal{
    
    protected String name;
    
    public Pet(){
        System.out.println("\nBinatang peliharaan");
    }
    
    public String setName(String nm){
        name = nm;
        return name;
    }
    
    public void getName(){
        System.out.print(name + " : ");
    }
    
    public void play(){
        System.out.println("Hewan Peliharaan dapat bermain");
    }
    
}
