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
public class HalfBoard extends Board{

    public HalfBoard(Room roomtype) {
       cost=roomtype.getPrice()+10;
    }

    public int getCost() {
        return cost;
    }

  
    
}
