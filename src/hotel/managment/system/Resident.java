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
public class Resident {
   private int id;
   private String name;
 private   int nationalId;
  private  int roomid;
  private  int duration;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNationalId() {
        return nationalId;
    }

    public int getRoomid() {
        return roomid;
    }

    public int getDuration() {
        return duration;
    }

    public String getBoarding() {
        return boarding;
    }

    public String getRoom_type() {
        return Room_type;
    }

    public int getCost() {
        return cost;
    }
  private  String boarding;
 private   String Room_type;
  private  int cost;

    public Resident(int id, String name, int nationalId, int roomid, int duration, String boarding, String Room_type, int cost) {
        this.id = id;
        this.name = name;
        this.nationalId = nationalId;
        this.roomid = roomid;
        this.duration = duration;
        this.boarding = boarding;
        this.Room_type = Room_type;
        this.cost = cost;
    }
}
