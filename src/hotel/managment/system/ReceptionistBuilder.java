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
public class ReceptionistBuilder {
    private RoomBuilder room ;
    int id;

    public void setRoom(RoomBuilder room) {
        this.room = room;
    }

    public Room getRoom() {
        return room.getRoom();
    }

    public ReceptionistBuilder( int id) {
       
        this.id = id;
    }

  
    
    public void  constructRoom()
    {
        room.creatRoom();
        room.putPrice();
        room.putStatus();
        room.putroomtype();
        room.putid(this.id);
    }
}
