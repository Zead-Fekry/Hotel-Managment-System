/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.managment.system;

/**
 *
 * @author Zead Fekry
 */
public class TribleRoom extends RoomBuilder{
     @Override
    public void putPrice() {
         room.setPrice(2000);
    }

    @Override
    public void putStatus() {
        room.setStatus("Not BOOKED");//To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public void putroomtype() {
       room.setRoomtype("Triple"); //To change body of generated methods, choose Tools | Templates.
    }

       public void putid(int id) {
        room.setId(id);//To change body of generated methods, choose Tools | Templates.
    }
}
