/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Bill;


/**
 *
 * @author User
 */
public class BillDao {
    
    public static String getId()
    {
        int id=0;
        try
        {
            ResultSet rs=DBoperation.getData("select max(id) from bill ");
            if(rs.next())
            {
                id=rs.getInt(1);
                id=id+1;
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
    public static void save(Bill bill)
    {
        String query="insert into bill values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getMobile_number()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreatedby()+"')";
        DBoperation.setDataOrDelete(query, "Bill Details Added Successfully");
    }
    public static ArrayList<Bill> getAllRecordByINC(String date)
    {
        ArrayList<Bill> arraylist=new ArrayList<>();
        try{
            
            ResultSet rs=DBoperation.getData("SELECT * FROM bill WHERE date LIKE '%" + date + "%'");
            while(rs.next())
            {
           Bill bill=new Bill();
           bill.setId(rs.getInt("id"));
           bill.setName(rs.getString("Name"));
           bill.setMobile_number(rs.getString("Mobil_number"));
           bill.setEmail(rs.getString("email"));
           bill.setDate(rs.getString("date"));
           bill.setCreatedby(rs.getString("createby"));
           arraylist.add(bill);
            }
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e );
        }
        return arraylist;
        
    }
    
        public static ArrayList<Bill> getAllRecordByDESC(String date)
    {
        ArrayList<Bill> arraylist=new ArrayList<>();
        try{
            
            ResultSet rs=DBoperation.getData("SELECT * FROM bill WHERE date LIKE '%" + date + "%' ORDER BY id DESC");
            while(rs.next())
            {
           Bill bill=new Bill();
           bill.setId(rs.getInt("id"));
           bill.setName(rs.getString("Name"));
           bill.setMobile_number(rs.getString("Mobil_number"));
           bill.setEmail(rs.getString("email"));
           bill.setDate(rs.getString("date"));
           bill.setCreatedby(rs.getString("createby"));
           arraylist.add(bill);
            }
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e );
        }
        return arraylist;
        
    }
}

