package hotel.management.system;
import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;// query golo execute korar jono
    Conn(){  
        
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            c =DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","12345"); 
            s =c.createStatement();
           
           
        }
        catch(Exception e){ 
           e.printStackTrace();
        }  
    }  
}  