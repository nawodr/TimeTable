/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nawod
 */
public class DBConnection {
    static Connection con = null;
    
    public static Connection getConnection(){
        
        try {
            if(con == null || con.isClosed()){
                Class.forName("org.sqlite.JDBC");                 
                con = DriverManager.getConnection("jdbc:sqlite:db.db");
                System.out.println("Connection Succesfull");
            }
            
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
            return null;   
        }
        return con;
    }
    
    public static void main(String[] args){
        getConnection();
    }
}
