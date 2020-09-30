/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class MySQLModelImplementation implements Model {
    
    private Connection con;
    private Statement stmt;
    private ResourceBundle rb = ResourceBundle.getBundle("config.config");
    
    public MySQLModelImplementation() {
        this.openConnection();
    }
     
    private void openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Properties connectionProps = new Properties();
            connectionProps.put("user", rb.getString("user"));
            connectionProps.put("password", rb.getString("password"));
            this.con = DriverManager.getConnection(rb.getString("host"), connectionProps);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MySQLModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void closeConeection() throws SQLException {
        stmt.close();
        con.close();
    }
    
    //Acceso a Base de Datos para obtención de saludo.
    private String selectGreeting(){
        String greeting=null;
        
        try{
            String query="SELECT FRASE FROM SALUDO WHERE ID IN(SELECT ID FROM PAIS WHERE IDIOMA = 'CASTELLANO')";
            
            this.openConnection();
        
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
            greeting=rs.getString("FRASE");           
            }
            
            rs.close();
            
            this.closeConeection();
            
        }catch(SQLException e){
            System.out.println("Error en consulta.");
        }
   
        return greeting;
    }
    
    
    
    @Override
    public String getGreeting() {
        return this.selectGreeting();
    }
    
  
    
    
    
}
