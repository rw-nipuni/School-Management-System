/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;



import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author M Azhar Durrani
 */
public class Connect {
     
    
   
        public static Connection ConnectDB()
        {
            Connection conn = null;
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/second","root","");
                
            
            
            
            } catch (Exception ex) {
               
            }
            
            
            
            return conn;
            
          
    
      
    
        }
}