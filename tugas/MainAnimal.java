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
public class MainAnimal {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
   
       Animal animal = new Animal();
       animal.eat();
       animal.walk();
       
       Animal animal2 = new Animal(8);
       animal2.eat();
       animal2.walk();
       
       Pet pt = new Pet() {};
       pt.setName("Binatang Peliharaan");
       pt.play();
       
       Spider spd = new Spider();
       spd.eat();
       
       Cat ct = new Cat();
       ct.setName("Kucing");
       ct.play();
       ct.eat();
       
       Fish fs = new Fish();
       fs.setName("Ikan");
       fs.walk();
       fs.eat();
       fs.play();
       
       
        
       
       
//       Cat ct = new Cat();
//       ct.eat();
//       ct.play();
//       ct.setName("Kucing");
//       ct.getName();
//       
//       Fish fh = new Fish();
//       fh.walk();
//       fh.eat();
//       fh.play();
       
       
    }
    
}
