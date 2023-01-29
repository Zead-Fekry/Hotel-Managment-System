/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

import com.sun.javafx.runtime.SystemProperties;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;



/**
 *
 * @author Zead Fekry
 */

public class Connections {
    public static Connection getCon(){
        try {
               Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hotel","root","root");
            return con;
        }
        catch (Exception e){
           System.out.println(e);
         return null;   
        }
           



   }
}
