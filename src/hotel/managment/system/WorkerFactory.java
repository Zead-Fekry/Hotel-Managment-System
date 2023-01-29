package hotel.managment.system;


import hotel.managment.system.Worker;
import hotel.managment.system.receptionist;
import hotel.managment.system.roomService;
import hotel.managment.system.Manager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zead Fekry
 */
public class WorkerFactory {
    public static Worker getworker(String jopTiltle)
    {
        if(jopTiltle=="manager")
        {
            return new Manager();
        }
        else if(jopTiltle=="receptionist")
        {
            return new receptionist();
        }
        else if(jopTiltle=="roomservice")
        {
            return new roomService();
        }
        return null;
    }
}
