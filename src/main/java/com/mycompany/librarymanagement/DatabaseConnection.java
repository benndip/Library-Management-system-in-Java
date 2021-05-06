/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author benndip
 */
public class DatabaseConnection {
    
    Connection connection;
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "postgres";
    String password = "";
    
    public Connection dbConnection(){
        
        try {
                Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        try {
            DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "connected");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed to connect");
        }
        return connection;
    }
    
    public static void main(String[] args){
        DatabaseConnection db = new DatabaseConnection();
        db.dbConnection();
    }
    
}
