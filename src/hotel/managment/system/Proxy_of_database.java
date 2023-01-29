package hotel.managment.system;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Others.changes;
import Others.retrive;
import hotel.managment.system.Worker;
import hotel.managment.system.WorkerFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Hussien
 */
public class Proxy_of_database {
    
   public String proxy_for_sign_up(String name,String email,String password,String address,String selectedtype){
                      System.out.println(name);

          if(email.length()<2||password.length()<2||address.length()<2||email.length()<13)
       {
           JOptionPane.showMessageDialog(null, "one of fields not have a right length");
           return "false";
       }
       else if(!email.contains("@myhotel.com"))
       {
       JOptionPane.showMessageDialog(null, "Email not have a right format");
           return "false";
       }
       else{
              System.out.println("hello");
           String emailchecker = email;
           String sql = "select *from users where email = '" + emailchecker + "'";
                  ResultSet rs = retrive.retrivedata(sql);
              
             try
        {
            while (rs.next()) {
                    JOptionPane.showMessageDialog(null, "user "+ emailchecker +" already exists");
             return "false";
            }
            rs.close();
        }
        catch(Exception e)
        {
              System.out.println("exception");
           JOptionPane.showMessageDialog(null, e);
  
        } 
             //using of worker factory
      
                    Worker object = WorkerFactory.getworker(selectedtype);
                    object.setName(name);                       
                    object.setemail(email);
                    object.setpassword(password);
                    object.setaddress(address);
                    object.setSalary();
                    object.setjobtitle();
                    object.setstatus();                                    
                    String query = "insert into users values ('"+object.name+"','"+object.email+"','"+object.password+"','"+object.address+"','false','"+object.jobtitle+"','"+object.salary+"')";
                    changes.setData(query, "user "+emailchecker+" added succesfuly"); 
                     return "true";
       }
          
    }
    
    public String proxy_for_sign_in(String email,String password){
        System.out.println(email);
        if(email.equals("manager")&&password.equals("manager"))
               return"manager";   
        else {
          if(email.length()<2||password.length()<2)
       {
           JOptionPane.showMessageDialog(null, "one of fields not have a right length");
           return "false";
       }
       else if(!email.contains("@myhotel.com"))
       {
       JOptionPane.showMessageDialog(null, "Email not have a right format");
        return "false";
       }
       else{
      
           String emailchecker = email;
            ResultSet rs=retrive.retrivedata("select *from users where email='"+email+"' and password='"+password+"'");
             try
        {
            while (rs.next()) {
                    JOptionPane.showMessageDialog(null, "user  exists got to receptions here");
             return "true";
            }
            rs.close();
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
  
        }
       }
       }
           return "false";
    }
    
     public String proxy_for_new_resident(Resident user){
         System.out.println(user.getId());
         if(user.getId()<1000)
             JOptionPane.showMessageDialog(null, "id not have a right format");
         else if(user.getName().length()<4)
             JOptionPane.showMessageDialog(null, "name not have a right format");
            else if(user.getNationalId()<1000)
             JOptionPane.showMessageDialog(null, "natoinal id not have a right format");  
            else if(user.getNationalId()!=user.getId())
                        JOptionPane.showMessageDialog(null, "not the same");  
            else{    
                 System.out.println("welecome to proxy of resident");
             String query2 = "insert into resident values ('"+user.getId()+"','"+user.getName()+"','"+user.getNationalId()+"','"+user.getRoomid()+"','"+user.getDuration()+"','"+user.getBoarding()+"','"+user.getRoom_type()+"','"+user.getCost()+"')";
             String query1="UPDATE rooms SET status = 'BOOKED' WHERE idrooms='"+user.getRoomid()+"'";
             changes.setData(query1, " Reservation completed");
             changes.setData(query2, "welecome ");

            }
         return "";
     }
}
