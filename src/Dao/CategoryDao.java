/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import com.mysql.cj.protocol.Resultset;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;
/**
 *
 * @author User
 */
public class CategoryDao {
    
    
    public static void save(Category category)
    {
        String query="INSERT INTO category (name) VALUES ('"+category.getName()+"')";
        DBoperation.setDataOrDelete(query, "Category Added successfuly");
       
    }
    
    public static ArrayList<Category> getAllRecorde()
    {
        ArrayList<Category> arrylist=new ArrayList<>();
        try
        {
            ResultSet rs=DBoperation.getData("select * from category");
            while(rs.next())
            {
                Category category=new Category();
                category.setId(rs.getInt(1));
                category.setName(rs.getString(2));
                arrylist.add(category);
                
                
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        return arrylist;
    }
    
    public static void delete(String id)
    {
        String query="Delete from category where id='"+id+"'";
        DBoperation.setDataOrDelete(query, "Cateogry Deleted successfuly");
    }
    
}
