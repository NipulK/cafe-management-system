/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author User
 */
public class DBoperation {
    
    public static  void setDataOrDelete(String query,String msg)
    {
        try
        {
            Connection con=ConnectionProvider.getcon();
            Statement st=con.createStatement();
            st.executeUpdate(query);
            if(!msg.equals(""))
            {
                JOptionPane.showMessageDialog(null, msg);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static ResultSet getData(String Query)
    {
        try
        {
            Connection con=ConnectionProvider.getcon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(Query);
            return rs;
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.ERROR_MESSAGE);
          return null;
        }
    }
}
