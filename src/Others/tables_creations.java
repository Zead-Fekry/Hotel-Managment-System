/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Zead Fekry
 */
public class tables_creations {
     public static void main(String [] args){
        Connection con=null;
        Statement st=null;
        
        try{
            con=Connections.getCon();
            st=con.createStatement();
         
    
  //  st.execute("create table users(name varchar(200),email varchar(200),password varchar(200),address varchar(200),status varchar(20),jobtitle varchar(200),salary int)");

       /*2  String createQuery = "CREATE TABLE rooms("
       + "idrooms INT PRIMARY KEY AUTO_INCREMENT, "
        + "roomtype VARCHAR (255) , "
        + "price INT, "
       + "status varchar(255))";
          st.execute(createQuery);
          */
            
        
            /*   String createQuery = "CREATE TABLE resident("
       + "ID INT PRIMARY KEY AUTO_INCREMENT, "
        + "name_ VARCHAR (255) , "
         + "nationalid INT, "
      + "roomid INT, "
       + "duration INT, "
      + "boarding VARCHAR (255) , "
        + "Room_type VARCHAR (255) , "
        + "Cost INT)";
            st.execute(createQuery);*/
             
              String createQuery = "CREATE TABLE balance("
       + "ID INT PRIMARY KEY AUTO_INCREMENT, "
        + "day INT , "
         + "month INT, "
      + "year INT, "
        + "Cost INT)";
            st.execute(createQuery);
             
             
             

            JOptionPane.showMessageDialog(null, "Table created");



       }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
          /*  try 
            {
             con.close();
             st.close();
            } catch (Exception e) {
            }*/
        }
    }
}
