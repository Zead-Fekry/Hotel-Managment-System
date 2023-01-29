/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.managment.system;

import Others.changes;
import sun.security.jca.GetInstance;

/**
 *
 * @author Lenovo
 */
public class balance {
    private int day ; 
    private int month ; 
    private int year ; 
    private int cost ; 
    private static balance your_balance = null ; 

     balance(int day, int month, int year , int cost) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.cost = cost ;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
    
    public static balance GetInstance()
    {
        if(your_balance == null)
        {
            your_balance = new balance(0, 0, 0,0) ; 
        }
        
        return your_balance ;
        
    }
    
    

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public balance getYour_balance() {
        return your_balance;
    }

    public void setYour_balance(balance your_balance) {
        this.your_balance = your_balance;
    }
    
     public void update_balance_database(int id ) {
       String query = "insert into balance values ('"+id+"','"+day+"','"+month+"','"+year+"','"+cost+"')";
        changes.setData(query, "your balance added successfully");
    }
    
}
