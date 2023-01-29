/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.managment.system;
import Others.changes;




/**
 *
 * @author Zead Fekry
 */
public class Facade {
    int id;
    String name;
    int nationalId;
    int roomid;
    int duration;
    String boarding;
    String Room_type;
    int cost;
    int day,month,year;

    public Facade(int id, String name, int nationalId, int roomid, int duration, String boarding, String Room_type,int dayy,int monthh,int yearr) {
        this.id = id;
        this.name = name;
        this.nationalId = nationalId;
        this.roomid = roomid;
        this.duration = duration;
        this.boarding = boarding;
        this.Room_type = Room_type;
        this.day=dayy;
        this.month=monthh;
        this.year=yearr;
       
    }

   
    public void ConfirmResirvation()
    {  
        RoomFactory factory = new RoomFactory(1);
        Room room = factory.getroom(Room_type);
        BoardFactory b=new BoardFactory();
        Board Boarding_cost=b.get_price(boarding, room); 
        int total_cost=Boarding_cost.cost*duration;       
        Resident user= new Resident(id, name, nationalId, roomid, duration, boarding, Room_type,total_cost);
        Proxy_of_database prox=new Proxy_of_database();
        prox.proxy_for_new_resident(user);
        balance balancee=new balance(day,month,year,total_cost);
        balancee.update_balance_database(id);
    }
    
}
