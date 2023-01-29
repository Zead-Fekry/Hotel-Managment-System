/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Zead Fekry
 */
public class changes {
    public static  void setData(String Query,String massege)
    {
        Connection con =null;
        Statement st = null;
        try
        {
        
            con=Connections.getCon();
            st=con.createStatement();
            st.executeUpdate(Query);
            if(!massege.equals(""))
                JOptionPane.showMessageDialog(null, massege);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            
        }
    }
}
