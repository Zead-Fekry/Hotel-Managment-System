package hotel.managment.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zead Fekry
 */
public  class  Room {
    private int id;
    private String roomtype;
    private int price;
    private String status;

    public void setId(int id) {
        this.id = id;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatus(String sttus) {
        this.status = sttus;
    }

    public int getId() {
        return id;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public int getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }
    
  
}
