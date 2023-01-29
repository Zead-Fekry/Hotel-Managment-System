/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.managment.system;

/**
 *
 * @author Ahmed Hussien
 */
public class Bed_and_breakfast extends Board{

    public Bed_and_breakfast(Room roomtype) {
       cost=roomtype.getPrice()+5;
    }

    public int getCost() {
        return cost;
    }

  
    
}
