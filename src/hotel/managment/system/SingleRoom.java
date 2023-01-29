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
public class SingleRoom extends RoomBuilder{

    @Override
    public void putPrice() {
         room.setPrice(500);
    }

    @Override
    public void putStatus() {
        room.setStatus("Not BOOKED");//To change body of generated methods, choose Tools | Templates.
    }
     public void putid(int id) {
        room.setId(id);//To change body of generated methods, choose Tools | Templates.
    }
     public void putroomtype() {
        room.setRoomtype("Single");//To change body of generated methods, choose Tools | Templates.
    }
}
