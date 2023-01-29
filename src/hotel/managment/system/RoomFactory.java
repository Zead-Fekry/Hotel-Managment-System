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
public class RoomFactory {
    ReceptionistBuilder reception;

    public RoomFactory(int z) {
               this.reception = new ReceptionistBuilder(z);

    }

    
   
    public  Room getroom(String roomtype)
    {
        if("Single".equals(roomtype))
          {
              RoomBuilder singleRoom= new SingleRoom();
              reception.setRoom(singleRoom);
              reception.constructRoom();
               return reception.getRoom();
          }
          else if("Double".equals(roomtype))
          {
              RoomBuilder doupleRoom= new DoupleRoom();
              reception.setRoom(doupleRoom);
              reception.constructRoom();
               return reception.getRoom();
          }
          else if("Triple".equals(roomtype))
          {
              RoomBuilder tripleRoom= new TribleRoom();
              reception.setRoom(tripleRoom);
              reception.constructRoom();
              return reception.getRoom();

          }
        else
          {
            return null;
          }
    }
}
