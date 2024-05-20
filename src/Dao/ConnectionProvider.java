package Dao;

import java.sql.*;
import Dao.BillDao;
/**
 *
 * @author User
 */
public class ConnectionProvider {
    
    public static Connection getcon()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Cafe_Management_system","root","Nipulmysql@1");
           return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
