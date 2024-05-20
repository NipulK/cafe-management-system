/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import com.mysql.cj.xdevapi.Result;
import model.User;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class userQu {

    public static void save(User user) {
        String query = "insert into user (Name,address,DOB,phone_num,Mail,password,status) values('" + user.getName() + "','" + user.getAddress() + "','" + user.getDOB() + "','" + user.getPhone_num() + "','" + user.getEmail() + "','" + user.getPassword() + "','false')";
        DBoperation.setDataOrDelete(query, "Registered Successfuly");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DBoperation.getData("select * from user where mail='" + email + "'  and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return user;
    }

    public static ArrayList<User> getAllRecord(String email) {

        ArrayList<User> arraylist = new ArrayList<>();
        try {
            ResultSet rs = DBoperation.getData("select * from user where email like '%" + email + "%'");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("mail"));
                user.setPhone_num(rs.getString("phone_num"));
                user.setAddress(rs.getString("address"));
                user.setStatus(rs.getString("status"));
                arraylist.add(user);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }

    public static void update(String email, String newpassword) {
        String query = "update user set password ='" + newpassword + "' where mail='" + email + "'";
        DBoperation.setDataOrDelete(query, "Password change Successfully");
    }

    public static void changeStatus(String email, String status) {
        String query = "Update user set status '" + status + "' where mail='" + email + "'";
        DBoperation.setDataOrDelete(query, "Status Change Successfully");
    }
    
    public static void password(String email,String Oldpassword,String newpassword)
    {
        try
        {
            ResultSet rs=DBoperation.getData("select * from user where mail='"+email+"' and password='"+Oldpassword+"'");
            if(rs.next())
            {
                update(email, newpassword);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Old password is worng","Inform",JOptionPane.OK_OPTION);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void main(String[] args) {

    }

    public static ArrayList<User> getAllRecords(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
