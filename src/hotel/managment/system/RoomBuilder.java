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
public abstract class  RoomBuilder {
    public Room room;
    public Room getRoom()
    {
        return  room;
    }
    public void creatRoom ()
    {
        room=new Room();
    }
    public abstract void putPrice();
    public abstract void putStatus();
     public abstract void putroomtype();
      public abstract void putid(int id);

}
