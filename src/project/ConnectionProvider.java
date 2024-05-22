/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author appFile
 */
public interface ConnectionProvider {
    public static Connection getcon()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","1234");
            return con;
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println(e);
            return null;
        }
    }
            
}
