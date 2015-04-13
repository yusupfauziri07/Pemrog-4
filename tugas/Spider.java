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
public class Spider extends Animal{

    public Spider() {
        System.out.println("Laba-Laba");
    }
    
    public Spider(int legs){
        System.out.println("Laba - Laba berkaki " + legs + " ");
    }
   
    public void eat(){
        System.out.println("Laba- laba dapat makan");
    }
    
}

