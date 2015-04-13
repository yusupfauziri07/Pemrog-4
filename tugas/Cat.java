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
public class Cat extends  Pet{
    String name;
    
    public Cat(){
        
    }
    
    @Override
    public void play(){
        System.out.println("\nKucing dapat bermain");
    }
    
    public void eat(){
        System.out.println("Kucing dapat makan");
    }
    
//    public String setName(String nm){
//        name  = nm;
//        return name;
//    }
//    
//    public void getName(){
//        
//    }
    
    
    
}
