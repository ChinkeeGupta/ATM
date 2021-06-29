/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm__interface;
import java.sql.*;

/**
 *
 * @author dell
 */
public class createConnection {
    public static Connection getconnection(){
       Connection con = null;
      
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdata","root","chinkee16");
      
        }
     catch(Exception e)
       {
           System.out.println("Got an Exception"); 
        System.out.println(e); 
       }
    return con;
    
    }
  
 }
     