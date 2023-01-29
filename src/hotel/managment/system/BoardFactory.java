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
public class BoardFactory {
    Board board;
    public  Board get_price(String roomtype,Room room)
    {


        if("Fullboard".equals(roomtype))
          {
             board=new Fullboard(room);
          }
          else if("Halfboard".equals(roomtype))
          {
              board=new HalfBoard(room);
          }
          else if("Bed and Breakfast".equals(roomtype))
          {
             board=new Bed_and_breakfast(room);
          }
        else
          {
            return null;
          }
        return board;
    }
}
