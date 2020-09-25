/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class MySQLModelImplementation implements Model {
    
    private Connection con;
    private Statement stmt;
    private ResourceBundle rb = ResourceBundle.getBundle("config.config");
        
    
    private String selectGreeting(){
        String greeting="";
        
        
        
        return greeting;
    }
    
    
    
    @Override
    public String getGreeting() {
        return this.selectGreeting();
    }
    
    private void openConnection() throws Exception {

        //Revisar user y password
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = rb.getString("host");
        String name = rb.getString("user");
        String pass = rb.getString("password");
        con = DriverManager.getConnection(url, name, pass);
        System.out.println("Connection created");
        stmt = con.createStatement();
    }
    
    private void closeConeection() throws SQLException {
        stmt.close();
        con.close();
    }
    
    
    
}
